package com.csf.supermarket.repository;

import org.springframework.data.repository.CrudRepository;

import com.csf.supermarket.model.Commande;

public interface CommandeRepository extends CrudRepository<Commande, Long> {

}
