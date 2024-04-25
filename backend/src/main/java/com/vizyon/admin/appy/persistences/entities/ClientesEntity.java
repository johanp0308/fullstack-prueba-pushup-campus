package com.vizyon.admin.appy.persistences.entities;

import java.util.List;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.util.Objects;

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

    public ClientesEntity() {
    }

    public ClientesEntity(Long id, String cedula, String nombreCliente, String apellidoCliente, List<TransacionEntity> transaciones, List<PedidoEntity> pedidos) {
        this.id = id;
        this.cedula = cedula;
        this.nombreCliente = nombreCliente;
        this.apellidoCliente = apellidoCliente;
        this.transaciones = transaciones;
        this.pedidos = pedidos;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCedula() {
        return this.cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombreCliente() {
        return this.nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getApellidoCliente() {
        return this.apellidoCliente;
    }

    public void setApellidoCliente(String apellidoCliente) {
        this.apellidoCliente = apellidoCliente;
    }

    public List<TransacionEntity> getTransaciones() {
        return this.transaciones;
    }

    public void setTransaciones(List<TransacionEntity> transaciones) {
        this.transaciones = transaciones;
    }

    public List<PedidoEntity> getPedidos() {
        return this.pedidos;
    }

    public void setPedidos(List<PedidoEntity> pedidos) {
        this.pedidos = pedidos;
    }

    public ClientesEntity id(Long id) {
        setId(id);
        return this;
    }

    public ClientesEntity cedula(String cedula) {
        setCedula(cedula);
        return this;
    }

    public ClientesEntity nombreCliente(String nombreCliente) {
        setNombreCliente(nombreCliente);
        return this;
    }

    public ClientesEntity apellidoCliente(String apellidoCliente) {
        setApellidoCliente(apellidoCliente);
        return this;
    }

    public ClientesEntity transaciones(List<TransacionEntity> transaciones) {
        setTransaciones(transaciones);
        return this;
    }

    public ClientesEntity pedidos(List<PedidoEntity> pedidos) {
        setPedidos(pedidos);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof ClientesEntity)) {
            return false;
        }
        ClientesEntity clientesEntity = (ClientesEntity) o;
        return Objects.equals(id, clientesEntity.id) && Objects.equals(cedula, clientesEntity.cedula) && Objects.equals(nombreCliente, clientesEntity.nombreCliente) && Objects.equals(apellidoCliente, clientesEntity.apellidoCliente) && Objects.equals(transaciones, clientesEntity.transaciones) && Objects.equals(pedidos, clientesEntity.pedidos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, cedula, nombreCliente, apellidoCliente, transaciones, pedidos);
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", cedula='" + getCedula() + "'" +
            ", nombreCliente='" + getNombreCliente() + "'" +
            ", apellidoCliente='" + getApellidoCliente() + "'" +
            ", transaciones='" + getTransaciones() + "'" +
            ", pedidos='" + getPedidos() + "'" +
            "}";
    }

}
