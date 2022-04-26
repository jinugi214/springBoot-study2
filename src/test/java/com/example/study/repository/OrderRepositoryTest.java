package com.example.study.repository;

import com.example.study.StudyApplicationTests;
import com.example.study.model.entity.OrderDetail;
import com.example.study.model.entity.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDateTime;
import java.util.Optional;

public class OrderRepositoryTest extends StudyApplicationTests {

    @Autowired
    private OrderDetailRepository orderDetailRepository;

    @Test
    public void create(){
        OrderDetail orderDetail = new OrderDetail();

        //orderDetail.setUserId(1L);

        //orderDetail.setItemId(1L);

        OrderDetail newOrderDetail = orderDetailRepository.save(orderDetail);

        Assertions.assertNotNull(newOrderDetail);
    }

    @Test
    public void delete() {
        Optional<OrderDetail>  orderDetail = orderDetailRepository.findById(1L);

        Assertions.assertTrue(orderDetail.isPresent()); // true

        orderDetail.ifPresent(selectOrder -> {
            orderDetailRepository.delete(selectOrder);
        });

        Optional<OrderDetail> deleteUser = orderDetailRepository.findById(1L);

        Assertions.assertFalse(deleteUser.isPresent()); // false

    }
}
