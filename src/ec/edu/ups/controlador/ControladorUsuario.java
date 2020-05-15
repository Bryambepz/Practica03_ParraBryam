/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.idao.ITelefonoDAO;
import ec.edu.ups.idao.IUsuarioDAO;
import ec.edu.ups.modelo.Telefono;
import ec.edu.ups.modelo.Usuario;
import ec.edu.ups.vista.VistaTelefono;
import ec.edu.ups.vista.VistaUsuario;
import java.util.List;

/**
 *
 * @author braya
 */
public class ControladorUsuario{
    //objetos vista
    private VistaUsuario vistaUsuario;
    private VistaTelefono vistaTelefono;
    //objetos modelo
    private Usuario usuario;
    private Telefono telefono;
    //objetos DAO
    private IUsuarioDAO usuarioDAO;
    private ITelefonoDAO telefonoDAO;

    public ControladorUsuario(VistaUsuario vistaUsuario, VistaTelefono vistaTelefono, IUsuarioDAO usuarioDAO, ITelefonoDAO telefonoDAO) {
        this.vistaUsuario = vistaUsuario;
        this.vistaTelefono = vistaTelefono;
        
        this.usuarioDAO = usuarioDAO;
        this.telefonoDAO = telefonoDAO;
    }
     
       
    public void registrar(){
        usuario=vistaUsuario.ingresarUsuario();
        usuarioDAO.create(usuario);
    }
    
    public void confirmarU(){
        usuario=vistaUsuario.confirmarUsuario();
        usuarioDAO.confirmarU(usuario.getCorreo(), usuario.getContraseña());
    }
    public void actualizar(){
        usuario=vistaUsuario.actualizarUsuario();
        usuarioDAO.update(usuario);
    }
    
    public void eliminar(){
        usuario=vistaUsuario.eliminarUsuario();
        usuarioDAO.delete(usuario);
    }
    
    public void buscarUsuario(){
        String cedula=vistaUsuario.buscarUsuario();
        usuario=usuarioDAO.read(cedula);
        vistaUsuario.verUsuario(usuario);
    }
              
    public void agregarTelefono(){
        int codigo=vistaTelefono.buscarTelefono();
        telefono=telefonoDAO.read(codigo);
        usuario.registrar(telefono);
        usuarioDAO.update(usuario);
    }
    
    public void verUsuarios(){
        List<Usuario> usuarios;
        usuarios=usuarioDAO.findall();
        vistaUsuario.listarUsuarios(usuarios);
    }
    
    public void telefonosPorCedula(){
        String cedula=vistaUsuario.buscarUsuario();
        usuario=usuarioDAO.read(cedula);
        List<Telefono> telefonos=usuario.getTelefonos();    
    }
     
}
