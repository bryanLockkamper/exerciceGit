package com.example.forum.services;

import org.springframework.data.repository.CrudRepository;

// TODO: replace T with UserDTO when updated
public interface UserService<T,Long> extends CrudRepository<T,Long> {
    /**
     * log the user in and returns connection token
     *
     * @return
     */
    String loginUser();

    /**
     * Log the user out
     */
    void logoutUser();

    /**
     * get all posted messages by user
     * @return
     */
    // TODO: replace Object with List<MessageDTO>
    Object getUserPostedMessage();

    /**
     * get the user messages count
     * @param userId
     *
     * @return
     */
    long getUserMessageCount(long userId);

    /**
     * delete all posted message on every forum by user
     * @param userId
     */
    void deleteAllMessages(long userId);

    /**
     * delete message on the specified forum
     * @param userId
     * @param forum
     */
    void deleteAllMessagesOnForum(long userId,Object forum);
}

