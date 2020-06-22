package com.in28minutes.rest.webservices.restfulwebservices.services;

import com.in28minutes.rest.webservices.restfulwebservices.todo.Todo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TodoJpaRepository extends JpaRepository<Todo, Long> {

    List<Todo> findByUsername(String username);
}
