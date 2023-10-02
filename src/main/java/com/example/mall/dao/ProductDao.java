package com.example.mall.dao;

import com.example.mall.dto.ProductRequest;
import com.example.mall.model.Product;

public interface ProductDao {

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);

    void deleteProductById(Integer productId);
}
