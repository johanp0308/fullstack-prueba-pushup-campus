package com.vizyon.admin.appy.domain.services;

import com.vizyon.admin.appy.persistences.dto.ProductoDTO;
import com.vizyon.admin.appy.persistences.entities.ProductoEntity;

public interface ProductoService {
    
    ProductoDTO save(ProductoDTO pDto);

    
}
