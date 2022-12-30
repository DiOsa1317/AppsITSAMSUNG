package com.samsung.cw271222.service;

import com.samsung.cw271222.model.Product;
import com.samsung.cw271222.model.Store;

public class StoreServiceImpl implements StoreService{
    private Product[] products;
    public StoreServiceImpl() {
        products.Store.getProducts();
    }

    @Override
    public Product[] getAll() {

        }

    @Override
    public Product getProductByName(String name) {
        for(int i=0; i< Store.getSize(); i++) {
            public boolean saveProduct(Product product){

            }
            if (products[i].getName().equals(name))
                return products[i];
        }
        return null;
        }
    }
}

