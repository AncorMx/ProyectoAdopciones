/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.DTO;

import java.util.Date;

/**
 *
 * @author Josel
 */


public class SolicitudAdopcionDTO {

    private InfoPersonalDTO infoPersona;
    private InfoViviendaDTO infoVivienda;
    private Razones_AntecedentesDTO razones;
    private Date fechaCita;
    private Long mascotaId;
    private String mascotaNombre;

    public SolicitudAdopcionDTO(InfoPersonalDTO infoPersona, InfoViviendaDTO infoVivienda, Razones_AntecedentesDTO razones, Date fechaCita, Long mascotaId, String mascotaNombre) {
        this.infoPersona = infoPersona;
        this.infoVivienda = infoVivienda;
        this.razones = razones;
        this.fechaCita = fechaCita;
        this.mascotaId = mascotaId;
        this.mascotaNombre = mascotaNombre;
    }

    public InfoPersonalDTO getInfoPersona() {
        return infoPersona;
    }

    public InfoViviendaDTO getInfoVivienda() {
        return infoVivienda;
    }

    public Razones_AntecedentesDTO getRazones() {
        return razones;
    }

    public Date getFechaCita() {
        return fechaCita;
    }

    public Long getMascotaId() {
        return mascotaId;
    }

    public String getMascotaNombre() {
        return mascotaNombre;
    }
}
