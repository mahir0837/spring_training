package com.sarac;

import com.sarac.model.Comment;
import com.sarac.service.CommentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class saracApplication {

    public static void main(String[] args) {

        Comment comment=new Comment();
        comment.setAuthor("Johnson");
        comment.setText("Spring Framework");

      ApplicationContext container= SpringApplication.run(saracApplication.class, args);
        CommentService commentService=container.getBean(CommentService.class);
        commentService.publishComment(comment);
    }

}
