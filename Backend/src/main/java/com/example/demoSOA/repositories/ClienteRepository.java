package com.example.demoSOA.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demoSOA.models.cliente;

public interface ClienteRepository  extends JpaRepository<cliente, Integer>{

}
