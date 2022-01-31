package io.hubble.pdf.service;

import io.hubble.pdf.model.GeneratePdf;
import io.hubble.pdf.model.PdfGenerated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.time.OffsetDateTime;
import java.util.UUID;
import java.util.function.Function;

@Service
public class PDFGenerationServiceImpl implements PDFGenerationService {
  private static final Logger logger = LoggerFactory.getLogger(PDFGenerationServiceImpl.class);

  @Override
  public PdfGenerated generatePdf(GeneratePdf generatePdf) {
    logger.info("Received Message at " + OffsetDateTime.now());
    PdfGenerated pdfGenerated =
        new PdfGenerated(
            generatePdf.getInvoiceNumber(),
            OffsetDateTime.now().toString(),
            UUID.randomUUID().toString());
    return pdfGenerated;
  }

  @Bean
  public Function<GeneratePdf,PdfGenerated> generatePdf() {
    return generatePdf -> {
      logger.info("Received Message " + generatePdf);
      logger.info(generatePdf.toString());
      return this.generatePdf(generatePdf);
    };
  }

//  @Bean
//  public Supplier<PdfGenerated> pdfGenerated() {
//    return data -> {
//      // Add business logic here.
//      logger.info(data.toString());
//    };
//  }
//
//  @Bean
//  public Supplier<HealthPayload> health() {
//    return data -> {
//      // Add business logic here.
//      logger.info(data.toString());
//    };
//  }
}
