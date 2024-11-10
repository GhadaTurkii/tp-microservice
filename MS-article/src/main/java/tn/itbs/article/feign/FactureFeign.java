package tn.itbs.article.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import tn.itbs.article.entities.Facture;


//client feign
@FeignClient(name="microservice-facture", url="http://localhost:9091/facture")
public interface FactureFeign {

	@GetMapping("/facture/byid/{id}")
    public Facture getAllInventaires(@PathVariable int id);
	
	//we need to implement it in project inventaire
	@PostMapping("/facture/add")
    public Facture enregistrerFacture(@RequestBody Facture fact);
}
