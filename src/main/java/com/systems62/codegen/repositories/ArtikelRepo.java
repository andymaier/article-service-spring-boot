package com.systems62.codegen.repositories;

import java.util.UUID;

import com.systems62.codegen.model.ArtikelEntity;

import org.springframework.data.jpa.repository.JpaRepository;


public interface ArtikelRepo extends JpaRepository<ArtikelEntity, UUID> {
    
}
