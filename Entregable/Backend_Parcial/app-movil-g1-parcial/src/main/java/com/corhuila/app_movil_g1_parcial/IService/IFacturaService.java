package com.corhuila.app_movil_g1_parcial.IService;

import com.corhuila.app_movil_g1_parcial.Entity.Factura;

public interface IFacturaService extends IBaseService<Factura> {

    Factura crearFacturaSimple(Factura factura) throws Exception;
}
