
package com.barbosaleo.dao.generic;

import java.io.Serializable;
import java.util.Collection;

/**
 *
 * @author Leonardo
 * @param <T> 
 * @param <E> 
 */
public interface IGenericDao<T, E extends Serializable> {
    
    public T cadastrar(T entity);
    
    public void excluir(E value);

    public void alterar(T entity);
    
}
