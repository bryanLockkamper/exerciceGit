package com.example.forum.services;

import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface ForumService<T> extends CrudRepository<T, Long> {
    List<T> findByCreator(Object user);
    List<T> findByCreationDate(String date);
    Optional<T> findByName(String name);
}
