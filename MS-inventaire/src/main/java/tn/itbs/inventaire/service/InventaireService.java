package tn.itbs.inventaire.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import tn.itbs.inventaire.entities.Facture;
import tn.itbs.inventaire.repositories.InventaireRepo;

public class InventaireService {
	
	@Autowired
	private InventaireRepo inventaireRepo;
	
	public List<Facture> getAllInventaires() {
        return inventaireRepo.findAll();
    }
	
	// we return an optional article -> this one is better cause we manage better the project (ifPresent...)
    public Optional<Facture> chercherFactureParIdOA(Integer id) {
        return inventaireRepo.findById(id);
    }

    // we return an article object
    public Facture chercherFactureParIdA(Integer id) {
        return inventaireRepo.findById(id).get();
    }

}
