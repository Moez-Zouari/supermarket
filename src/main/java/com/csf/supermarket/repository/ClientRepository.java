package com.csf.supermarket.repository;

import org.springframework.data.repository.CrudRepository;

import com.csf.supermarket.model.Client;

public interface ClientRepository extends CrudRepository<Client, Integer>   {

}
