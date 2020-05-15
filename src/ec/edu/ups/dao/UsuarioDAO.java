/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.dao;

import ec.edu.ups.idao.IUsuarioDAO;
import ec.edu.ups.modelo.Usuario;
import ec.edu.ups.vista.VistaUsuario;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 *
 * @author braya
 */
public class UsuarioDAO implements IUsuarioDAO{
    private Map<Integer,Usuario> listaUsuario;
    private int cont=0;
    protected String c="correcto";
    protected String ic="incorrecto";

    public UsuarioDAO(){
        listaUsuario=new HashMap<>();
    }
    
    @Override
    public void create(Usuario usuario) {
        listaUsuario.put(usuario.hashCode(),usuario);
    }
    
    @Override
    public Usuario confirmarU(String correo, String contraseña) {
        List<Usuario> usuarios = new ArrayList<>(listaUsuario.values());
        for (Usuario usuario : usuarios) {
            if(usuario.getCorreo().equals(correo) && usuario.getContraseña().equals(contraseña)){
                System.out.println(c);
                return usuario;
            }else{
                System.out.println(ic);
                return null;
            }
        }
        
        return null;
    }
    
    @Override
    public Usuario read(String cedula) {
        Usuario usuario=new Usuario(cedula, null, null, null, null);
        if(listaUsuario.containsKey(usuario.hashCode())){
            return listaUsuario.get(usuario.hashCode());
        }
        return null;
    }

    @Override
    public void update(Usuario usuario) {
         if(listaUsuario.containsKey(usuario.hashCode())){
            System.out.println("listaDAO");
            listaUsuario.replace(usuario.hashCode(), usuario);
        }
    }

    @Override
    public void delete(Usuario usuario) {
        if(listaUsuario.containsKey(usuario.hashCode())){
            listaUsuario.remove(usuario.hashCode());
        }
    }

    @Override
    public List<Usuario> findall() {
        return new ArrayList<>(listaUsuario.values());
    }

    
    
}
