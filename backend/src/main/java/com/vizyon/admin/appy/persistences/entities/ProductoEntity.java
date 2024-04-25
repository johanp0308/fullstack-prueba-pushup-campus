package com.vizyon.admin.appy.persistences.entities;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "producto")
public class ProductoEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private double precio;

    @OneToMany(mappedBy = "producto")
    private List<PedidoProductoEntity> pedidosProd;

    public ProductoEntity() {
    }

    public ProductoEntity(Long id, String nombre, double precio, List<PedidoProductoEntity> pedidosProd) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.pedidosProd = pedidosProd;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return this.precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public List<PedidoProductoEntity> getPedidosProd() {
        return this.pedidosProd;
    }

    public void setPedidosProd(List<PedidoProductoEntity> pedidosProd) {
        this.pedidosProd = pedidosProd;
    }

    public ProductoEntity id(Long id) {
        setId(id);
        return this;
    }

    public ProductoEntity nombre(String nombre) {
        setNombre(nombre);
        return this;
    }

    public ProductoEntity precio(double precio) {
        setPrecio(precio);
        return this;
    }

    public ProductoEntity pedidosProd(List<PedidoProductoEntity> pedidosProd) {
        setPedidosProd(pedidosProd);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof ProductoEntity)) {
            return false;
        }
        ProductoEntity productoEntity = (ProductoEntity) o;
        return Objects.equals(id, productoEntity.id) && Objects.equals(nombre, productoEntity.nombre) && precio == productoEntity.precio && Objects.equals(pedidosProd, productoEntity.pedidosProd);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nombre, precio, pedidosProd);
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", nombre='" + getNombre() + "'" +
            ", precio='" + getPrecio() + "'" +
            ", pedidosProd='" + getPedidosProd() + "'" +
            "}";
    }

    
}
