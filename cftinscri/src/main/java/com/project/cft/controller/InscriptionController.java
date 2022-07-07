package com.project.cft.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.cft.entities.inscription;
import com.project.cft.service.InscriService;

import lombok.RequiredArgsConstructor;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping(path="/api")
@RequiredArgsConstructor
public class InscriptionController {

	@Autowired
     InscriService service;
	
	 @PostMapping("/inscription")
	    public void save(@RequestBody inscription inscription) {
	         service.saveinscri(inscription);
	    }
	 @GetMapping("/inscriptionn")
	    public Iterable<inscription> findAllStudent() {
	        return service.listAlletudients();
	    }
	    @GetMapping("/etudientById/{id}")
	    public inscription findProductById(@PathVariable Long id) {
	        return service.getetudientById(id);
	    }
	    @PutMapping("/etudientById/{id}")
	    public inscription etudaccepté(@PathVariable Long id) {
	        return service.retrieveaccepté(id);
	    }
	    
	    @GetMapping("/accepted")
	    public Iterable<inscription> acceptedstudent() {
	        return service.findAllacceptedstudent();
	    }
	    
	    @GetMapping("/attente")
	    public Iterable<inscription> listeattente() {
	        return service.listeattente();
	    }
	    
	   
	    @DeleteMapping("/deleteetud/{id}")
	    public String deleteProduct(@PathVariable Long id) {
	        return service.deleteetudient(id);

}
	    

	    @GetMapping("/sendmail/{id}")
	    public inscription sendmail(@PathVariable("id") Long id){

	        String email= service.findById(id).getEmail();

	        service.sendSimpleEmail(email,
	                "Congratulations, you are accepted .\n" +
	                        "Now you can complete your inscription\n" +
	                        "\n" +
	                        "\n" +
	                        "thank you",
	                "dossier d'inscription"+"\n"+
	                        "02 copies de la carte d'identité national ou passeport"+"\n"+
	                		"02 Extraits de naissances"+"\n"+
	                        "04 photo d'identité "+"\n"+
	                		"04 Enveloppes timbrés"+"\n"+
	                        "02 copies conformes du niveau de scolarité"+"\n"+
	                		"01 fiche d'inscription"+"\n"+
	                        "01 Reglement interieur légalisé"
	        );

	        return service.findById(id);
	    }

}
