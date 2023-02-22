package com.sarac;

import com.sarac.config.CommentConfig;
import com.sarac.model.Comment;
import com.sarac.service.CommentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.security.Provider;

public class CommentApp {

    public static void main(String[] args) {

        Comment comment=new Comment();
        comment.setAuthor("Johnson");
        comment.setText("Spring Framework");
        ApplicationContext container=new AnnotationConfigApplicationContext(CommentConfig.class);
        CommentService commentService=container.getBean(CommentService.class);
        commentService.publishComment(comment);
    }
}
