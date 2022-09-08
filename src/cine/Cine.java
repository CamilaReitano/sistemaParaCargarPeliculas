/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cine;

import Servicio.ServicioPelicula;

/**
 *
 * @author camir
 */
public class Cine {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ServicioPelicula servicio = new ServicioPelicula();
        servicio.crearListaPelicula();
        servicio.mostrarPeliculas();
        servicio.mayorUnaHora();
        servicio.mayorAMenor();
        servicio.menorAMayor();
        servicio.alfabeticaenteTitulo();
        servicio.alfabeticaenteDirector();
    }
    
}
