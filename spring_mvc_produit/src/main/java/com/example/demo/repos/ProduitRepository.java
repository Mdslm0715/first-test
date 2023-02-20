package com.example.demo.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.produit.Produit;

public interface ProduitRepository extends JpaRepository<Produit, Long>  {

}
