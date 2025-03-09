/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.barbosaleo.annotation;

import java.lang.reflect.Field;

/**
 *
 * @author Leonardo
 */
public class Main {
    
    public static void main(String[] args) {
        
        Class cl = Tabela.class;
        
        Field[] fields = cl.getDeclaredFields();
        
        for(Field field: fields){
            
            if(field.isAnnotationPresent(TabelaAnnotation.class)){
                TabelaAnnotation tabela = field.getAnnotation(TabelaAnnotation.class);
                String nome = tabela.value();
                System.out.println(nome);
            }
        }
        
    }
}
