package com.Jpa.dataLayer.repository;

import com.Jpa.dataLayer.model.Comment;
import org.springframework.data.repository.CrudRepository;

public interface CommentRepository extends CrudRepository<Comment,Integer> {
}
