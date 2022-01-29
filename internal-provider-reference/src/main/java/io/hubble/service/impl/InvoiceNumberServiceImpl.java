package io.hubble.service.impl;

import io.hubble.model.GenerateInvoiceNumberRequest;
import io.hubble.model.GenerateInvoiceNumberResponse;
import io.hubble.service.InvoiceNumberService;

public class InvoiceNumberServiceImpl implements InvoiceNumberService {
    private static String providerPrefix = "Provider";
    @Override
    public GenerateInvoiceNumberResponse generateInvoiceNumber(GenerateInvoiceNumberRequest request) {
        String s = providerPrefix + request.getPrefix() + request.getSeed();
        GenerateInvoiceNumberResponse response = getGenerateInvoiceNumberResponse(s);
        return response;
    }

    private GenerateInvoiceNumberResponse getGenerateInvoiceNumberResponse(String s) {
        GenerateInvoiceNumberResponse response = new GenerateInvoiceNumberResponse();
        response.setInvoicenumber(s);
        return response;
    }
}
