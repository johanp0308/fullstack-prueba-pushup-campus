package com.vizyon.admin.appy.persistences.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "transaciones")
public class TransacionEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private double valorTransacion;


    @ManyToOne
    @JoinColumn(name = "clienteId")
    private ClientesEntity cliente;

    @ManyToOne
    @JoinColumn(name = "pedidoId")
    private PedidoEntity pedido;
}
