package com.example.mall.service;

import com.example.mall.constant.ProductCategory;
import com.example.mall.dto.ProductRequest;
import com.example.mall.model.Product;

import java.util.List;

public interface ProductService {

    List<Product> getProducts(ProductCategory category,String search);

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);

    void deleteProductById(Integer productId);
}
