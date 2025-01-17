package tn.itbs.article.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import tn.itbs.article.entities.Article;
import tn.itbs.article.entities.Facture;
import tn.itbs.article.feign.FactureFeign;
import tn.itbs.article.repositories.ArticleRepo;

public class ArticleService {

	@Autowired
    private ArticleRepo articleRepository;
	
	@Autowired
	private FactureFeign factureFeign;
	
    public List<Article> getAllArticles() {
        return articleRepository.findAll();
    }

    // in this method we implemented el feign client to return all articles
    public List<Article> getAllArticlesFeign() {
        List<Article> articles = articleRepository.findAll();
        articles.forEach(article -> {
            Facture facture = factureFeign.getAllInventaires(article.getFactureId());
            article.setFacture(facture);
        });
        return articles;
    }

    // we return an article object
    public Article chercherArticleParIdOA(Integer id) {
    	Article article = articleRepository.findById(id).get();
    	Facture facture = factureFeign.getAllInventaires(article.getFactureId());
    	article.setFacture(facture);
    	return article;
    }

    // we return an optional article -> this one is better cause we manage better the project (ifPresent...)
    public Optional<Article> chercherArticleParIdA(Integer id) {
        return articleRepository.findById(id);
    }
    
    public void ajouter(Article art) {
    	Facture fact = factureFeign.enregistrerFacture(art.getFacture());
    	art.setFactureId(fact.getId());
    	articleRepository.save(art);
    }
    
}
