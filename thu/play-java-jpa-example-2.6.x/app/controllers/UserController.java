package controllers;

import models.User;
import models.UserRepository;
import play.core.j.HttpExecutionContext;
import play.data.FormFactory;
import play.mvc.Controller;
import play.mvc.Result;


import javax.inject.Inject;
import java.util.concurrent.CompletionStage;

public class UserController extends Controller {

    private final FormFactory formFactory;
    private final UserRepository userRepository;
    private final HttpExecutionContext ec;

    @Inject
    public UserController(FormFactory formFactory, UserRepository userRepository, HttpExecutionContext ec){
        this.formFactory = formFactory;
        this.userRepository = userRepository;
        this.ec = ec;
    }

    public Result index(){ return ok( views.html.login.render()); }

    public CompletionStage<Result> authentication(){
        User user = formFactory.form(User.class).bindFromRequest().get();
        return userRepository.login(user).thenApplyAsync(p -> {
            return redirect(routes.PersonController.index());
        }, ec.current());
    }
}
