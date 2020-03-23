package ru.foodfight;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.transaction.annotation.Transactional;
import ru.foodfight.model.User;
import ru.foodfight.model.Vote;
import ru.foodfight.repository.UserRepository;
import ru.foodfight.service.UserService;
import ru.foodfight.service.VoteService;

import java.util.Optional;

public class Main {
    static Logger logger = LoggerFactory.getLogger(Main.class);
    public static void main(String[] args) {
        logger.info("meow");

        ConfigurableApplicationContext appCtx = new ClassPathXmlApplicationContext(
                "spring/spring-app.xml",
                                "spring/spring-db.xml");
        VoteService voteService = appCtx.getBean(VoteService.class);
//        Vote vote = voteService.get(10002);

        UserService userService = appCtx.getBean(UserService.class);
        User user = userService.get(10000);

        System.out.println(user);
//        System.out.println(vote.getVoteTime());
    }
}
