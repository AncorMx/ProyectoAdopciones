/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.DTO;

import java.awt.Image;
import java.util.Set;

/**
 *
 * @author Josel
 */
public class InfoViviendaDTO {

    private String descripcion;
    private String tipoVivienda; 
    private String estadoVivienda;
    private Set<Image> imagenesVivienda;

    public InfoViviendaDTO() {
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

    public Set<Image> getImagenesVivienda() {
        return imagenesVivienda;
    }

    public void setImagenesVivienda(Set<Image> imagenesVivienda) {
        this.imagenesVivienda = imagenesVivienda;
    }
}
