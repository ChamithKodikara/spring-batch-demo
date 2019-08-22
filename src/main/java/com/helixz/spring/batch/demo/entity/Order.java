package com.helixz.spring.batch.demo.entity;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Date;

/**
 * @author Chamith
 */
@Data
@Entity
@Table(catalog = "batch_demo_db", name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String orderRef;

    private BigDecimal amount;

    private LocalDateTime orderDate;

    private String note;

    @Transient
    private Date tempOrderDate;

}
