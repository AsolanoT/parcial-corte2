package com.corhuila.app_movil_g1_parcial.IRepository;

import org.springframework.stereotype.Repository;

import com.corhuila.app_movil_g1_parcial.Entity.Producto;

@Repository
public interface IProductoRepository extends IBaseRepository<Producto, Long> {

}
