package com.example.mall.service;

import com.example.mall.dto.ProductRequest;
import com.example.mall.model.Product;

public interface ProductService {

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);

    void deleteProductById(Integer productId);
}
