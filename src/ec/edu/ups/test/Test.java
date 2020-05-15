/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.test;

import ec.edu.ups.controlador.ControladorTelefono;
import ec.edu.ups.controlador.ControladorUsuario;
import ec.edu.ups.dao.TelefonoDAO;
import ec.edu.ups.dao.UsuarioDAO;
import ec.edu.ups.modelo.Usuario;
import ec.edu.ups.vista.VistaUsuario;
import ec.edu.ups.vista.VistaTelefono;
import java.util.Scanner;

/**
 *
 * @author braya
 */
public class Test {

    public static void main(String[] args) {
        //modelo
        Usuario u = new Usuario();
        //vista
        VistaUsuario vistau = new VistaUsuario();
        VistaTelefono vistat = new VistaTelefono();
        //DAOs
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        TelefonoDAO telefDAO = new TelefonoDAO();
        //controladores
        ControladorUsuario ctrlus = new ControladorUsuario(vistau, vistat, usuarioDAO, telefDAO);
        ControladorTelefono ctrltelf = new ControladorTelefono(vistat, telefDAO);

        Scanner l = new Scanner(System.in);

        //Rgistro de usuario
        ctrlus.registrar();
        //confirmar usuario;
        //u = vistau.ingresarUsuario();
        ctrlus.confirmarU();
        //ctrlus.verUsuarios();

        if (u != null) {
            int op = 0;
            while (op != 8 && op <= 8) {
                System.out.println("Menu: " + "\n1)Registrar telefono" + "\n2)Modificar Telefono" + "\n3)Eliminar Telefono"
                        + "\n4)Buscar telefono" + "\n5)Listar telefonos" + "\n6)Listar los números de teléfono de un usuario" + "\n7)Listar todos los teléfonos (DAOTelefono)"
                        + "\n8)Salir");
                System.out.println("ingrese opcion");
                op = l.nextInt();
                switch (op) {
                    case 1:
                        //agregar telefono
                        System.out.println("Ingrese numero de telefonos que desea");
                        int ntelf = l.nextInt();
                        System.out.println("Ingrese " + ntelf + " telefono/s");
                        for (int i = 0; i < ntelf; i++) {
                            System.out.println("Ingrese telefono: " + (i + 1));
                            ctrltelf.registrar();
                            ctrltelf.verTelefonos();
                        }
                        ctrlus.verUsuarios();
                        break;
                    case 2:
                        //modificar telefono
                        ctrltelf.actualizar();
                        ctrltelf.verTelefonos();
                        break;
                    case 3:
                        //eliminar telefono
                        ctrltelf.eliminar();
                        ctrltelf.verTelefonos();
                        break;
                    case 4:
                        //buscar telefono
                        ctrltelf.buscarTelefono();
                        break;
                    case 5:
                        //listar telefonos
                        ctrltelf.verTelefonos();
                        break;
                    case 6:
                        //listar telefonos del usuario(DAOUsuario)
                        System.out.println("lista de telefonos del usuario");
                        ctrltelf.verTelefonos();
                        
                        break;
                    case 7:
                        //listar telefonos del usuario(DAOTelefono)
                        System.out.println("Lista de telefonoas");
                        ctrltelf.verTelefonos();
                        break;
                }
            }
        } else {
            System.out.println("Correo o contraseña incorrectos1");
        }

    }
}
