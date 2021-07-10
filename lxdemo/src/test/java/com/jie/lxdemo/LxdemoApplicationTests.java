package com.jie.lxdemo;

import com.jie.dao.Food;
import com.jie.model.FoodMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import java.util.List;
@RunWith(SpringRunner.class)
@SpringBootTest
public class LxdemoApplicationTests {
    @Autowired
    private FoodMapper foodMapper;

    @Test
    public void contextLoads() {
        List<Food> list = foodMapper.findall();
        System.out.println(list);
    }

}
