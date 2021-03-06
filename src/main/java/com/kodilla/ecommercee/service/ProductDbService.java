package com.kodilla.ecommercee.service;

import com.kodilla.ecommercee.domain.Product;
import com.kodilla.ecommercee.domain.ProductDao;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ProductDbService {

    private final ProductDao productDao;

    public List<Product> getAllProducts() {
        return productDao.findAll();
    }

    public Product findProductById(int productId) {
        return productDao.findById(productId);
    }

    public Product findProductByName(String productName) {
        return productDao.findByProductName(productName);
    }

    public Product saveProduct(Product product) {
        return productDao.save(product);
    }

    public void deleteProduct(int productId) {
        productDao.deleteById(productId);
    }
}