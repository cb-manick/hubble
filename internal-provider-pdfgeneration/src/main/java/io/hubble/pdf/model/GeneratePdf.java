package io.hubble.pdf.model;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GeneratePdf {

  public GeneratePdf() {}

  public GeneratePdf(String invoiceNumber, String sentAt) {
    this.invoiceNumber = invoiceNumber;
    this.sentAt = sentAt;
  }

  private String invoiceNumber;
  private String sentAt;

  public String getInvoiceNumber() {
    return invoiceNumber;
  }

  public GeneratePdf setInvoiceNumber(String invoiceNumber) {
    this.invoiceNumber = invoiceNumber;
    return this;
  }

  public String getSentAt() {
    return sentAt;
  }

  public GeneratePdf setSentAt(String sentAt) {
    this.sentAt = sentAt;
    return this;
  }

  public String toString() {
    return "io.hubble.pdf.model.GeneratePdf [" + " invoiceNumber: " + invoiceNumber + " sentAt: " + sentAt + " ]";
  }
}
