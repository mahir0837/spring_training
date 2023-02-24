package com.sarac.repository;

import com.sarac.model.Comment;
import org.springframework.stereotype.Component;

@Component
public class DBCommentRepository implements CommentRepository{

    @Override
    public void storeComment(Comment comment) {
        System.out.println("Storing comment:"+comment.getAuthor());
    }
}
