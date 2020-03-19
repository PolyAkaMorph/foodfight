package ru.foodfight.service;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.jdbc.SqlConfig;
import org.springframework.test.context.junit4.SpringRunner;
import org.slf4j.Logger;
import ru.foodfight.model.User;


import static org.slf4j.LoggerFactory.getLogger;

@ContextConfiguration({
        "classpath:spring/spring-app.xml",
        "classpath:spring/spring-db.xml"
})
@RunWith(SpringRunner.class)
@Sql(scripts = "classpath:/db/populate.sql", config = @SqlConfig(encoding = "UTF-8"))
public class UserServiceTest {
    private static final Logger log = getLogger("result");


    @Autowired
    UserService userService;

    @Test
    public void getOne() {
        User user = userService.get(UserServiceTestUtils.START_SEQ);
        Assert.assertNotNull(user);
        Assert.assertTrue(UserServiceTestUtils.compare(user, UserServiceTestUtils.user1));
    }
}