package com.sky.service;

import com.sky.dto.DishDTO;
import com.sky.entity.Dish;
import org.springframework.stereotype.Service;

import java.util.List;

public interface DishService {
    public List<Dish> list(Long categoryId);
    List<Dish> selectDishBycatelogId(Long catelogId);

    void saveWithFlavor(Dish dishDTO);
}
