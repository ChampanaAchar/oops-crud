package com.xworks.amazon.amazon;

import com.xworks.amazon.product.Product;

public interface Amazon {
    boolean addProduct(Product product);
    void getProductDetails();
    boolean updateItem(double price);
    boolean deleteProduct();

}
