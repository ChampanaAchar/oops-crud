package com.xworks.amazon;

import com.xworks.amazon.amazon.Amazon;
import com.xworks.amazon.amazon.impl.AmazonImpl;
import com.xworks.amazon.product.Product;

public class AmazonRunner {
    public static void main(String[] args) {
        Product product=new Product();
        product.setProductId(987651);
        product.setProductName("Jacket");
        product.setPrice(800.00);
        product.setBookingDate("10-09-2024");
        product.setPaymentMode("COD");

        Product product1=new Product();
        product1.setProductId(651);
        product1.setProductName("Shoes");
        product1.setPrice(2800.00);
        product1.setBookingDate("10-09-2024");
        product1.setPaymentMode("online");

        Product product2=new Product();
        product2.setProductId(651);
        product2.setProductName("Shoes");
        product2.setPrice(2800.00);
        product2.setBookingDate("10-09-2024");
        product2.setPaymentMode("on;ine");


        Amazon amazon=new AmazonImpl();
        amazon.addProduct(product);
        amazon.addProduct(product1);
        amazon.addProduct(product2);

        amazon.getProductDetails();
       // amazon.updateItem(900);
      //  amazon.getProductDetails();

    }
}
