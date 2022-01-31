package io.hubble.pdf.model;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class PdfGenerated {
  private String invoiceNumber;
  private String sentAt;
  private String invoiceUrl;

  public PdfGenerated(String invoiceNumber, String sentAt, String invoiceUrl) {
    this.invoiceNumber = invoiceNumber;
    this.sentAt = sentAt;
    this.invoiceUrl = invoiceUrl;
  }

  public String getInvoiceNumber() {
    return invoiceNumber;
  }

  public void setInvoiceNumber(String invoiceNumber) {
    this.invoiceNumber = invoiceNumber;
  }

  public String getSentAt() {
    return sentAt;
  }

  public void setSentAt(String sentAt) {
    this.sentAt = sentAt;
  }

  public String getInvoiceUrl() {
    return invoiceUrl;
  }

  public void setInvoiceUrl(String invoiceUrl) {
    this.invoiceUrl = invoiceUrl;
  }

	@Override
	public String toString() {
		return "PdfGenerated{" +
				"invoiceNumber='" + invoiceNumber + '\'' +
				", sentAt='" + sentAt + '\'' +
				", invoiceUrl='" + invoiceUrl + '\'' +
				'}';
	}
}
