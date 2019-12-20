/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jherom Chacon
 */
public class Persona {
    public String nombre;
    String apellido;
    int edad;
    char sexo;
    private List<Direccion> direcciones = new ArrayList<Direccion>();
    public void setSexo(char param){
        this.sexo = param;
    }
    public String saludar(){
        return "Hola";
    }
    public void addDireccion(Direccion direccion) throws Exception{
        if (exists(direccion)){
            throw new Exception("Direccion ya existe");
        }                
        this.direcciones.add(direccion);
    }
    public Direccion getNewDireccion(){
        return new Direccion();
    }
    public boolean exists(Direccion direccion) {
        for(Direccion direccionAlmacenada : this.direcciones){
            if(direccionAlmacenada.provincia == direccion.provincia &&
                    direccionAlmacenada.canton.equals(direccion.canton))
                return true;
        }
        return false;
    }
    public enum Provincia{
        SanJose,
        Cartago,
        Heredia,
        Alajuela,
        Puntarenas,
        Limon,
        Guanacaste
    }
    public class Direccion{
        public Provincia provincia;
        public String canton;
    }
}
