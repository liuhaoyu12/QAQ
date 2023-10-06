package com.sky.mapper;

import com.sky.entity.Dish;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface DishMapper {

    /**
     * 根据分类id查询菜品数量
     * @param categoryId
     * @return
     */
    @Select("select count(id) from dish where category_id = #{categoryId}")
    Integer countByCategoryId(Long categoryId);
    List<Dish> list(Dish dish);
    @Select("select * from dish where category_id=#{catelogId}")
    List<Dish> selectBycatelogId(Long catelogId);
    @Insert("INSERT INTO dish (name, category_id, price, image, description, status) " +
            "VALUES (#{name}, #{categoryId}, #{price}, #{image}, #{description}, #{status})")
    void saveWithFalvor(Dish dish);
}
