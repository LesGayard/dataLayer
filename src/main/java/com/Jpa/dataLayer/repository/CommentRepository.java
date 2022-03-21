package com.Jpa.dataLayer.repository;

import com.Jpa.dataLayer.model.Comment;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface CommentRepository extends CrudRepository<Comment,Integer> {

    /*La recherche des commentaires :dont le contenu contient le mot “déçu”.*/
    @Query("SELECT * FROM  commentaire WHERE contenu = déçu :contenu")
    public Iterable<Comment>findBySpecialName(@Param ("contenu") String content);
}
