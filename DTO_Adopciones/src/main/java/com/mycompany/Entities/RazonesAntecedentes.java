/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

/**
 *
 * @author Josel
 */
@Entity
public class RazonesAntecedentes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String razonesParaAdoptar;
    private String antecedentesConMascotas;
    private boolean dispuestoARecibirSeguimiento;
    private String cartaCompromiso;

    @OneToOne(mappedBy = "razones")
    private SolicitudAdopcion solicitud;

    public RazonesAntecedentes() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRazonesParaAdoptar() {
        return razonesParaAdoptar;
    }

    public void setRazonesParaAdoptar(String razonesParaAdoptar) {
        this.razonesParaAdoptar = razonesParaAdoptar;
    }

    public String getAntecedentesConMascotas() {
        return antecedentesConMascotas;
    }

    public void setAntecedentesConMascotas(String antecedentesConMascotas) {
        this.antecedentesConMascotas = antecedentesConMascotas;
    }

    public boolean isDispuestoARecibirSeguimiento() {
        return dispuestoARecibirSeguimiento;
    }

    public void setDispuestoARecibirSeguimiento(boolean dispuestoARecibirSeguimiento) {
        this.dispuestoARecibirSeguimiento = dispuestoARecibirSeguimiento;
    }

    public String getCartaCompromiso() {
        return cartaCompromiso;
    }

    public void setCartaCompromiso(String cartaCompromiso) {
        this.cartaCompromiso = cartaCompromiso;
    }

    public SolicitudAdopcion getSolicitud() {
        return solicitud;
    }

    public void setSolicitud(SolicitudAdopcion solicitud) {
        this.solicitud = solicitud;
    }
}
