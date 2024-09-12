package com.xworks.amazon.amazon.impl;

import com.xworks.amazon.amazon.Amazon;
import com.xworks.amazon.product.Product;

public class AmazonImpl implements Amazon {
    Product product[]={null,null,null};
    public int index;
    @Override
    public boolean addProduct(Product product) {
        System.out.println("Product adding to cart");
        boolean isAdded=false;
        if(product!=null){
            if(product.getProductName()!=null){
                this.product[index++]=product;
                isAdded=true;
            }else System.out.println("Item cannot be added");
        }else System.out.println("Out of stock");
        System.out.println("Product added to cart");
        return isAdded;
    }

    @Override
    public void getProductDetails() {
        System.out.println("fetching details");
        for(Product product:product) {
            System.out.println(product);
        }
        System.out.println("details fetched");
    }

    @Override
    public boolean updateItem(double price) {
        System.out.println("update started");
            boolean isItemUpdated=false;
           // product.setPrice( price);
           // isItemUpdated=true;
       // System.out.println("updated");
       // if(price >0){
         //   this.product.setPrice(price);
      //  }
            return isItemUpdated;
    }

    @Override
    public boolean deleteProduct() {
        this.product=null;
        return false;
    }
}
