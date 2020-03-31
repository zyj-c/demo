package com.zyj;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.zyj.bean.Food;
import com.zyj.repository.FoodRepository;

@SpringBootTest
class FoodApplicationTests {

	@Resource
	private FoodRepository foodRepository;
	
	/**
	 * 添加food
	 */
	@Test
	void saveFood() {
//		创建一个实体类集合
		List<Food> foodList = new ArrayList<>();
		foodList.add(new Food(0, "水煮肉片", 20));
		foodList.add(new Food(0, "泡椒凤爪", 22));
//	       存入数据库
		foodRepository.saveAll(foodList);
		System.out.println("save ok!");
	}
    
	/**
	 * 查出所有的食物
	 */
	@Test
	void selectAll() {
//		查出所有食物
		List<Food> foodList = (List<Food>) foodRepository.findAll();
//		遍历所有食物
		for(Food food : foodList) {
			System.out.println(food);
		}
	}
	
	/**
	 * 删除菜品记录
	 */
	@Test
	void deleteById() {
		foodRepository.deleteById(1);
		System.out.println("delete ok!");
	}
	
	/**
	 * 修改菜品
	 */
	@Test
	void updateFood() {
		foodRepository.save(new Food(2, "香菜牛肉", 27.9));
		System.out.println("update ok!");
	}
}
