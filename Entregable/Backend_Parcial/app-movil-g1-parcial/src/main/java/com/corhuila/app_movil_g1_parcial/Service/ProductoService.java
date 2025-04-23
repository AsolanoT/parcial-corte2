package com.corhuila.app_movil_g1_parcial.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.corhuila.app_movil_g1_parcial.Entity.Producto;
import com.corhuila.app_movil_g1_parcial.IRepository.IBaseRepository;
import com.corhuila.app_movil_g1_parcial.IRepository.IProductoRepository;
import com.corhuila.app_movil_g1_parcial.IService.IProductoService;

@Service
public class ProductoService extends ABaseService<Producto> implements IProductoService {

    @Override
    protected IBaseRepository<Producto, Long> getRepository() {
        return repository;
    }

    @Autowired
    private IProductoRepository repository;

}
