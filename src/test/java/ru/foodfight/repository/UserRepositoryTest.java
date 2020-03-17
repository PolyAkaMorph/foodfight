package ru.foodfight.repository;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.jdbc.SqlConfig;
import org.springframework.test.context.junit4.SpringRunner;
import ru.foodfight.service.UserService;

import static org.junit.Assert.*;
import static org.slf4j.LoggerFactory.getLogger;

@ContextConfiguration({
        "classpath:spring/spring-app.xml",
        "classpath:spring/spring-db.xml"
})
@RunWith(SpringRunner.class)
@Sql(scripts = "classpath:/db/populate.sql", config = @SqlConfig(encoding = "UTF-8"))
public class UserRepositoryTest {
    private static final Logger log = getLogger("result");
    private static final Integer START_SEQ = 10000;

    @Autowired
    private UserRepository userRepository;


    @Test
    public void testingTest() throws Exception {
        Integer i1 = 1;
        Integer i2 = 1;
        log.info("started test");
        Assert.assertEquals("Asserting",i1, i2);
    }

    @Test
    public void checkIfUserExists() throws Exception {
        log.info("checkIfUserExists test");
        //Assert.assertNotNull(userRepository.findById(START_SEQ));
    }

}