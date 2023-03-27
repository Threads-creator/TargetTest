package org.example.questao2;

import static org.junit.Assert.*;
import org.junit.Test;

public class FibonacciTest {

    @Test
    public void verificarSeqFibonacci() {
        assertEquals("O Valor " + 0 + " informado pertence a seguencia de fibonacci", Fibonacci.verificarSeqFibonnaci(0));
        assertEquals("O Valor " + 1 + " informado pertence a seguencia de fibonacci", Fibonacci.verificarSeqFibonnaci(1));
        assertEquals("O Valor " + 8 + " informado pertence a seguencia de fibonacci", Fibonacci.verificarSeqFibonnaci(8));
        assertEquals("O Valor " + 12 + " informado NÃO pertence a seguencia de fibonacci", Fibonacci.verificarSeqFibonnaci(12));
        assertEquals("O Valor " + 27 + " informado NÃO pertence a seguencia de fibonacci", Fibonacci.verificarSeqFibonnaci(27));
    }
}
