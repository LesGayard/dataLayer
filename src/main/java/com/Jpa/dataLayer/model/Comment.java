package com.Jpa.dataLayer.model;

import javax.persistence.*;

@Entity
@Table (name = "commentaire")
public class Comment {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private int commentId;

    @Column (name = "contenu")
    private String content;

    @Column (name = "produit")
    private String productId;

    public Comment() {
    }

    public Comment(int commentId, String content, String productId) {
        this.commentId = commentId;
        this.content = content;
        this.productId = productId;
    }

    public int getCommentId() {
        return commentId;
    }

    public void setCommentId(int commentId) {
        this.commentId = commentId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }
}
