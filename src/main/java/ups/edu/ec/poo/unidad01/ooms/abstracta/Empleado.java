/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ups.edu.ec.poo.unidad01.ooms.abstracta;

import java.time.LocalDate;

/**
 *
 * @author HP USER
 */
public class Empleado extends Persona {

    public Empleado(String cedula, String nombre, LocalDate yearNacimiento) {
        super(cedula, nombre, yearNacimiento);
    }
    

    @Override
    public String obtenerInformacion() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
