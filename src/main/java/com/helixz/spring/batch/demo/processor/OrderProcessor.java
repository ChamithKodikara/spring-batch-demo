package com.helixz.spring.batch.demo.processor;

import com.helixz.spring.batch.demo.entity.Order;
import lombok.extern.slf4j.Slf4j;
import org.springframework.batch.item.ItemProcessor;

import java.time.Instant;
import java.time.ZoneId;


/**
 * @author Chamith
 */
@Slf4j
public class OrderProcessor implements ItemProcessor<Order, Order> {

    @Override
    public Order process(Order order) throws Exception {
        Order processedOrder = new Order();
        processedOrder.setOrderRef(order.getOrderRef());
        processedOrder.setAmount(order.getAmount());
        processedOrder.setNote(order.getNote());
        processedOrder.setOrderDate(Instant.ofEpochMilli(order.getTempOrderDate().getTime())
                .atZone(ZoneId.systemDefault()).toLocalDateTime());
        return processedOrder;
    }
}
