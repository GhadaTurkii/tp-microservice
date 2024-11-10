package tn.itbs.inventaire.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import tn.itbs.inventaire.entities.Facture;

public interface InventaireRepo extends JpaRepository<Facture, Integer>{

}
