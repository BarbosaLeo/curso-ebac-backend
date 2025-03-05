/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.barbosaleo.generics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author leona
 */
public class Veiculos<T extends Veiculo> {
    
    public Map<Integer,T> entities;
    
    public Veiculos(){
        this.entities = new HashMap<Integer,T>();
    }
    
    public void addVeiculo(T veiculo){
        entities.put(veiculo.getIdChassis(), veiculo);
    }
    
    public T getVeiculo(Integer id){
        return entities.get(id);
    }
    
    public String getMarcaVeiculo(Integer id){
        return entities.get(id).getMarca();
    }
    
    public void removeVeiculo(T veiculo){
       Integer id = veiculo.getIdChassis();
       if(entities.containsKey(id)){
           entities.remove(id);
       } 
    }
    
}
