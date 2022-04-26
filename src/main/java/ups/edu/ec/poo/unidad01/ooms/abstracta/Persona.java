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
public abstract class Persona {
    private String cedula;
    private String nombre;
    private LocalDate yearNacimiento;

    public Persona(String cedula, String nombre, LocalDate yearNacimiento) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.yearNacimiento = yearNacimiento;
    }

   
    
    public abstract String obtenerInformacion();

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    

      public void setYearNacimiento(LocalDate yearNacimiento) {
        this.yearNacimiento = yearNacimiento;
    }
  
    public boolean esCedulaValida(){
        if(cedula.length()==10){
            return true;
        }else{
            return false;
        }
}}
