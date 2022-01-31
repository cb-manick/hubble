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
 * GenerateInvoiceNumberResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-01-29T12:23:50.861444+05:30[Asia/Kolkata]")
public class GenerateInvoiceNumberResponse   {
  @JsonProperty("invoicenumber")
  private String invoicenumber;

  public GenerateInvoiceNumberResponse invoicenumber(String invoicenumber) {
    this.invoicenumber = invoicenumber;
    return this;
  }

  /**
   * Get invoicenumber
   * @return invoicenumber
  */
  @ApiModelProperty(value = "")


  public String getInvoicenumber() {
    return invoicenumber;
  }

  public void setInvoicenumber(String invoicenumber) {
    this.invoicenumber = invoicenumber;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GenerateInvoiceNumberResponse generateInvoiceNumberResponse = (GenerateInvoiceNumberResponse) o;
    return Objects.equals(this.invoicenumber, generateInvoiceNumberResponse.invoicenumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(invoicenumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GenerateInvoiceNumberResponse {\n");
    
    sb.append("    invoicenumber: ").append(toIndentedString(invoicenumber)).append("\n");
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

