package io.hubble.api;

import io.hubble.model.GenerateInvoiceNumberRequest;
import io.hubble.model.GenerateInvoiceNumberResponse;
import io.hubble.service.InvoiceNumberService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.NativeWebRequest;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-01-29T12:23:50.861444+05:30[Asia/Kolkata]")
@Controller
@RequestMapping("${openapi.invoiceNumberGeneration.base-path:/v1}")
public class InvoicenumberApiController implements InvoicenumberApi {

    private final NativeWebRequest request;
    private final InvoiceNumberService service;
    @org.springframework.beans.factory.annotation.Autowired
    public InvoicenumberApiController(NativeWebRequest request, InvoiceNumberService service) {
        this.request = request;
        this.service = service;
    }

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.ofNullable(request);
    }

    @Override
    public ResponseEntity<GenerateInvoiceNumberResponse> generateInvoiceNumber(GenerateInvoiceNumberRequest request){
        GenerateInvoiceNumberResponse response = service.generateInvoiceNumber(request);
        return ResponseEntity.ok(response);
    }

}
