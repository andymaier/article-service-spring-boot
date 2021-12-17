package com.systems62.codegen.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Artikel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-12-17T19:42:37.231626+01:00[Europe/Berlin]")

public class Artikel   {
  @JsonProperty("id")
  private UUID id;

  @JsonProperty("name")
  private String name;

  @JsonProperty("preis")
  private BigDecimal preis;

  public Artikel id(UUID id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  @ApiModelProperty(value = "")

  @Valid

  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public Artikel name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Dies ist der Name des Artikels
   * @return name
  */
  @ApiModelProperty(example = "HansWurst", value = "Dies ist der Name des Artikels")

@Size(max=20) 
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Artikel preis(BigDecimal preis) {
    this.preis = preis;
    return this;
  }

  /**
   * Dies ist der Preis des Artikels
   * minimum: 0
   * @return preis
  */
  @ApiModelProperty(example = "3.99", value = "Dies ist der Preis des Artikels")

  @Valid
@DecimalMin("0")
  public BigDecimal getPreis() {
    return preis;
  }

  public void setPreis(BigDecimal preis) {
    this.preis = preis;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Artikel artikel = (Artikel) o;
    return Objects.equals(this.id, artikel.id) &&
        Objects.equals(this.name, artikel.name) &&
        Objects.equals(this.preis, artikel.preis);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, preis);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Artikel {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    preis: ").append(toIndentedString(preis)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

