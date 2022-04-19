/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ups.edu.ec.poo.unidad01.ooms;

/**
 *
 * @author HP USER
 */
public class PrincipalHerencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        var  perro= new Animal();
        System.out.println("El animal nacio en el año: " + perro.getYearNacimiento()+ " y tiene " + perro.calcularEdad()+ " años ");
    }
    
}
