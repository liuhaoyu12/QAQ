package com.sky.mapper;

import com.sky.entity.ShoppingCart;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface ShoppingCartMapper {
    @Select("select * from shopping_cart where id=#{shppingCart.id}")
    List<ShoppingCart> list(ShoppingCart shoppingCart);
    @Delete("delete from shopping_cart where id=#{id}")
    void deleteByUserId(Long id);
}
