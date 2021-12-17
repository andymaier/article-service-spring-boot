package com.systems62.codegen.model;

import java.math.BigDecimal;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ArtikelEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private UUID id;
  private String name;
  private BigDecimal preis;

  public UUID getId() {
    return id;
  }
  public void setId(UUID id) {
    this.id = id;
  }
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public BigDecimal getPreis() {
    return preis;
  }
  public void setPreis(BigDecimal preis) {
    this.preis = preis;
  }
}
