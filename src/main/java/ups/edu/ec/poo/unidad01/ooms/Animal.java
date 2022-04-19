/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ups.edu.ec.poo.unidad01.ooms;

import java.time.LocalDate;

/**
 *
 * @author HP USER
 */
public class Animal {
    private String nombre;
    private int yearNacimiento;
    private String color;
    private String raza;
    
    public int calcularEdad(){
        return LocalDate.now().getYear()-this.yearNacimiento;
    }
    //Getters and Setters
    //get da año y set devuelve el dato que se esta dando 
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getYearNacimiento() {
        return this.yearNacimiento;
    }

    public void setYearNacimiento(int y) {
        this.yearNacimiento = y;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
    
}
