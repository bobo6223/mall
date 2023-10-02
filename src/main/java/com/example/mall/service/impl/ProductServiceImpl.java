package com.example.mall.service.impl;

import com.example.mall.dao.ProductDao;
import com.example.mall.dto.ProductRequest;
import com.example.mall.model.Product;
import com.example.mall.service.ProductService;
import org.springframework.stereotype.Component;

@Component
public class ProductServiceImpl implements ProductService {

    private final ProductDao productDao;

    public ProductServiceImpl(ProductDao productDao) {
        this.productDao = productDao;
    }

    @Override
    public Product getProductById(Integer productId) {
        return productDao.getProductById(productId);
    }

    @Override
    public Integer createProduct(ProductRequest productRequest) {
        return productDao.createProduct(productRequest);
    }
}
