/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.barbosaleo.abstract_factory;

import com.barbosaleo.factories.AbstractFactory;
import com.barbosaleo.moveis.Cadeira;
import com.barbosaleo.moveis.Mesa;
import com.barbosaleo.moveis.Sofa;

/**
 *
 * @author leona
 */
public class Aplicacao {
    
    private Cadeira cadeira;
    private Sofa sofa;
    private Mesa mesa;
    
    public Aplicacao(AbstractFactory fabrica){
        cadeira = fabrica.criarCadeira();
        sofa = fabrica.criarSofa();
        mesa = fabrica.criarMesa();
    }
    
    public void sentar(){
        cadeira.sentar();
        sofa.sentar();
        mesa.sentar();
    }
    
}
