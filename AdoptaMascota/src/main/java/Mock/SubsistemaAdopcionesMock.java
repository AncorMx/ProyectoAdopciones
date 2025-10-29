/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Mock;

import Interface.ISubsistemaAdopciones;
import com.mycompany.DTO.MascotaDTO;
import com.mycompany.DTO.SolicitudAdopcionDTO;
import java.util.ArrayList;
import java.util.List;



/**
 *
 * @author mmax2
 */
public class SubsistemaAdopcionesMock implements ISubsistemaAdopciones{
    @Override
    public List<MascotaDTO> obtenerMascotasDisponibles() {
        List<MascotaDTO> mascotas = new ArrayList<>();
        
        
        mascotas.add(new MascotaDTO(
                "Salchicho", "Perro", "Dachshund", 3, "Ninguna", 
                "/IMG/imgi_1_macho-letra-N.jpg", "disponible"));
        
        mascotas.add(new MascotaDTO(
                 "Pelusa", "Perro", "Yorkshire", 2, "Ninguna", 
                "/IMG/imgi_1_61OrHjHFlXL.jpg", "disponible"));
        
        mascotas.add(new MascotaDTO(
                 "Max", "Perro", "Golden Retriever", 5, "Cadera sensible", 
                "/IMG/imgi_1_71vwkcrD5mL.jpg", "disponible"));
        mascotas.add(new MascotaDTO(
                 "Oreo", "Perro", "Border Collie", 1, "Mucha energia", 
                "/IMG/imgi_1_91m34y-EkTL.jpg", "disponible"));
        
        return mascotas;
    }
    @Override
    public boolean registrarSolicitud(SolicitudAdopcionDTO solicitud) {
        System.out.println("----- Solicitud Recibida por el Subsistema -----");
        System.out.println("Mascota: " + solicitud.getMascotaNombre() + " (ID: " + solicitud.getMascotaId() + ")");
        System.out.println("Fecha Cita: " + solicitud.getFechaCita().toString());
        System.out.println("Adoptante: " + solicitud.getUsuario().getNombre());
        System.out.println("Carta Compromiso: " + solicitud.getRazones().getCartaCompromiso().substring(0, 20) + "...");
        System.out.println("-------------------------------------------------");
        
        return true; 
    }
    
    @Override
    public String obtenerNumeroContactoRefugio() {
        return "+52 (644) 123-4567";
    }
}
