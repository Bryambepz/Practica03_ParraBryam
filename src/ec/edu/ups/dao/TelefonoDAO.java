/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.dao;

import ec.edu.ups.idao.ITelefonoDAO;
import ec.edu.ups.modelo.Telefono;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 *
 * @author braya
 */
public class TelefonoDAO implements ITelefonoDAO{
    private Map<Integer,Telefono> listaTelefonos;
    
    public TelefonoDAO(){
        listaTelefonos=new HashMap<>();
    }
    @Override
    public void create(Telefono telefono) {
        listaTelefonos.put(telefono.hashCode(),telefono);
    }

    @Override
    public Telefono read(int codigo) {
        Telefono telefono = new Telefono(codigo, null, null, null);
        if(listaTelefonos.containsKey(telefono.hashCode())){
                return listaTelefonos.get(telefono.hashCode());
        }
        return null;
    }

    @Override
    public void update(Telefono telefono) {
        if(listaTelefonos.containsKey(telefono.hashCode())){
            listaTelefonos.replace(telefono.hashCode(), telefono);
        }
    }

    @Override
    public void delete(Telefono telefono) {
        if(listaTelefonos.containsKey(telefono.hashCode())){
            listaTelefonos.remove(telefono.hashCode());
        }
    }

    @Override
    public List<Telefono> findall() {
        return new ArrayList<>(listaTelefonos.values());
    }
    
}
