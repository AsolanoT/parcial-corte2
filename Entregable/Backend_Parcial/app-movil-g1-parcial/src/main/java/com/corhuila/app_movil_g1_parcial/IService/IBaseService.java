package com.corhuila.app_movil_g1_parcial.IService;

import java.util.List;

import com.corhuila.app_movil_g1_parcial.Entity.ABaseEntity;

public interface IBaseService<T extends ABaseEntity> {

    List<T> all();

    List<T> findByStateTrue();

    T findById(Long id) throws Exception;

    T save(T entity) throws Exception;

    void update(Long id, T entity) throws Exception;

    void delete(Long id) throws Exception;
}
