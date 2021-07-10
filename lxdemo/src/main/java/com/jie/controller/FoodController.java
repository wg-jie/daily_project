package com.jie.controller;

import com.jie.dao.Food;
import com.jie.service.FoodService;
import com.jie.util.AjaxResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.util.List;

@Controller
public class FoodController {
    @Autowired
    private FoodService foodServiceImpl;

    //查询全部信息
    @RequestMapping("/")
    public String foodsAll(ModelMap map) {
        List<Food> foodList = foodServiceImpl.findall();
        map.put("foods", foodList);
        return "/page/index";
    }

    //去添加商品
    @RequestMapping("/toinsert")
    public String toAddFood() {
        return "/page/insert";
    }

    //添加商品
    @RequestMapping("/insert")
    @ResponseBody
    public Object insertFood(@RequestParam("name") String name) {
        Food food = new Food();
        food.setName(name);
        food.setStarttime(new Date());
        int i = foodServiceImpl.insertFood(food);

        if (i > 0) {
            return new AjaxResult("1000", "添加成功", i);
        } else {
            return new AjaxResult("1001", "插入失败");
        }

    }

    //去修改界面
    @RequestMapping("/toupdate")
    public String toUpdate(@RequestParam("id") Integer id, ModelMap map) {
        Food oneFood = foodServiceImpl.findOneFood(id);
        map.put("food", oneFood);
        return "/page/edit";
    }

    //修改界面
    @RequestMapping("/update")
    @ResponseBody
    public Object updateFood(@RequestParam("id") Integer id, @RequestParam("name") String name) {
        Food food = new Food();
        food.setId(id);
        food.setName(name);
        food.setStarttime(new Date());
        int i = foodServiceImpl.updateFood(food);
        if (i > 0) {
            return new AjaxResult("1000", "修改成功");
        } else {
            return new AjaxResult("1001", "修改失败");
        }

    }

    //删除
    @RequestMapping("/delete")
    public Object delete(@RequestParam("id") Integer id) {
        foodServiceImpl.deletFood(id);
        return "redirect:/";
    }
}

