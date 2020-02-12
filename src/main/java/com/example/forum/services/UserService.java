package com.example.forum.services;

import org.springframework.data.repository.CrudRepository;

// TODO: replace T with UserDTO when updated
public interface UserService<T,Long> extends CrudRepository<T,Long> {
    void loginUser();
    void logoutUser();
    Object getUserPostedMessage();
    long getUserMessageCount();
    void deleteAllMessages();
    void deleteAllMessagesOnForum(Object forum);
}

