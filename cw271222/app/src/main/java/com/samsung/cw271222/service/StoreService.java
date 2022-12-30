package com.samsung.cw271222.service;

import com.samsung.cw271222.model.Product;

public interface StoreService {
    Product[] getAll();
    boolean saveProduct(Product product);
    Product getProductByName(String name);
}
