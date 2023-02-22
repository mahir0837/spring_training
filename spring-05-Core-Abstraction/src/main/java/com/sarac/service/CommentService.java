package com.sarac.service;

import com.sarac.model.Comment;
import com.sarac.proxy.CommentNotificationProxy;
import com.sarac.repository.CommentRepository;
import org.springframework.stereotype.Component;

@Component
public class CommentService {


    private final CommentRepository commentRepository;
    private final CommentNotificationProxy commentNotificationProxy;

    public CommentService(CommentRepository commentRepository, CommentNotificationProxy commentNotificationProxy) {
        this.commentRepository = commentRepository;
        this.commentNotificationProxy = commentNotificationProxy;
    }

    public void publishComment(Comment comment){
        //Save in the database
        //Send email
        commentRepository.storeComment(comment);
        commentNotificationProxy.sendComment(comment);
    }
}
