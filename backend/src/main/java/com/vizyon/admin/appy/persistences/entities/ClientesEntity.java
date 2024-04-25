package com.vizyon.admin.appy.persistences.entities;

import java.util.List;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "clientes")
public class ClientesEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String cedula;
    private String nombreCliente;
    private String apellidoCliente;


    @OneToMany(mappedBy = "cliente")
    private List<TransacionEntity> transaciones;

    @OneToMany(mappedBy = "cliente")
    private List<PedidoEntity> pedidos;

}
