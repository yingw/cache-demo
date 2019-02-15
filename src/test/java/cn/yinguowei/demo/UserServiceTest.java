package cn.yinguowei.demo;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.assertThat;

/**
 * @author Yin Guo Wei 2019/1/27
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class UserServiceTest {

    @Autowired UserService userService;

    @Test
    public void saveOrUpdate() {
    }

    @Test
    public void findAll() {
        List<User> users = userService.findAll();
        assertThat(users, notNullValue());
        assertThat(users.size(), equalTo(5));
    }

    @Test
    public void findAllBatch() {
        for (int i = 0; i < 10; i++) {
            findAll();

        }
    }

    @Test
    public void delete() {
    }
}