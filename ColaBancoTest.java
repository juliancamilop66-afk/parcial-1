import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ColaBancoTest {
    
    @Test
    void testEncolarYDesencolar() {
        ColaBanco<String> cola = new ColaBanco<>();
        cola.encolar("Cliente1");
        cola.encolar("Cliente2");
        
        assertEquals("Cliente1", cola.desencolar());
        assertEquals("Cliente2", cola.desencolar());
    }
    
    @Test
    void testEstaVacia() {
        ColaBanco<String> cola = new ColaBanco<>();
        assertTrue(cola.estaVacia());
        
        cola.encolar("Cliente");
        assertFalse(cola.estaVacia());
    }
    
    @Test
    void testTamaño() {
        ColaBanco<String> cola = new ColaBanco<>();
        assertEquals(0, cola.tamaño());
        
        cola.encolar("A");
        cola.encolar("B");
        assertEquals(2, cola.tamaño());
    }
    
    @Test
    void testVaciar() {
        ColaBanco<String> cola = new ColaBanco<>();
        cola.encolar("A");
        cola.encolar("B");
        cola.vaciar();
        assertEquals(0, cola.tamaño());
        assertTrue(cola.estaVacia());
    }
}