package com.amina.produits;

import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.amina.produits.entities.Categorie;
import com.amina.produits.entities.Produit;
import com.amina.produits.repos.ProduitRepository;

@SpringBootTest
class MiniProjet1ApplicationTests {
	@Autowired
	private ProduitRepository produitRepository;
	@Test
	public void testCreateProduit() {
	
	Produit prod1 = new Produit("PC lenovo",1200.500,new Date());
	produitRepository.save(prod1);
	}
	@Test
	public void testFindProduit()
	{
	Produit p = produitRepository.findById(1L).get();
	System.out.println(p);
	}
	@Test
	public void testUpdateProduit()
	{
	Produit p = produitRepository.findById(1L).get();
	p.setPrixProduit(1000.0);
	produitRepository.save(p);
	}
	@Test
	public void testDeleteProduit()
	{
	produitRepository.deleteById(1L);;
	}
	@Test
	public void testListerTousProduits()
	{
	List<Produit> prods = produitRepository.findAll();
	for (Produit p : prods)
	{
	System.out.println(p);
	}

	}
	@Test
	public void testFindProduitByNom()
	{
		List<Produit> prods = produitRepository.findByNomProduit("PC Dell");
		for (Produit p : prods)
		{
		System.out.println(p);
		} }
	@Test
	public void testFindByNomProduitContains ()
	{
	List<Produit> prods=produitRepository.findByNomProduitContains("P");
	for (Produit p : prods)
	{
	System.out.println(p);
	} }
	@Test
	public void testfindByNomPrix()
	{
	List<Produit> prods = produitRepository.findByNomPrix("PC Dell", 1000.5);
	for (Produit p : prods)
	{
	System.out.println(p);
	}
	}
	@Test
	public void testfindByCategorie()
	{
	Categorie cat = new Categorie();
	cat.setIdCat(1L);
	List<Produit> prods = produitRepository.findByCategorie(cat);
	for (Produit p : prods)
	{
	System.out.println(p);
	}
	}
	@Test
	public void findByCategorieIdCat()
	{
	List<Produit> prods = produitRepository.findByCategorieIdCat(1L);
	for (Produit p : prods)
	{
	System.out.println(p);
	}
	 }
	@Test
	public void testfindByOrderByNomProduitAsc()
	{
	List<Produit> prods =
	produitRepository.findByOrderByNomProduitAsc();
	for (Produit p : prods)
	{
	System.out.println(p);
	}
	}
	@Test
	public void testTrierProduitsNomsPrix()
	{
	List<Produit> prods = produitRepository.trierProduitsNomsPrix();
	for (Produit p : prods)
	{
	System.out.println(p);
	}
	}

}
	



