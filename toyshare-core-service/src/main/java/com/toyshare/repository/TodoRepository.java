package com.toyshare.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.toyshare.entity.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long> {
}
