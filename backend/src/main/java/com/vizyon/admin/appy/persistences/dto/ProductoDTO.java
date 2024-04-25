package com.vizyon.admin.appy.persistences.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.vizyon.admin.appy.persistences.entities.ProductoEntity;

import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ProductoDTO {
    
    private Long id;
    private String nombre;
    private double precio;


    public ProductoDTO() {
    }

    public ProductoDTO(Long id, String nombre, double precio) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
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

    public ProductoDTO id(Long id) {
        setId(id);
        return this;
    }

    public ProductoDTO nombre(String nombre) {
        setNombre(nombre);
        return this;
    }

    public ProductoDTO precio(double precio) {
        setPrecio(precio);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof ProductoDTO)) {
            return false;
        }
        ProductoDTO productoDTO = (ProductoDTO) o;
        return Objects.equals(id, productoDTO.id) && Objects.equals(nombre, productoDTO.nombre) && precio == productoDTO.precio;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nombre, precio);
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", nombre='" + getNombre() + "'" +
            ", precio='" + getPrecio() + "'" +
            "}";
    }


    public static ProductoEntity tProductoEntity(ProductoDTO pDto){
        ProductoEntity entity = new ProductoEntity();
        entity.setId(pDto.getId());
        entity.setNombre(pDto.getNombre());
        entity.setPrecio(pDto.getPrecio());
        return entity;
    }
    
    public static ProductoDTO tDto(ProductoEntity pEntity){
        ProductoDTO productoDTO = new ProductoDTO();
        productoDTO.setId(pEntity.getId());
        productoDTO.setNombre(pEntity.getNombre());
        productoDTO.setPrecio(pEntity.getPrecio());
        return productoDTO;
    }

}
