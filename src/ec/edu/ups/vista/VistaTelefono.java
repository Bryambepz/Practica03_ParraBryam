/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista;

import ec.edu.ups.modelo.Telefono;
import ec.edu.ups.modelo.Usuario;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author braya
 */
public class VistaTelefono {

    private Scanner leer;

    public VistaTelefono() {
        leer = new Scanner(System.in);
    }

    public Telefono ingresarTelefono() {
        leer = new Scanner(System.in);
        System.out.println("Ingrese datos del telefono");
        System.out.println("Ingrese codigo");
        int codigo = leer.nextInt();
        System.out.println("Ingrese numero");
        String numero = leer.next();
        System.out.println("Ingrese tipo");
        String tipo = leer.next();
        System.out.println("Ingrese operadora");
        String operadora = leer.next();
        System.out.println("\n--");
        return new Telefono(codigo, numero, tipo, operadora);
    }

    public Telefono actualizarTelefono() {
        System.out.println("Ingrese codigo del telefono para actualizar");
        int codigo = leer.nextInt();
        System.out.println("Ingrse los nuevos detos: numero, tipo, operadora");
        System.out.println("Ingrese nuevo numero");
        String numero = leer.next();
        System.out.println("Ingrese nuevo tipo");
        String tipo = leer.next();
        System.out.println("Ingrese nueva operadora");
        String operadora = leer.next();
        System.out.println("\n--");
        return new Telefono(codigo, numero, tipo, operadora);
    }

    public Telefono eliminarTelefono() {
        leer = new Scanner(System.in);
        System.out.println("Ingrese codigo del telefono a eliminar");
        int codigo=leer.nextInt();
        System.out.println("\n--");
        return new Telefono(codigo, null, null, null);
    }

    public int buscarTelefono() {
        leer = new Scanner(System.in);
        System.out.println("Ingrese codigo del telefono a buscar");
        int codigo=leer.nextInt();
        System.out.println("\n--");
        return codigo;
    }
    
    public void verTelefono(Telefono telefono){
        System.out.println("Datos del telefono: "+ telefono);
    }
    public void listarTelefonos(List<Telefono> telefonos) {
        for (Telefono telefono : telefonos) {
            System.out.println("Datos del telefono: "+ telefono);
        }
        System.out.println("--\n");
    }
}
