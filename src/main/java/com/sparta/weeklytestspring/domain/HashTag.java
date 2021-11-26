package com.sparta.weeklytestspring.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class HashTag {

    @Id
    private Long id;
    private String content;

    @ManyToOne
    @JoinColumn(name = "article_idx")
    private Article article;

    public Article getArticle() {
        return article;
    }

    public void setArticle(Article article) {
        this.article = article;
    }
}
