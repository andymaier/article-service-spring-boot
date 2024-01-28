package com.systems62.codegen.controllers.graphql;

import java.util.UUID;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import com.systems62.codegen.mapper.ArtikelMapper;
import com.systems62.codegen.model.ArtikelResponse;
import com.systems62.codegen.repositories.ArtikelRepo;

@Controller
public class GraphQLController {
    @Autowired
    ArtikelRepo repo;

    @QueryMapping
    public Iterable<ArtikelResponse> artikelList() {
        return repo.findAll().stream()
            .map(artikel -> ArtikelMapper.INSTANCE.artikelEntityToArtikelResponsArtikel(artikel))
            .collect(Collectors.toList());
    }
    
    @QueryMapping
    public ArtikelResponse artikelResponse(@Argument String aid) throws Exception {
        return repo.findById(UUID.fromString(aid))
        .map(artikel -> ArtikelMapper.INSTANCE.artikelEntityToArtikelResponsArtikel(artikel))
            .orElseThrow(() -> new Exception("Artikel not found"));
    }
    /*
    @MutationMapping
    public ArtikelResponse patchArtikelAid(@Argument String aid, @Argument ArtikelPatchInput artikelPatchInput) {
        // Implement the logic to patch the artikel
    }

    @MutationMapping
    public ArtikelResponse postArtikel(@Argument Artikel2Input artikel2Input) {
        // Implement the logic to create a new artikel
    }

    @MutationMapping
    public ArtikelResponse putArtikelAid(@Argument String aid, @Argument Artikel2Input artikel2Input) {
        // Implement the logic to update the artikel
    }
    */
}