
package com.barbosaleo.factories;

import com.barbosaleo.moveis.Cadeira;
import com.barbosaleo.moveis.Mesa;
import com.barbosaleo.moveis.Sofa;

/**
 *
 * @author leona
 */
public interface AbstractFactory {
    
    Cadeira criarCadeira();
    Mesa criarMesa();
    Sofa criarSofa();
    
}
