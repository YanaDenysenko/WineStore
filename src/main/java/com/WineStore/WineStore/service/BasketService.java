package com.WineStore.WineStore.service;

import com.WineStore.WineStore.dto.BasketDto;
import com.WineStore.WineStore.dto.CustomerDto;
import com.WineStore.WineStore.model.Basket;

import java.util.List;

public interface BasketService {
    Basket getCurrentBasketByCustomer(CustomerDto customerDto);
    Basket getBasketById(Long id);
}
