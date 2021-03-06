
package com.kodilla.ecommercee.domain;

import com.kodilla.ecommercee.domain.Cart;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


@Transactional
@Repository
public interface CartDao extends CrudRepository<Cart, Integer> {

    Cart findById(int id);
}