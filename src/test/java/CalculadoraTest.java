import junit.Calculadora;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculadoraTest {

    @Test
    public void testSoma() {
        Calculadora cal = new Calculadora();
        assertEquals(5, cal.Soma(2,3));
    }
    @Test
    public void testSubtracao() {
        Calculadora cal = new Calculadora();
        assertEquals(2, cal.Subtracao(5,3));
    }
    @Test
    public void testMultiplicacao() {
        Calculadora cal = new Calculadora();
        assertEquals(10, cal.Multiplicacao(5,2));
    }
    @Test
    public void testDivisao() {
        Calculadora cal = new Calculadora();
        assertEquals(10, cal.divisao(20,2));
    }
}
