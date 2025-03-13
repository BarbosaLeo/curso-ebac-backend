/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.barbosaleo.exceptions;

/**
 *
 * @author Leonardo
 */
public class TipoChaveNaoEncontradaException extends Exception {
    
    
    public TipoChaveNaoEncontradaException(String msg){
        this(msg, null);
    }
    
    public TipoChaveNaoEncontradaException(String msg, Throwable e){
        super(msg, e);
    }
}
