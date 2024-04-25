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
import java.util.Objects;

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



    public PedidoEntity() {
    }

    public PedidoEntity(Long id, Date fechaPedido, List<PedidoProductoEntity> pedidoProd, List<TransacionEntity> transaciones, ClientesEntity cliente) {
        this.id = id;
        this.fechaPedido = fechaPedido;
        this.pedidoProd = pedidoProd;
        this.transaciones = transaciones;
        this.cliente = cliente;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getFechaPedido() {
        return this.fechaPedido;
    }

    public void setFechaPedido(Date fechaPedido) {
        this.fechaPedido = fechaPedido;
    }

    public List<PedidoProductoEntity> getPedidoProd() {
        return this.pedidoProd;
    }

    public void setPedidoProd(List<PedidoProductoEntity> pedidoProd) {
        this.pedidoProd = pedidoProd;
    }

    public List<TransacionEntity> getTransaciones() {
        return this.transaciones;
    }

    public void setTransaciones(List<TransacionEntity> transaciones) {
        this.transaciones = transaciones;
    }

    public ClientesEntity getCliente() {
        return this.cliente;
    }

    public void setCliente(ClientesEntity cliente) {
        this.cliente = cliente;
    }

    public PedidoEntity id(Long id) {
        setId(id);
        return this;
    }

    public PedidoEntity fechaPedido(Date fechaPedido) {
        setFechaPedido(fechaPedido);
        return this;
    }

    public PedidoEntity pedidoProd(List<PedidoProductoEntity> pedidoProd) {
        setPedidoProd(pedidoProd);
        return this;
    }

    public PedidoEntity transaciones(List<TransacionEntity> transaciones) {
        setTransaciones(transaciones);
        return this;
    }

    public PedidoEntity cliente(ClientesEntity cliente) {
        setCliente(cliente);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof PedidoEntity)) {
            return false;
        }
        PedidoEntity pedidoEntity = (PedidoEntity) o;
        return Objects.equals(id, pedidoEntity.id) && Objects.equals(fechaPedido, pedidoEntity.fechaPedido) && Objects.equals(pedidoProd, pedidoEntity.pedidoProd) && Objects.equals(transaciones, pedidoEntity.transaciones) && Objects.equals(cliente, pedidoEntity.cliente);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, fechaPedido, pedidoProd, transaciones, cliente);
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", fechaPedido='" + getFechaPedido() + "'" +
            ", pedidoProd='" + getPedidoProd() + "'" +
            ", transaciones='" + getTransaciones() + "'" +
            ", cliente='" + getCliente() + "'" +
            "}";
    }



}
