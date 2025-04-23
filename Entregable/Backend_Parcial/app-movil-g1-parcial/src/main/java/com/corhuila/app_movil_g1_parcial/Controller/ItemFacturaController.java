package com.corhuila.app_movil_g1_parcial.Controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.corhuila.app_movil_g1_parcial.Entity.ItemFactura;
import com.corhuila.app_movil_g1_parcial.IService.IItemFacturaService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/v1/itemfactura")
public class ItemFacturaController extends ABaseController<ItemFactura, IItemFacturaService> {

    protected ItemFacturaController(IItemFacturaService service) {
        super(service, "ItemFactura");
    }

}
