package com.sky.service;
import com.sky.dto.DishDTO;

public interface DishService {

    /**
     * 新增菜品和对应口味
     * @param dishDTO
     */
    void saveWithFlavor(DishDTO dishDTO);
}
