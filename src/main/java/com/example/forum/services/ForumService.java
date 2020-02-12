package com.example.forum.services;

import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface ForumService<T> extends CrudRepository<T, Long> {
    Optional<T> findByUser(T user);
}
