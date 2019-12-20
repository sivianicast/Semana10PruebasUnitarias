/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primerparcialtercerapartesegundoejercicio;

import entidades.Persona;
import util.Utilidades;

/**
 *
 * @author Jherom Chacon
 */
public class PrimerParcialTerceraParteSegundoEjercicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.nombre = "Carlitos";
        persona.setSexo('M');
        int resultado = Utilidades.suma(1,1);
        int resultadoResta = Utilidades.resta(3,2);
    }
    
}
