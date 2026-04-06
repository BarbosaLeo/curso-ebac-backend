/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.barbosaleo.exceptions;

/**
 *
 * @author Leonardo
 */
public class TipoElementoNaoConhecidoException extends Exception{
    
    public TipoElementoNaoConhecidoException(String msg){
        this(msg,null);
    }
    
    public TipoElementoNaoConhecidoException(String msg, Throwable e){
        super(msg, e);
    }
    
}
