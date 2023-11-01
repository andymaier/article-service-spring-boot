package com.systems62.codegen.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.systems62.codegen.model.Artikel;
import com.systems62.codegen.model.ArtikelEntity;
import com.systems62.codegen.model.ArtikelResponse;

@Mapper
public interface ArtikelMapper {
 
    ArtikelMapper INSTANCE = Mappers.getMapper( ArtikelMapper.class );
 
    Artikel artikelEntityToArtikel(ArtikelEntity artikel);    
        
    //ArtikelResponse artikelEntityToArtikelResponsArtikel(ArtikelEntity artikel);
    
    ArtikelEntity artikelToEntitiyArtikel(Artikel artikel);

    default ArtikelResponse artikelEntityToArtikelResponsArtikel(ArtikelEntity artikel) {
        ArtikelResponse resp = new ArtikelResponse();
        resp.setAid(artikel.getId().toString());
        resp.setName(artikel.getName());
        resp.setPreis(artikel.getPreis());
        return  resp;
    }
}