import org.listaLSESlide06.EmptySLinkedList;
import org.listaLSESlide06.SLinkedList;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;


public class SLinkedListTest {
    @Test
    public void testAdddHead() {

        SLinkedList s = new SLinkedList();

        assertEquals("[]", s.toString());  // Sem a mensagem extra
        s.addHead("BOS");
        assertEquals("[BOS]", s.toString());  // Sem a mensagem extra
        s.addHead("ATL");
        assertEquals("[ATL, BOS]", s.toString());  // Sem a mensagem extra
        s.addHead("MSP");
        assertEquals("[MSP, ATL, BOS]", s.toString());  // Sem a mensagem extra
        s.addHead("LAX");
        assertEquals("[LAX, MSP, ATL, BOS]", s.toString());
    }
    @Test
    public void testAddTail() {

        SLinkedList s = new SLinkedList();

        assertEquals("[]", s.toString());  // Compara o valor esperado com o retornado
        s.addTail("MSP");
        assertEquals("[MSP]", s.toString());  // Compara o valor esperado com o retornado
        s.addTail("ATL");
        assertEquals("[MSP, ATL]", s.toString());  // Compara o valor esperado com o retornado
        s.addTail("BOS");
        assertEquals("[MSP, ATL, BOS]", s.toString());  // Compara o valor esperado com o retornado
        s.addTail("MIA");
        assertEquals("[MSP, ATL, BOS, MIA]", s.toString());

    }
    @Test
    public void testRemoveFirst() {
        SLinkedList s = new SLinkedList();

        assertEquals("[]", s.toString());  // Comparação sem mensagem extra
        s.addTail("MSP");
        assertEquals("[MSP]", s.toString());  // Comparação sem mensagem extra
        s.addTail("BOS");
        assertEquals("[MSP, BOS]", s.toString());  // Comparação sem mensagem extra
        s.removeFirst();
        assertEquals("[BOS]", s.toString());  // Comparação sem mensagem extra
        s.removeFirst();
        assertEquals("[]", s.toString());  // Comparação sem mensagem extra
        assertThrows(EmptySLinkedList.class, () -> { s.removeFirst(); });

    }

}
