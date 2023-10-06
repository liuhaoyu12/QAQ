package com.sky.mapper;

import com.sky.entity.Orders;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OrderMapper {
    @Insert(value = "insert into orders"+
            " values"
            + "(#{id},#{number},#{status},#{userId},#{address},#{order_time},#{checkout_time}"+
            ",#{pay_method},#{pay_status},#{amount},#{remark},#{phone},#{address},#{userId}"+
            ",#{userName},#{consignee},#{cancelReason},#{rejectionReason},#{cancelTime}"+
            ",#{estimated_delivery_time},#{delivery_status},#{delivery_time},#{pack_amount}"+
            ",#{tableware_number},#{tableware_status})")
    void insert(Orders order);
}
