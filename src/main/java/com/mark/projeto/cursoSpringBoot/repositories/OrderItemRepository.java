package com.mark.projeto.cursoSpringBoot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mark.projeto.cursoSpringBoot.entities.OrderItem;
import com.mark.projeto.cursoSpringBoot.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
