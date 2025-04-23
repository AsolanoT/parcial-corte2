package com.corhuila.app_movil_g1_parcial.Controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.corhuila.app_movil_g1_parcial.Entity.Producto;
import com.corhuila.app_movil_g1_parcial.IService.IProductoService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/v1/producto")
public class ProductoController extends ABaseController<Producto, IProductoService> {

    protected ProductoController(IProductoService service) {
        super(service, "producto");
    }

}
