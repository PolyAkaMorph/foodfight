package ru.foodfight;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.foodfight.repository.RestaurantRepository;
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

        RestaurantRepository restaurantRepository = appCtx.getBean(RestaurantRepository.class);
        System.out.println(restaurantRepository.findById(10002).orElse(null).getName());
    }
}
