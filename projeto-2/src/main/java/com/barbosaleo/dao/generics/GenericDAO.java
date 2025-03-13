/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.barbosaleo.dao.generics;

import com.barbosaleo.annotations.TipoChave;
import com.barbosaleo.domain.Persistente;
import com.barbosaleo.exceptions.TipoChaveNaoEncontradaException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.Map;

/**
 *
 * @author Leonardo
 * @param <T>
 */
public abstract class GenericDAO<T extends Persistente> implements IGenericDAO<T> {
    
    private SingletonMap singletonMap;
    
    public abstract Class<T> getTipoClasse();
    
    public abstract void atualizarDados(T entry, T entityCadastrado);
    
    public Long getChave(T entity) throws TipoChaveNaoEncontradaException {
        Field[] fields = entity.getClass().getDeclaredFields();
        Long retorno = null;
        for(Field field : fields){
            if(field.isAnnotationPresent(TipoChave.class)){
                TipoChave tipoChave = field.getAnnotation(TipoChave.class);
                String nomeMetodo = tipoChave.value();
                
                try {
                    Method metodo = entity.getClass().getMethod(nomeMetodo);
                    retorno = (Long) metodo.invoke(entity);
                    return retorno;
                } catch (Exception e) {
                    throw new TipoChaveNaoEncontradaException("");
                }
            }
        }
        
        if(retorno == null){
            String msg = "Chave principal do objeto " + 
                    entity.getClass() +
                    " não encontrada";
            System.out.println("*******");
            throw new TipoChaveNaoEncontradaException(msg);
        }
        return null;
    }
    
    @Override
    public Boolean cadastrar(T entity) throws TipoChaveNaoEncontradaException{
        Map<Long,T> mapaInterno = (Map<Long,T>) this.singletonMap.getMap().get(getTipoClasse());
        Long chave = getChave(entity);
        if(mapaInterno.containsKey(chave)){
            return false;
        }
        mapaInterno.put(chave, entity);
        return true;
    }

    @Override
    public Boolean excluir(Long valor){
        Map<Long,T> mapaInterno = (Map<Long,T>) this.singletonMap.getMap().get(getTipoClasse());
        T objetoCadastrado = mapaInterno.get(valor);
        if(objetoCadastrado != null){
            mapaInterno.remove(valor, objetoCadastrado);
            return true;
        }
        return false;
    }

    @Override
    public Boolean alterar(T entity) throws TipoChaveNaoEncontradaException{
        Map<Long,T> mapaInterno = (Map<Long,T>) this.singletonMap.getMap().get(getTipoClasse());
        Long chave = getChave(entity);
        T objetoCadastrado = mapaInterno.get(chave);
        if(objetoCadastrado != null){
            atualizarDados(entity, objetoCadastrado);
            return true;
        }
        return false;
    }

    @Override
    public T consultar(Long valor){
        Map<Long,T> mapaInterno = (Map<Long,T>) this.singletonMap.getMap().get(getTipoClasse());
        return mapaInterno.get(valor);
    }
    
    @Override
    public Collection<T> buscarTodos(){
        Map<Long,T> mapaInterno = (Map<Long,T>) this.singletonMap.getMap().get(getTipoClasse());
        return mapaInterno.values();
    }
    
}
