package com.vizyon.admin.appy.persistences.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.util.Objects;

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


    public TransacionEntity() {
    }

    public TransacionEntity(Long id, double valorTransacion, ClientesEntity cliente, PedidoEntity pedido) {
        this.id = id;
        this.valorTransacion = valorTransacion;
        this.cliente = cliente;
        this.pedido = pedido;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getValorTransacion() {
        return this.valorTransacion;
    }

    public void setValorTransacion(double valorTransacion) {
        this.valorTransacion = valorTransacion;
    }

    public ClientesEntity getCliente() {
        return this.cliente;
    }

    public void setCliente(ClientesEntity cliente) {
        this.cliente = cliente;
    }

    public PedidoEntity getPedido() {
        return this.pedido;
    }

    public void setPedido(PedidoEntity pedido) {
        this.pedido = pedido;
    }

    public TransacionEntity id(Long id) {
        setId(id);
        return this;
    }

    public TransacionEntity valorTransacion(double valorTransacion) {
        setValorTransacion(valorTransacion);
        return this;
    }

    public TransacionEntity cliente(ClientesEntity cliente) {
        setCliente(cliente);
        return this;
    }

    public TransacionEntity pedido(PedidoEntity pedido) {
        setPedido(pedido);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof TransacionEntity)) {
            return false;
        }
        TransacionEntity transacionEntity = (TransacionEntity) o;
        return Objects.equals(id, transacionEntity.id) && valorTransacion == transacionEntity.valorTransacion && Objects.equals(cliente, transacionEntity.cliente) && Objects.equals(pedido, transacionEntity.pedido);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, valorTransacion, cliente, pedido);
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", valorTransacion='" + getValorTransacion() + "'" +
            ", cliente='" + getCliente() + "'" +
            ", pedido='" + getPedido() + "'" +
            "}";
    }
    
}
