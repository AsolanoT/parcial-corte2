package com.corhuila.app_movil_g1_parcial.Controller;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.corhuila.app_movil_g1_parcial.DTO.ApiResponseDto;
import com.corhuila.app_movil_g1_parcial.Entity.Factura;
import com.corhuila.app_movil_g1_parcial.IService.IFacturaService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/v1/factura")
public class FacturaController extends ABaseController<Factura, IFacturaService> {

    protected FacturaController(IFacturaService service) {
        super(service, "factura");
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ApiResponseDto<Factura>> createFactura(@RequestBody Factura facturaRequest) {
        try {
            Factura facturaCreada = service.crearFacturaSimple(facturaRequest);
            return ResponseEntity.ok(new ApiResponseDto<>("Factura creada", facturaCreada, true));
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(new ApiResponseDto<>(e.getMessage(), null, false));
        }
    }
}
