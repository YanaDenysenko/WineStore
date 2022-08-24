package com.WineStore.WineStore.mapper.impl;

import com.WineStore.WineStore.dto.OrderStatusCreateDto;
import com.WineStore.WineStore.mapper.Mapper;
import com.WineStore.WineStore.model.OrderStatus;
import org.springframework.stereotype.Component;

@Component
public class OrderStatusCreateMapper implements Mapper<OrderStatus, OrderStatusCreateDto> {

    @Override
    public OrderStatusCreateDto mapToDto(OrderStatus orderStatus) {
        return null;
    }

    @Override
    public OrderStatus mapToModel(OrderStatusCreateDto orderStatusCreateDto) {
        OrderStatus orderStatus = new OrderStatus();
        orderStatus.setName(orderStatusCreateDto.getName());
        return orderStatus;
    }
}
