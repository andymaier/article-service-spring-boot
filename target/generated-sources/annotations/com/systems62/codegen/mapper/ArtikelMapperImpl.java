package com.systems62.codegen.mapper;

import com.systems62.codegen.model.Artikel;
import com.systems62.codegen.model.ArtikelEntity;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-12-17T19:42:39+0100",
    comments = "version: 1.4.2.Final, compiler: Eclipse JDT (IDE) 1.4.50.v20210914-1429, environment: Java 17.0.1 (Eclipse Adoptium)"
)
public class ArtikelMapperImpl implements ArtikelMapper {

    @Override
    public Artikel artikelEntityToArtikel(ArtikelEntity artikel) {
        if ( artikel == null ) {
            return null;
        }

        Artikel artikel1 = new Artikel();

        artikel1.setId( artikel.getId() );
        artikel1.setName( artikel.getName() );
        artikel1.setPreis( artikel.getPreis() );

        return artikel1;
    }

    @Override
    public ArtikelEntity artikelToEntitiyArtikel(Artikel artikel) {
        if ( artikel == null ) {
            return null;
        }

        ArtikelEntity artikelEntity = new ArtikelEntity();

        artikelEntity.setId( artikel.getId() );
        artikelEntity.setName( artikel.getName() );
        artikelEntity.setPreis( artikel.getPreis() );

        return artikelEntity;
    }
}
