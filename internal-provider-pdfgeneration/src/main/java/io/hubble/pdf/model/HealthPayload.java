package io.hubble.pdf.model;

import com.fasterxml.jackson.annotation.JsonInclude;



@JsonInclude(JsonInclude.Include.NON_NULL)
public class HealthPayload {

	public HealthPayload () {
	}

	public HealthPayload (
		Integer percentage, 
		java.time.OffsetDateTime sentAt) {
		this.percentage = percentage;
		this.sentAt = sentAt;
	}

	private Integer percentage;
	private java.time.OffsetDateTime sentAt;
	public Integer getPercentage() {
		return percentage;
	}

	public HealthPayload setPercentage(Integer percentage) {
		this.percentage = percentage;
		return this;
	}


	public java.time.OffsetDateTime getSentAt() {
		return sentAt;
	}

	public HealthPayload setSentAt(java.time.OffsetDateTime sentAt) {
		this.sentAt = sentAt;
		return this;
	}

	public String toString() {
		return "io.hubble.pdf.model.HealthPayload ["
		+ " percentage: " + percentage
		+ " sentAt: " + sentAt
		+ " ]";
	}
}
