package com.vizyon.admin.appy.domain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vizyon.admin.appy.persistences.entities.TransacionEntity;

public interface TransacionRepository extends JpaRepository<TransacionEntity,Long>{
    
}
