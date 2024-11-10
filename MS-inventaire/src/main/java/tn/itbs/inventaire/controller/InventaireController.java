package tn.itbs.inventaire.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tn.itbs.inventaire.entities.Facture;
import tn.itbs.inventaire.service.InventaireService;

@RestController
@RequestMapping("/inventaire")
public class InventaireController {

	@Autowired
    private InventaireService inventaireService;

    @GetMapping("/byid/{id}")
    public Facture getAllInventaires(@PathVariable int id) {
        return inventaireService.chercherFactureParIdA(id);
    }
}
