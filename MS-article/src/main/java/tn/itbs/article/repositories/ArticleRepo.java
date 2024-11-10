package tn.itbs.article.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tn.itbs.article.entities.Article;

@Repository
public interface ArticleRepo extends JpaRepository<Article, Integer>{

}
