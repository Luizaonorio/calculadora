package calculadora;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestCalculadora {

    @Test
    public void testGetAdicao() {
        Calculadora calculadora = new Calculadora(4.0, 2.0);
        double retornoEsperado = 6.0;
        double retornoFeito = calculadora.getAdicao();
        assertEquals(retornoEsperado, retornoFeito, 0);
    }
    @Test
    public void testGetSubtracao() {
        Calculadora calculadora = new Calculadora(4.0, 2.0);
        double retornoEsperado = 2.0;
        double retornoFeito = calculadora.getSubtracao();
        assertEquals(retornoEsperado, retornoFeito, 0);
    }
    @Test
    public void testGetProduto() {
        Calculadora calculadora = new Calculadora(4.0, 2.0);
        double retornoEsperado = 8.0;
        double retornoFeito = calculadora.getProduto();
        assertEquals(retornoEsperado, retornoFeito, 0);
    }
    @Test
    public void testgetDivisao() {
        Calculadora calculadora = new Calculadora(4.0, 2.0);
        double retornoEsperado = 2.0;
        double retornoFeito = calculadora.getDivisao();
        assertEquals(retornoEsperado, retornoFeito, 0);
    }
}