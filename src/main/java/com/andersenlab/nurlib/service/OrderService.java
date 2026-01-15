package com.andersenlab.nurlib.service;

import com.andersenlab.nurlib.dto.request.OrderRequestDto;
import com.andersenlab.nurlib.entity.Order;
import com.andersenlab.nurlib.enums.OrderStatus;

import java.util.List;

public interface OrderService {

    Order getOrderById(Long id);

    List<Order> getAllOrders();

    String makeOrder(OrderRequestDto dto);

    Order changeOrderStatus(Long id, OrderStatus status);

    Order updateOrder(Long id, OrderRequestDto dto);

    boolean cancelOrder(Long id, String reason);
}
