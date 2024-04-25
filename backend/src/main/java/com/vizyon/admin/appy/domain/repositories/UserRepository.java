package com.vizyon.admin.appy.domain.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vizyon.admin.appy.persistences.entities.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity,Long>{
    
    Optional<UserEntity> findByUsername(String username);
    
}