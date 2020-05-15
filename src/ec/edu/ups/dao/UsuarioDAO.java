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
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author braya
 */
public class UsuarioDAO implements IUsuarioDAO{
    private List<Usuario> listaUsuario;
    private int cont=0;
    protected String c="correcto";
    protected String ic="incorrecto";

    public UsuarioDAO(){
        listaUsuario=new ArrayList<>();
    }
    
    @Override
    public void create(Usuario usuario) {
        listaUsuario.add(usuario);
    }
    
    @Override
    public Usuario confirmarU(String correo, String contraseña) {
        for (Usuario usuario : listaUsuario) {
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
        for (Usuario usuario : listaUsuario) {
            if(usuario.getCedula()==cedula){
                return usuario;
            }
        }
        return null;
    }

    @Override
    public void update(Usuario usuario) {
        for (int i = 0; i < listaUsuario.size(); i++) {
            Usuario u = listaUsuario.get(i);
            if(u.getCedula()==usuario.getCedula()){
                System.out.println("listaDAO");
                listaUsuario.set(i, usuario);
                break;
            }
        }
    }

    @Override
    public void delete(Usuario usuario) {
        Iterator<Usuario> it=listaUsuario.iterator();
        while(it.hasNext()){
            Usuario u=it.next();
            if(u.getCedula()==usuario.getCedula()){
                it.remove();
                break;
            }
        }
    }

//    @Override
//    public List<Usuario> findall() {
//        return listaUsuario;
//    }

    
    
}
