package ru.foodfight;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.foodfight.model.User;
import ru.foodfight.repository.UserRepository;
import ru.foodfight.service.UserService;

import java.util.Optional;

public class Main {
    static Logger logger = LoggerFactory.getLogger(Main.class);
    public static void main(String[] args) {
        logger.info("meow");

        ConfigurableApplicationContext appCtx = new ClassPathXmlApplicationContext(
                "spring/spring-app.xml",
                                "spring/spring-db.xml");
//        UserRepository userRepository = appCtx.getBean(UserRepository.class);
//        System.out.println("Found by getOne" + userRepository.getOne(10000));
        UserService userService = appCtx.getBean(UserService.class);
        System.out.println(userService.get(10000));
    }
}
