package test.service.impl;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;
import test.beans.User;

import javax.annotation.Resource;
import java.util.function.Consumer;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceTest {

    private static final Logger LOG = LogManager.getLogger(UserServiceTest.class);

    @Resource
    private UserServiceImpl userServiceImpl;

    @Test
    public void shouldAddUser() {
        userServiceImpl.createUser("name", "email", "pass");
        userServiceImpl.findUserById(1).ifPresent(new Consumer<User>() {
            @Override
            public void accept(User user) {
                Assert.assertEquals("name", user.getName());
                LOG.info("UserName " + user.getName());
            }
        });

        LOG.info("All Users " + userServiceImpl.findAllUsers().size() );
    }



}
