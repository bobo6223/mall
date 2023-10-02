package com.example.mall.dao;

import com.example.mall.dto.ProductRequest;
import com.example.mall.model.Product;

public interface ProductDao {

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);
}
