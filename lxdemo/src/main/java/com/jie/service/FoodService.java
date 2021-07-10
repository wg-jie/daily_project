package com.jie.service;

import com.jie.dao.Food;

import java.util.List;

public interface FoodService {
    public List<Food> findall();

    public Food findOneFood(Integer id);

    public int insertFood(Food food);

    public int updateFood(Food food);

    public int deletFood(Integer id);
}
