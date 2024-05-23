package com.mark.projeto.cursoSpringBoot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mark.projeto.cursoSpringBoot.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
