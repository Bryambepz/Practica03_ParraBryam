    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista;

import ec.edu.ups.modelo.Usuario;
import java.util.List;
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
        System.out.println("Ingrese datos del Usuario para registrarse");
        System.out.println("Ingrese cedula");
        String cedula=leer.next();
        System.out.println("Ingrese nombre");
        String nombre=leer.next();
        System.out.println("Ingrese apellido");
        String apellido=leer.next();
        System.out.println("Ingrese correo del usuario");
        String correo=leer.next();
        System.out.println("ingrese contraseña del usuario");
        String contraseña=leer.next();
        return new Usuario(cedula, nombre, apellido, correo, contraseña);
    }
    
    public Usuario confirmarUsuario(){
        leer=new Scanner(System.in);
        System.out.println("Confirme correo y contraseña");
        System.out.println("Ingrese correo");
        String correo=leer.next();
        System.out.println("Ingrese Contraseña");
        String contraseña=leer.next();
        return new Usuario(null, null, null, correo, contraseña);
    }
    public Usuario actualizarUsuario(){
        
        System.out.println("Ingrese cedula del usuario a actualizar");
        String cedula=leer.next();
        System.out.println("Ingrse los nuevos detos: Nombre, Apellido, Correo, Contraseña");
        String nombre=leer.next();
        String apellido=leer.next();
        String correo=leer.next();
        String contraseña=leer.next();
        return new Usuario(cedula, nombre, apellido, correo, contraseña);
    }
    
    public Usuario eliminarUsuario(){
        leer=new Scanner(System.in);
        System.out.println("Ingrese cedula del usuario a eliminar");
        String cedula=leer.next();
        return new Usuario(cedula, null, null, null, null);
    }
    
    /**public String buscarUsuario(){
        leer=new Scanner(System.in);
        System.out.println("Ingrese cedula del usuario a buscar");
        String cedula=leer.next();
        return cedula;
    }
    
    public void listarUsuarios(List<Usuario> usuarios){
        for (Usuario usuario : usuarios) {
            System.out.println("Datos del usuario: "+usuario);
        }
    }*/
}