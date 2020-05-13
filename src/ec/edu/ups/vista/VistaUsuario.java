    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista;

import ec.edu.ups.modelo.Usuario;
import java.util.Scanner;

/**
 *
 * @author braya
 */
public class VistaUsuario {
    private Scanner leer;

    public VistaUsuario() {
        leer=new Scanner(System.in);
    }
    
    public Usuario ingresarUsuario(){
        leer=new Scanner(System.in);
        System.out.println("Ingrese datos del Usuario");
        String cedula=leer.next();
        String nombre=leer.next();
        String apellido=leer.next();
        String correo=leer.next();
        String contraseña=leer.next();
        return new Usuario(cedula, nombre, apellido, correo, contraseña);
    }
}
