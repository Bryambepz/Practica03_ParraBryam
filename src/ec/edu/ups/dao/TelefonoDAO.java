/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.dao;

import ec.edu.ups.idao.ITelefonoDAO;
import ec.edu.ups.modelo.Telefono;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author braya
 */
public class TelefonoDAO implements ITelefonoDAO{
    private List<Telefono> listaTelefonos;
    
    public TelefonoDAO(){
        listaTelefonos=new ArrayList<>();
    }
    @Override
    public void create(Telefono telefono) {
        listaTelefonos.add(telefono);
    }

    @Override
    public Telefono read(int codigo) {
        for (Telefono telefono : listaTelefonos) {
            if(telefono.getCodigo()==codigo){
                return telefono;
            }
        }
        return null;
    }

    @Override
    public void update(Telefono telefono) {
         for (int i = 0; i < listaTelefonos.size(); i++) {
            Telefono t = listaTelefonos.get(i);
            if(t.getCodigo()==telefono.getCodigo()){
                listaTelefonos.set(i, telefono);
                break;
            }
        }
    }

    @Override
    public void delete(Telefono telefono) {
        Iterator<Telefono> it=listaTelefonos.iterator();
        while(it.hasNext()){
            Telefono t=it.next();
            if(t.getCodigo()==telefono.getCodigo()){
                it.remove();
                break;
            }
        }
    }

    @Override
    public List<Telefono> findall() {
        return listaTelefonos;
    }
    
}
