package com.sarac.proxy;

import com.sarac.model.Comment;
import org.springframework.stereotype.Component;

@Component
public class EmailCommentNotificayionProxy implements CommentNotificationProxy{
    @Override
    public void sendComment(Comment comment) {

        System.out.println("Sending notification for comment:"+comment.getText());
    }
}
