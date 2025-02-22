/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.barbosaleo.abstract_factory;

import com.barbosaleo.factories.AbstractFactory;
import com.barbosaleo.factories.BasicFactory;
import com.barbosaleo.factories.ModernFactory;
import com.barbosaleo.factories.RusticFactory;

/**
 *
 * @author leona
 */
public class Main {

    private static Aplicacao appInit(){
        
        Aplicacao app;
        AbstractFactory fabrica;
        
        String familiaMovel = "Qualquer";
        
        if (familiaMovel.contains("Rustic")) {
            fabrica = new RusticFactory();
        }
        else if (familiaMovel.contains("Modern")){
            fabrica = new ModernFactory();
        }
        else{
            fabrica = new BasicFactory();
        }
        app = new Aplicacao(fabrica);
        
        return app;
    }
    
    public static void main(String[] args) {
        Aplicacao app = appInit();
        app.sentar();
    }
}
