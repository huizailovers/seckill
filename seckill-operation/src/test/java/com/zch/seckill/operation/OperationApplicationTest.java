package com.zch.seckill.operation;

import com.zch.seckill.operation.infrastructure.mapper.UserMapper;
import com.zch.seckill.operation.infrastructure.po.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author zhangchunhui
 * @date 2021/10/11
 */
@SpringBootTest
public class OperationApplicationTest {

    @Resource
    private UserMapper userMapper;

    @Test
    public void testSelect() {
        System.out.println(("----- selectAll method test ------"));
        List<User> userList = userMapper.selectList(null);
        Assertions.assertEquals(5, userList.size());
        userList.forEach(System.out::println);
    }

}
