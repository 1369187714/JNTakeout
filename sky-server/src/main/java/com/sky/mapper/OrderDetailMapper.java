package com.sky.mapper;

import com.sky.entity.OrderDetail;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface OrderDetailMapper {
    void insertBatch(List<OrderDetail> orderDetails);

    @Select("select * from order_detail where order_id = #{order_id};")
    List<OrderDetail> getByOrderId(Long orderId);
}
