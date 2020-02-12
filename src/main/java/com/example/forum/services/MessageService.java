package com.example.forum.services;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

//TODO: replace T with  MessageDTO
@Service
public interface MessageService<T> extends CrudRepository<T,Long> {
    /**
     * get the message identified by idMessage as a quoted message
     * @param idMessage
     * @return
     */
    String getMessageAsQuote(long idMessage);
    /**
     * insert image in a message
     */
    void insertImage(long idMessage,String urlImage);
}
