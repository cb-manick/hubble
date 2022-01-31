package io.hubble.pdf.model;

import com.fasterxml.jackson.annotation.JsonInclude;



@JsonInclude(JsonInclude.Include.NON_NULL)
public class PdfGenerated {
    private String invoiceNumber;
	private String sentAt;
	private String invoiceUrl;
	public PdfGenerated (String invoiceNumber,String sentAt, String invoiceUrl) {
	this.invoiceNumber = invoiceNumber;
	this.sentAt = sentAt;
	this.invoiceUrl = invoiceUrl;
	}


}
