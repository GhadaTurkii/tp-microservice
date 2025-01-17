package tn.itbs.inventaire.entities;

import org.springframework.data.annotation.Id;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.ManyToOne;

@Entity
public class Facture {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int somme;
	private String entreprise;
	
	@ManyToOne
    private Article article;
		
}
