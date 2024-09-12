package com.xworks.amazon.product;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString

public class Product {
    private int productId;
    private String productName;
    private double price;
    private String bookingDate;
    private String paymentMode;

}
