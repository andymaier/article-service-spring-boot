package com.systems62.codegen.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.systems62.codegen.mapper.ArtikelMapper;
import com.systems62.codegen.model.Artikel;
import com.systems62.codegen.model.ArtikelEntity;
import com.systems62.codegen.model.ArtikelList;
import com.systems62.codegen.model.ArtikelPatch;
import com.systems62.codegen.model.ArtikelResponse;
import com.systems62.codegen.repositories.ArtikelRepo;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-12-17T17:22:51.930354+01:00[Europe/Berlin]")
@RestController
@RequestMapping("/api")
public class ArtikelApiController implements ArtikelApi {

    @Autowired
    ArtikelRepo repo;

    @Override
    public ResponseEntity<Void> artikelAidDelete(String aid) {
        // TODO Auto-generated method stub
        return ArtikelApi.super.artikelAidDelete(aid);
    }

    @Override
    public ResponseEntity<ArtikelResponse> artikelAidGet(String aid) {
        if (repo.findById(UUID.fromString(aid)).isPresent()) {
            ArtikelResponse artikel = ArtikelMapper.INSTANCE.artikelEntityToArtikelResponsArtikel(repo.findById(UUID.fromString(aid)).get());
            return ResponseEntity.ok(artikel);
        }
        return ResponseEntity.notFound().build();
    }

    @Override
    public ResponseEntity<ArtikelResponse> artikelAidPatch(String aid, @Valid ArtikelPatch artikelPatch) {
        // TODO Auto-generated method stub
        return ArtikelApi.super.artikelAidPatch(aid, artikelPatch);
    }

    @Override
    public ResponseEntity<ArtikelResponse> artikelAidPut(String aid, @Valid Artikel artikel) {
        // TODO Auto-generated method stub
        return ArtikelApi.super.artikelAidPut(aid, artikel);
    }

    @Override
    public ResponseEntity<ArtikelList> artikelGet() {
        List<ArtikelResponse> list = new ArrayList<>();
        repo.findAll().forEach(x -> list.add(ArtikelMapper.INSTANCE.artikelEntityToArtikelResponsArtikel(x)));
        ArtikelList artikelList = new ArtikelList();        
        artikelList.setArtikel(list);
        return ResponseEntity.ok(artikelList);
    }

    @Override
    public ResponseEntity<ArtikelResponse> artikelPost(@Valid Artikel artikel) {
        ArtikelEntity entity = ArtikelMapper.INSTANCE.artikelToEntitiyArtikel(artikel);
        ArtikelResponse artikelSaved = ArtikelMapper.INSTANCE.artikelEntityToArtikelResponsArtikel(repo.save(entity));
        return ResponseEntity.ok().body(artikelSaved);
    }
}
