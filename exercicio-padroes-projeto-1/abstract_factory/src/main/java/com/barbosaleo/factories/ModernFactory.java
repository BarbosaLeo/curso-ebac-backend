/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.barbosaleo.factories;

import com.barbosaleo.moveis.Cadeira;
import com.barbosaleo.moveis.CadeiraModerno;
import com.barbosaleo.moveis.Mesa;
import com.barbosaleo.moveis.MesaModerno;
import com.barbosaleo.moveis.Sofa;
import com.barbosaleo.moveis.SofaModerno;

/**
 *
 * @author leona
 */
public class ModernFactory implements AbstractFactory {

    @Override
    public Cadeira criarCadeira() {
        return new CadeiraModerno();
    }

    @Override
    public Mesa criarMesa() {
        return new MesaModerno();
    }

    @Override
    public Sofa criarSofa() {
        return new SofaModerno();
    }
    
}
