package com.corhuila.app_movil_g1_parcial.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.corhuila.app_movil_g1_parcial.Entity.Factura;
import com.corhuila.app_movil_g1_parcial.Entity.Producto;
import com.corhuila.app_movil_g1_parcial.IRepository.IBaseRepository;
import com.corhuila.app_movil_g1_parcial.IRepository.IFacturaRepository;
import com.corhuila.app_movil_g1_parcial.IRepository.IProductoRepository;
import com.corhuila.app_movil_g1_parcial.IService.IFacturaService;

@Service
public class FacturaService extends ABaseService<Factura> implements IFacturaService {

    @Autowired
    private IFacturaRepository repository;

    @Autowired
    private IProductoRepository productoRepository;

    @Override
    protected IBaseRepository<Factura, Long> getRepository() {
        return repository;
    }

    public Factura crearFacturaSimple(Factura factura) throws Exception {
        // Verificar que el producto existe
        Producto producto = productoRepository.findById(factura.getProductos().get(0).getId())
                .orElseThrow(() -> new Exception("Producto no encontrado"));

        // Calcular el total
        factura.setTotal(producto.getPrecio() * factura.getCantidad());

        // Guardar la factura
        return super.save(factura);
    }

}
