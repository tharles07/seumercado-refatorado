
package com.mycompany.seumercado.service;


import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class ProdutoCalculoServiceTest {

    @Test
    public void testeCalcularDesconto() {

        ProdutoCalculoService service = new ProdutoCalculoService();

        double resultado = service.calcularDesconto(100, 10);

        assertEquals(90, resultado, 0.01);

    }

}