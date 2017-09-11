package models;

import play.db.jpa.JPAApi;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import java.util.List;
import java.util.concurrent.CompletionStage;
import java.util.function.Function;
import java.util.stream.Stream;

import static java.util.concurrent.CompletableFuture.supplyAsync;

public class JPAUserRepository implements UserRepository{

    private final JPAApi jpaApi;
    private final DatabaseExecutionContext executionContext;

    @Inject
    public JPAUserRepository(JPAApi jpaApi, DatabaseExecutionContext executionContext){
        this.jpaApi = jpaApi;
        this.executionContext = executionContext;
    }

    @Override
    public CompletionStage<Stream<User>> list() { return supplyAsync(() -> wrap(em -> list(em)), executionContext); }

    @Override
    public CompletionStage<User> add(User user) {
        return supplyAsync(() -> wrap(em -> insert(em, user)), executionContext);
    }

    private User insert (EntityManager em, User user){
        em.persist(user);
        return user;
    }

    private <T> T wrap(Function<EntityManager, T> function) {
        return jpaApi.withTransaction(function);
    }

    private Stream<User> list(EntityManager em) {
        List<User> users = em.createQuery("select u from User u", User.class).getResultList();
        return users.stream();
    }

    private User getUser(EntityManager em, String username, String password){
        User user = em.createQuery("select u from User u " +
                "where u.username = " + username + " and  u.password = " + password).getSingleResult();
        return user;
    }

    @Override
    public CompletionStage<User> login() {

    }
}
