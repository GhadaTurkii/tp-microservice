package tn.itbs.article.entities;

import org.springframework.data.annotation.Id;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.Data;

@Data
public class Facture {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int somme;
	private String entreprise;
}
