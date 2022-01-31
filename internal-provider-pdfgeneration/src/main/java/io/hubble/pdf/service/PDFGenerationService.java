package io.hubble.pdf.service;

import io.hubble.pdf.model.GeneratePdf;
import io.hubble.pdf.model.PdfGenerated;

public interface PDFGenerationService {
    PdfGenerated generatePdf(GeneratePdf generatePdf);
}
