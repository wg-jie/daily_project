package com.jie.model;

import com.jie.dao.Food;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;


import java.util.List;

@Mapper
public interface FoodMapper {
    @Select("select * from food")
    public List<Food> findall();

    //查询单行数据
    @Select("select * from food where id=#{id}")
    public Food findOneFood(Integer id);

    @Insert("insert into food(name,starttime)VALUES(#{name},#{starttime})")
    public int insertFood(Food food);


    public int updateFood(Food food);

    @Delete("delete from food where id=#{id}")
    public int deletFood(Integer id);
}
