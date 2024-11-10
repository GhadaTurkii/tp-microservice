package tn.itbs.article.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tn.itbs.article.entities.Article;
import tn.itbs.article.service.ArticleService;

@RestController
// this mapping is optional we used it only if we have several entities
@RequestMapping("/article")
public class ArticleController {

    @Autowired
    private ArticleService articleService;

    @GetMapping("/byid/{id}")
    public Optional<Article> getAllArticles(@PathVariable int id) {
        return articleService.chercherArticleParIdA(id);
    }

   
}
