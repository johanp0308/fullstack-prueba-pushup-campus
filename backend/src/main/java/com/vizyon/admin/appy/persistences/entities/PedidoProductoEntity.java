package com.vizyon.admin.appy.persistences.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "pedidos_productos")
public class PedidoProductoEntity {
 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "registroId")
    private Long id;
    private int cantidad;

    @ManyToOne
    @JoinColumn(name = "productoId")
    private ProductoEntity producto;
    
    @ManyToOne
    @JoinColumn(name = "pedidoId")
    private PedidoEntity pedido;

}
