package io.hubble.service;

import io.hubble.model.GenerateInvoiceNumberRequest;
import io.hubble.model.GenerateInvoiceNumberResponse;

public interface InvoiceNumberService {

  GenerateInvoiceNumberResponse generateInvoiceNumber(GenerateInvoiceNumberRequest request);
}
