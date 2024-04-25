package com.vizyon.admin.appy.persistences.entities;



import java.util.Date;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "pedidos")
public class PedidoEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Date fechaPedido;

    @OneToMany(mappedBy = "pedido")
    private List<PedidoProductoEntity> pedidoProd;

    @OneToMany(mappedBy = "pedido")
    private List<TransacionEntity> transaciones;
    
    @ManyToOne
    @JoinColumn(name = "clienteId")
    private ClientesEntity cliente;





}
