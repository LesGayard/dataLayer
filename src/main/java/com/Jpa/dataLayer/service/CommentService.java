package com.Jpa.dataLayer.service;

import com.Jpa.dataLayer.model.Comment;
import com.Jpa.dataLayer.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommentService {

    @Autowired
    CommentRepository commentRepository;

    public Iterable<Comment> getComments(){
        return this.commentRepository.findAll();
    }
}
