package com.sarac.service;

import com.sarac.config.AppConfigData;
import com.sarac.config.DBConfigData;
import com.sarac.model.Comment;
import com.sarac.proxy.CommentNotificationProxy;
import com.sarac.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class CommentService {


    private final CommentRepository commentRepository;
    private final CommentNotificationProxy commentNotificationProxy;
    private final AppConfigData appConfigData;
    private final DBConfigData dbConfigData;

    public CommentService(CommentRepository commentRepository, @Qualifier("EMAIL") CommentNotificationProxy commentNotificationProxy, AppConfigData appConfigData, DBConfigData dbConfigData) {
        this.commentRepository = commentRepository;
        this.commentNotificationProxy = commentNotificationProxy;
        this.appConfigData = appConfigData;
        this.dbConfigData = dbConfigData;
    }

    public void publishComment(Comment comment){
        //Save in the database
        //Send email
        commentRepository.storeComment(comment);
        commentNotificationProxy.sendComment(comment);
    }
    public void prinConfigData(){
        //print Mahir
        //print abc123
        //print url
        System.out.println("username: "+appConfigData.getUserName());
        System.out.println("password: "+appConfigData.getPassword());
        System.out.println("url: "+appConfigData.getUrl());
    }
    public void printDBConfigData(){
        System.out.println("username = " + dbConfigData.getUsername());
        System.out.println("password = " + dbConfigData.getPassword());
        System.out.println("type = " + dbConfigData.getType());
    }
}
