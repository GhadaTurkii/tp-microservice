package tn.itbs.inventaire.entities;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.OneToMany;

@Entity
public class Article {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nom;
    private Double prixU;
    private Integer qte;

    private int factureId;

    @Transient
	private Facture facture;	
	
	@OneToMany(mappedBy = "article")
	private List<Facture> ListTaches = new ArrayList<>();
}
