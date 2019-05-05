package com.toyshare.service;

import com.toyshare.entity.Todo;
import com.toyshare.repository.TodoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

@RequiredArgsConstructor
public class TodoService {
    @Autowired
     TodoRepository todoRepository;

    public List<Todo> findAll() {
        return todoRepository.findAll();
    }

    public List<Todo> saveAll(List<Todo> todos) {
        return todoRepository.saveAll(todos);
    }
}
