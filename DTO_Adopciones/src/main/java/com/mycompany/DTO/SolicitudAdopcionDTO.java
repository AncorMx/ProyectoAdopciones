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

    private UsuarioDTO usuario;
    private InfoViviendaDTO infoVivienda;
    private Razones_AntecedentesDTO razones;
    private Date fechaCita;
    private Long mascotaId;
    private String mascotaNombre;

    public SolicitudAdopcionDTO() {
    }

    public SolicitudAdopcionDTO(UsuarioDTO usuario, InfoViviendaDTO infoVivienda, Razones_AntecedentesDTO razones, Date fechaCita, Long mascotaId, String mascotaNombre) {
        this.usuario = usuario;
        this.infoVivienda = infoVivienda;
        this.razones = razones;
        this.fechaCita = fechaCita;
        this.mascotaId = mascotaId;
        this.mascotaNombre = mascotaNombre;
    }

    public UsuarioDTO getUsuario() {
        return usuario;
    }

    public void setUsuario(UsuarioDTO usuario) {
        this.usuario = usuario;
    }

    public InfoViviendaDTO getInfoVivienda() {
        return infoVivienda;
    }

    public void setInfoVivienda(InfoViviendaDTO infoVivienda) {
        this.infoVivienda = infoVivienda;
    }

    public Razones_AntecedentesDTO getRazones() {
        return razones;
    }

    public void setRazones(Razones_AntecedentesDTO razones) {
        this.razones = razones;
    }

    public Date getFechaCita() {
        return fechaCita;
    }

    public void setFechaCita(Date fechaCita) {
        this.fechaCita = fechaCita;
    }

    public Long getMascotaId() {
        return mascotaId;
    }

    public void setMascotaId(Long mascotaId) {
        this.mascotaId = mascotaId;
    }

    public String getMascotaNombre() {
        return mascotaNombre;
    }

    public void setMascotaNombre(String mascotaNombre) {
        this.mascotaNombre = mascotaNombre;
    }
}
