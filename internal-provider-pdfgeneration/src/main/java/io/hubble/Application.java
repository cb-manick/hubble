package io.hubble;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.hubble.pdf.model.GeneratePdf;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication

@ComponentScan(basePackages = { "io.hubble.pdf.infra"})

public class Application {

  private static final Logger logger = LoggerFactory.getLogger(Application.class);
  private static final ObjectMapper objectMapper = new ObjectMapper();

  private GeneratePdf pdf;
  public static void main(String[] args) {

    SpringApplication.run(Application.class);
  }


//  @Bean
//  public Consumer<GeneratePdf> generatePdf(){
//    return generatePdf -> {
//      logger.info("Received Message " + generatePdf);
//      logger.info(generatePdf.toString());
//    };
//  }
}
