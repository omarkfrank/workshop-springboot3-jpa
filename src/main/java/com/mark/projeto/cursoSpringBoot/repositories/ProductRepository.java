package com.mark.projeto.cursoSpringBoot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mark.projeto.cursoSpringBoot.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
