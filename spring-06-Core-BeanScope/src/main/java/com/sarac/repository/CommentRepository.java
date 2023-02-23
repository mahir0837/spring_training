package com.sarac.repository;

import com.sarac.model.Comment;

public interface CommentRepository {
    void storeComment(Comment comment);
}
