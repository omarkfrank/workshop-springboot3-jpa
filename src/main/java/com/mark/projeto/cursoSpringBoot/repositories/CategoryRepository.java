package com.mark.projeto.cursoSpringBoot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mark.projeto.cursoSpringBoot.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
