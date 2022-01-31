package io.hubble.pdf.infra;

import io.hubble.pdf.model.GeneratePdf;
import io.hubble.pdf.service.PDFGenerationServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;

import java.util.function.Consumer;

public class InfraActors {
    private static final Logger logger = LoggerFactory.getLogger(PDFGenerationServiceImpl.class);
  //  @Autowired private PDFGenerationService pdfGenerationService;
  //
  //  @Bean
  //  public Consumer<GeneratePdf> generatePDF() {
  //    return pdfGenerationService::generatePdf;
  //  }
  @Bean
  public Consumer<GeneratePdf> generatePdf() {
    return generatePdf -> {
      logger.info("Received Message " + generatePdf);
      logger.info(generatePdf.toString());
    };
  }
}
