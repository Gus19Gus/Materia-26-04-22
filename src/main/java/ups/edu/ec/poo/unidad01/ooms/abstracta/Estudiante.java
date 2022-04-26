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
public class Estudiante extends Persona{
    
    private String carrera;

    public Estudiante(String cedula, String nombre, LocalDate yearNacimiento) {
        super(cedula, nombre, yearNacimiento);
    }

    @Override
    public String obtenerInformacion() {
        return "El empleado se llama" + this.getNombre() +
                "y el sueldo es " ; 
    }
}
