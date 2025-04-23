package com.corhuila.app_movil_g1_parcial.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.corhuila.app_movil_g1_parcial.Entity.ItemFactura;
import com.corhuila.app_movil_g1_parcial.IRepository.IBaseRepository;
import com.corhuila.app_movil_g1_parcial.IRepository.IItemFacturaRepository;
import com.corhuila.app_movil_g1_parcial.IService.IItemFacturaService;

@Service
public class ItemFacturaService extends ABaseService<ItemFactura> implements IItemFacturaService {

    @Override
    protected IBaseRepository<ItemFactura, Long> getRepository() {
        return repository;
    }

    @Autowired
    private IItemFacturaRepository repository;

}
