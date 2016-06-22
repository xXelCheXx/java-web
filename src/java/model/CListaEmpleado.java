/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author root
 */
public class CListaEmpleado {
    
    private final ArrayList<CEmpleado> lEmpleado;
    
    public CListaEmpleado(){
        lEmpleado = new ArrayList<>();
    }
    
    
    public String insertarEmpleado(CEmpleado objEmpleado){
        if(this.BuscarEmpleado(objEmpleado.getDNI()) == null){
            this.lEmpleado.add(objEmpleado);
            return "Se agrego Correctamente, Felicidades";
        }        
        return "El Empleado ya esta registrado";
    }
    
    public CEmpleado BuscarEmpleado(String DNI){
        for(CEmpleado objEmpleado : lEmpleado){
            if(objEmpleado.getDNI().equals(DNI)){
                return objEmpleado;
            }
        }
        return null;
    }
    
    
    public int entPersona(){
        return this.lEmpleado.size();
    }
    
    public CPersona posPersona(int pos){
        return this.lEmpleado.get(pos);
    }
}
