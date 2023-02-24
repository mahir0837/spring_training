package com.sarac.proxy;

import com.sarac.model.Comment;

public interface CommentNotificationProxy {
    void sendComment(Comment comment);
}
