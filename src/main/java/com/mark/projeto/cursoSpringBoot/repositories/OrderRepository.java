package com.mark.projeto.cursoSpringBoot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mark.projeto.cursoSpringBoot.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
