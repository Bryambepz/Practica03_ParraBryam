/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.idao.ITelefonoDAO;
import ec.edu.ups.modelo.Telefono;
import ec.edu.ups.vista.VistaTelefono;
import java.util.List;

/**
 *
 * @author braya
 */
public class ControladorTelefono {
    //vista
    private VistaTelefono vistaTelefono;
    private Telefono telefono;
    private ITelefonoDAO telefonoDAO;

    public ControladorTelefono(VistaTelefono vistaTelefono, ITelefonoDAO telefonoDAO) {
        this.vistaTelefono = vistaTelefono;
        this.telefonoDAO = telefonoDAO;
    }

    public void registrar(){
        telefono=vistaTelefono.ingresarTelefono();
        telefonoDAO.create(telefono);
    }
    
    public void actualizar(){
        telefono=vistaTelefono.actualizarTelefono();
        telefonoDAO.update(telefono);
    }
    
    public void eliminar(){
        telefono=vistaTelefono.eliminarTelefono();
        telefonoDAO.delete(telefono);
    }
    
    public void buscarTelefono(){
        int codigo=vistaTelefono.buscarTelefono();
        telefono=telefonoDAO.read(codigo);
        vistaTelefono.verTelefono(telefono);
    }
    
    
    public void verTelefonos(){
        List<Telefono> telefonos;
        telefonos=telefonoDAO.findall();
        vistaTelefono.listarTelefonos(telefonos);
    }
}
