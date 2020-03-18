package ru.foodfight;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.foodfight.model.User;
import ru.foodfight.repository.UserRepository;
import ru.foodfight.service.UserService;

public class Main {
    static Logger logger = LoggerFactory.getLogger(Main.class);
    public static void main(String[] args) {
        logger.info("meow");

        ConfigurableApplicationContext appCtx = new ClassPathXmlApplicationContext(
                "spring/spring-app.xml",
                                "spring/spring-db.xml",
                "persistence.xml");
        UserService userService = appCtx.getBean(UserService.class);
        User user = userService.get(10000);
        System.out.println(user);
        UserRepository userRepository = appCtx.getBean(UserRepository.class);
        if (null == user) {
            System.out.println("meow");
        }

        System.out.println("hi");
    }
}
