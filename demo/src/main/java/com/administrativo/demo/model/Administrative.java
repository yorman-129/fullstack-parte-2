package com.administrativo.demo.model;

import javax.persistence.*;



@Entity
@Table(name = "Administrative")
public class Administrative {
    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombreCompleto")
    private String nombreCompleto;

    @Column(name = "cargo")
    private String cargo;

    @Column(name="salario")
    private Float salario;

    @Column(name = "tipoContrato")
    private Long tipoContrato;

    @Column(name = "telefeno")
    private String telefono;

    @Column(name = "direccion")
    private String direccion;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Float getSalario() {
        return salario;
    }

    public void setSalario(Float salario) {
        this.salario = salario;
    }

    public Long getTipoContrato() {
        return tipoContrato;
    }

    public void setTipoContrato(Long tipoContrato) {
        this.tipoContrato = tipoContrato;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}

