package io.hubble.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;


import java.util.*;

/**
 * GenerateInvoiceNumberRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-01-29T12:23:50.861444+05:30[Asia/Kolkata]")
public class GenerateInvoiceNumberRequest   {
  @JsonProperty("date")
  private String date;

  @JsonProperty("prefix")
  private String prefix;

  @JsonProperty("seed")
  private String seed;

  public GenerateInvoiceNumberRequest date(String date) {
    this.date = date;
    return this;
  }

  /**
   * Get date
   * @return date
  */
  @ApiModelProperty(example = "1643434140000", value = "")


  public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }

  public GenerateInvoiceNumberRequest prefix(String prefix) {
    this.prefix = prefix;
    return this;
  }

  /**
   * Get prefix
   * @return prefix
  */
  @ApiModelProperty(example = "merch", value = "")


  public String getPrefix() {
    return prefix;
  }

  public void setPrefix(String prefix) {
    this.prefix = prefix;
  }

  public GenerateInvoiceNumberRequest seed(String seed) {
    this.seed = seed;
    return this;
  }

  /**
   * Get seed
   * @return seed
  */
  @ApiModelProperty(example = "20", value = "")


  public String getSeed() {
    return seed;
  }

  public void setSeed(String seed) {
    this.seed = seed;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GenerateInvoiceNumberRequest generateInvoiceNumberRequest = (GenerateInvoiceNumberRequest) o;
    return Objects.equals(this.date, generateInvoiceNumberRequest.date) &&
        Objects.equals(this.prefix, generateInvoiceNumberRequest.prefix) &&
        Objects.equals(this.seed, generateInvoiceNumberRequest.seed);
  }

  @Override
  public int hashCode() {
    return Objects.hash(date, prefix, seed);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GenerateInvoiceNumberRequest {\n");
    
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    prefix: ").append(toIndentedString(prefix)).append("\n");
    sb.append("    seed: ").append(toIndentedString(seed)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

