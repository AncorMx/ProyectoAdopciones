/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Entities;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import java.util.List;

/**
 *
 * @author Josel
 */

@Entity
public class InfoVivienda {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String descripcion;
    private String tipoVivienda;
    private String estadoVivienda;
    @ElementCollection
    private List<String> imagenesVivienda;

    @OneToOne(mappedBy = "infoVivienda")
    private SolicitudAdopcion solicitud;

    public InfoVivienda() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTipoVivienda() {
        return tipoVivienda;
    }

    public void setTipoVivienda(String tipoVivienda) {
        this.tipoVivienda = tipoVivienda;
    }

    public String getEstadoVivienda() {
        return estadoVivienda;
    }

    public void setEstadoVivienda(String estadoVivienda) {
        this.estadoVivienda = estadoVivienda;
    }

    public List<String> getImagenesVivienda() {
        return imagenesVivienda;
    }

    public void setImagenesVivienda(List<String> imagenesVivienda) {
        this.imagenesVivienda = imagenesVivienda;
    }

    public SolicitudAdopcion getSolicitud() {
        return solicitud;
    }

    public void setSolicitud(SolicitudAdopcion solicitud) {
        this.solicitud = solicitud;
    }
}