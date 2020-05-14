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
import ec.edu.ups.vista.VistaUsuario;
import ec.edu.ups.vista.VistaTelefono;

/**
 *
 * @author braya
 */
public class Test {
    public static void main(String[] args) {
        //vista
        VistaUsuario vistau=new VistaUsuario();
        VistaTelefono vistat=new VistaTelefono();
        //DAOs
        UsuarioDAO usuarioDAO=new UsuarioDAO();
        TelefonoDAO telefDAO=new TelefonoDAO();
        //controladores
        ControladorUsuario ctrlus=new ControladorUsuario(vistau, vistat, usuarioDAO, telefDAO);
        ControladorTelefono ctrltelf=new ControladorTelefono(vistat, telefDAO);
        
        //Rgistro de usuario
        ctrlus.registrar();
        //Confirmar usuario
        //agregar telefono
        ctrltelf.registrar();
        
    }
}
