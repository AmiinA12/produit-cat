package com.amina.produits.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.amina.produits.entities.Categorie;
@RepositoryRestResource(path = "cat")
@CrossOrigin("*") //pour autoriser angular 

public interface CategorieRepository extends JpaRepository<Categorie, Long> {

}
