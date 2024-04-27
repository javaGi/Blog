package com.blog.service;


import com.blog.payload.CommentDto;
import org.w3c.dom.stylesheets.LinkStyle;

import java.util.List;


public interface CommentService {
    public CommentDto createComment(long postId, CommentDto commentDto);


    List<CommentDto> getCommentsByPostId(long postId);

    void deleteComment(long commentId);

    List<CommentDto> getAllComments();

//update method
    CommentDto updateComment(long commentId, CommentDto commentDto);
}
