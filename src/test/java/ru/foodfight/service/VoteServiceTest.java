package ru.foodfight.service;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.jdbc.SqlConfig;
import org.springframework.test.context.junit4.SpringRunner;
import ru.foodfight.model.Vote;

import static org.slf4j.LoggerFactory.getLogger;

@ContextConfiguration({
        "classpath:spring/spring-app.xml",
        "classpath:spring/spring-db.xml"
})
@RunWith(SpringRunner.class)
@Sql(scripts = "classpath:/db/populate.sql", config = @SqlConfig(encoding = "UTF-8"))
public class VoteServiceTest {
    private static final Logger log = getLogger("result");

    @Autowired
    VoteService voteService;
    @Test
    public void getOne() {
        Vote vote = voteService.get(TestUtils.START_SEQ + 4);
        Assert.assertNotNull(vote);
        Assert.assertTrue(TestUtils.compare(vote, TestUtils.vote1));
    }

    @Test
    public void deleteOne() {
        voteService.delete(TestUtils.START_SEQ + 4);
        Assert.assertNull(voteService.get(TestUtils.START_SEQ + 4));
    }

}