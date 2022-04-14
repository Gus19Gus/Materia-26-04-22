/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ups.edu.ec.poo.unidad01.ooms;

/**
 *
 * @author HP USER
 */
public class PrincipalAutoPropietario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        var auto= new Auto();
        auto.color="plata";
        auto.marca="Chevrolet";
        auto.precio=13000;
        auto.placa="ABG595";
        auto.year=2016;
        var propietario = new Propietario();
        propietario.nombre="Pedro";
        propietario.direccion="Paris y Oslo";
        propietario.telefono="09862563215";
        auto.propietario=propietario;
        
        System.out.println("placa es:" + auto.placa);
        System.out.println("El propietario es " + auto.propietario.nombre);
        
    }
    
}
