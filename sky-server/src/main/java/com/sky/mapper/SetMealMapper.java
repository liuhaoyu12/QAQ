package com.sky.mapper;

import com.github.pagehelper.Page;
import com.sky.annotation.AutoFill;
import com.sky.dto.SetmealDTO;
import com.sky.dto.SetmealPageQueryDTO;
import com.sky.entity.Setmeal;
import com.sky.entity.SetmealDish;
import com.sky.enumeration.OperationType;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface SetMealMapper {

    /**
     * 根据分类id查询套餐的数量
     * @param id
     * @return
     */
    @Select("select count(id) from setmeal where category_id = #{categoryId}")
    Integer countByCategoryId(Long id);

    /**
     * 新增套餐
     * @param setmealDTO 
     */
    @AutoFill(value = OperationType.INSERT)
    @Insert("insert into setmeal(name, category_id,price,status,description,image,create_time, update_time, create_user, update_user)" +
            " VALUES" +
            " (#{name},#{categoryId}, #{status}, #{price}, #{description}, #{image},#{createTime}, #{updateTime}, #{createUser}, #{updateUser})")
    void insert(Setmeal setmeal);
    Page<Setmeal> pageQuery(SetmealPageQueryDTO setmealPageQueryDTO);
    @Delete("DELETE FROM setmeal where name =#{name}")
    void deleteByName(String name);
    Long selectByName(String name);
    @Select("select *from setmeal where id=#{id}")
    Setmeal getById(Long id);
    @Delete("delete from setmeal where id = #{id}")
    void deleteById(Long setmealId);
    @AutoFill(value = OperationType.UPDATE)
    @Update("UPDATE Setmeal " +
            "SET categoryId = #{categoryId}, " +
            "name = #{name}, " +
            "price = #{price}, " +
            "status = #{status}, " +
            "description = #{description}, " +
            "image = #{image} " +
            "WHERE id = #{id}")
    void update(Setmeal setmeal);
}
