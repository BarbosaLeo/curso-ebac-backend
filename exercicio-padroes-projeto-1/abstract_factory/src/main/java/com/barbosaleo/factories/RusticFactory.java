/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.barbosaleo.factories;

import com.barbosaleo.moveis.Cadeira;
import com.barbosaleo.moveis.CadeiraRustico;
import com.barbosaleo.moveis.Mesa;
import com.barbosaleo.moveis.MesaRustico;
import com.barbosaleo.moveis.Sofa;
import com.barbosaleo.moveis.SofaRustico;

/**
 *
 * @author leona
 */
public class RusticFactory implements AbstractFactory {

    @Override
    public Cadeira criarCadeira() {
        return new CadeiraRustico();
    }

    @Override
    public Mesa criarMesa() {
        return new MesaRustico();
    }

    @Override
    public Sofa criarSofa() {
        return new SofaRustico();
    }
    
}
