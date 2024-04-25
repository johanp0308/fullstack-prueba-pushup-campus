package com.vizyon.admin.appy.domain.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vizyon.admin.appy.domain.repositories.ProductoRepository;
import com.vizyon.admin.appy.domain.services.ProductoService;
import com.vizyon.admin.appy.persistences.dto.ProductoDTO;
import com.vizyon.admin.appy.persistences.entities.ProductoEntity;

@Service
public class ProductoServiceImpl implements ProductoService{

    private final ProductoRepository productoRepository;

    @Autowired
    public ProductoServiceImpl(ProductoRepository productoRepository) {
        this.productoRepository = productoRepository;
    }
    
    

    @Override
    public ProductoDTO save(ProductoDTO pDto) {
        ProductoEntity productoEntity = pDto.tProductoEntity(pDto);
        ProductoEntity response = productoRepository.save(productoEntity);
        return ProductoDTO.tDto(productoEntity);
    }
    
}
