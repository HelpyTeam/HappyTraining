package controllers;

import models.User;
import models.UserRepository;
import play.data.FormFactory;
import play.libs.concurrent.HttpExecutionContext;
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

    public Result welcome(){ return ok( views.html.welcome.render()); }

    public CompletionStage<Result> authentication(){
        User user = formFactory.form(User.class).bindFromRequest().get();
        session("USERNAME", user.username);
        return userRepository.login(user).thenApplyAsync(u -> {
            return redirect("/welcome");
        }, ec.current());
    }

}