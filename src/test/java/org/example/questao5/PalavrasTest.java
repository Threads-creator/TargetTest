package org.example.questao5;

import org.junit.Assert;
import org.junit.Test;

public class PalavrasTest {

    @Test
    public void verificarInverterPalavras(){
        Assert.assertEquals("ama", Palavras.inverterString("ama"));
        Assert.assertEquals("macaco", Palavras.inverterString("ocacam"));
        Assert.assertEquals("não", Palavras.inverterString("oãn"));
        Assert.assertEquals("noção", Palavras.inverterString("oãçon"));
    }
}
