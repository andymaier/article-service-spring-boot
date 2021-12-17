package com.systems62.codegen.mapper;

import com.systems62.codegen.model.Artikel;
import com.systems62.codegen.model.ArtikelEntity;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ArtikelMapper {
 
    ArtikelMapper INSTANCE = Mappers.getMapper( ArtikelMapper.class );
 
    Artikel artikelEntityToArtikel(ArtikelEntity artikel);
    ArtikelEntity artikelToEntitiyArtikel(Artikel artikel);
}