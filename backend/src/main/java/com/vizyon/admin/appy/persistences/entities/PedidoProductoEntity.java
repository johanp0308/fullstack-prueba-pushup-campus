package com.vizyon.admin.appy.persistences.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.util.Objects;

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


    public PedidoProductoEntity() {
    }

    public PedidoProductoEntity(Long id, int cantidad, ProductoEntity producto, PedidoEntity pedido) {
        this.id = id;
        this.cantidad = cantidad;
        this.producto = producto;
        this.pedido = pedido;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getCantidad() {
        return this.cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public ProductoEntity getProducto() {
        return this.producto;
    }

    public void setProducto(ProductoEntity producto) {
        this.producto = producto;
    }

    public PedidoEntity getPedido() {
        return this.pedido;
    }

    public void setPedido(PedidoEntity pedido) {
        this.pedido = pedido;
    }

    public PedidoProductoEntity id(Long id) {
        setId(id);
        return this;
    }

    public PedidoProductoEntity cantidad(int cantidad) {
        setCantidad(cantidad);
        return this;
    }

    public PedidoProductoEntity producto(ProductoEntity producto) {
        setProducto(producto);
        return this;
    }

    public PedidoProductoEntity pedido(PedidoEntity pedido) {
        setPedido(pedido);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof PedidoProductoEntity)) {
            return false;
        }
        PedidoProductoEntity pedidoProductoEntity = (PedidoProductoEntity) o;
        return Objects.equals(id, pedidoProductoEntity.id) && cantidad == pedidoProductoEntity.cantidad && Objects.equals(producto, pedidoProductoEntity.producto) && Objects.equals(pedido, pedidoProductoEntity.pedido);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, cantidad, producto, pedido);
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", cantidad='" + getCantidad() + "'" +
            ", producto='" + getProducto() + "'" +
            ", pedido='" + getPedido() + "'" +
            "}";
    }
    

}
