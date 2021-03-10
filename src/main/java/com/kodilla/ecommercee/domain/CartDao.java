package com.kodilla.ecommercee.domain;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Transactional
@Repository
public interface CartDao extends CrudRepository<Cart, Integer> {

    Cart findById(int id);

    List<Product> getProducts();

    void addProduct(Product product);

    void deleteProduct(Product product);

    Order createNewOrder(int orderId);

}
