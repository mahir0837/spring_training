package com.sarac;

import com.sarac.config.CommentConfig;
import com.sarac.model.Comment;
import com.sarac.service.CommentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CommentApp {

    public static void main(String[] args) {
        Comment comment=new Comment();
        comment.setAuthor("Johnson");
        comment.setText("Spring Framework");

        ApplicationContext container=new AnnotationConfigApplicationContext(CommentConfig.class);

        CommentService cs1=container.getBean(CommentService.class);
        CommentService cs2=container.getBean(CommentService.class);
        System.out.println(cs1);
        System.out.println(cs2);
        System.out.println(cs1==cs2);//If we can do singleton it will give us same bean but prototype annotation it will give us new Bean.
    }

}
