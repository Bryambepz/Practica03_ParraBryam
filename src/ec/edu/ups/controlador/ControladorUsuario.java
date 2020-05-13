/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.idao.IUsuarioDAO;
import ec.edu.ups.modelo.Usuario;
import ec.edu.ups.vista.VistaUsuario;
import java.util.List;

/**
 *
 * @author braya
 */
public class ControladorUsuario{
    //objetos vista
    private VistaUsuario vistaUsuario;
    //objetos modelo
    private Usuario usuario;
    //objetos DAO
    private IUsuarioDAO usuarioDAO;

    public ControladorUsuario(VistaUsuario vistaUsuario, Usuario usuario, IUsuarioDAO uusuarioDAO) {
        this.vistaUsuario = vistaUsuario;
        this.usuario = usuario;
        this.usuarioDAO = uusuarioDAO;
    }
    
    public void registrar(){
        usuario=vistaUsuario.ingresarUsuario();
        usuarioDAO.create(usuario);
    }
    
    public void actualizar(){
        usuario=vistaUsuario.actualizarUsuario();
        usuarioDAO.update(usuario);
    }
    
    public void eliminar(){
        usuario=vistaUsuario.eliminarUsuario();
        usuarioDAO.delete(usuario);
    }
    
    public void verUsuario(){
        List<Usuario> usuarios;
        usuarios=usuarioDAO.findall();
        vistaUsuario.listarUsuarios(usuarios);
    }
    
     
}
