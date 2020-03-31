package com.zyj.repository;

import org.springframework.data.repository.CrudRepository;

import com.zyj.bean.Food;

public interface FoodRepository extends CrudRepository<Food, Integer> {

}
