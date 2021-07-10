package com.jie.service;

import com.jie.dao.Food;
import com.jie.model.FoodMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FoodServiceImpl implements FoodService {
    @Autowired
    private FoodMapper foodMapper;
    @Override
    public List<Food> findall() {
        return foodMapper.findall();
    }

    @Override
    public Food findOneFood(Integer id) {
        return foodMapper.findOneFood(id);
    }

    @Override
    public int insertFood(Food food) {
        return foodMapper.insertFood(food);
    }

    @Override
    public int updateFood(Food food) {
        return foodMapper.updateFood(food);
    }

    @Override
    public int deletFood(Integer id) {
        return foodMapper.deletFood(id);
    }
}
