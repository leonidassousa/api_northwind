package br.senac.go.northwind.model;

import jakarta.persistence.*;

import java.math.BigDecimal;

//FORMA 03
@Entity
public class OrderProduct {

    @EmbeddedId
    OrderProductKey id;

    @ManyToOne
    @MapsId("productId")
    @JoinColumn(name = "product_id")
    Product product;

    @ManyToOne
    @MapsId("orderId")
    @JoinColumn(name = "order_id")
    Order order;

    private BigDecimal discount;
}
