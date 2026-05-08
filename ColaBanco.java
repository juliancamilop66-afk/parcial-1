import java.util.LinkedList;
import java.util.Queue;

public class ColaBanco<T> {
    private Queue<T> cola;
    
    public ColaBanco() {
        this.cola = new LinkedList<>();
    }
    
    public void encolar(T elemento) {
        cola.add(elemento);
    }
    
    public T desencolar() {
        if (cola.isEmpty()) {
            return null;
        }
        return cola.remove();
    }
    
    public T verProximo() {
        if (cola.isEmpty()) {
            return null;
        }
        return cola.peek();
    }
    
    public String mostrarTodos() {
        if (cola.isEmpty()) {
            return "No hay clientes en espera.";
        }
        StringBuilder sb = new StringBuilder("=== CLIENTES EN ESPERA ===\n");
        int pos = 1;
        for (T cliente : cola) {
            sb.append(pos++).append(". ").append(cliente.toString()).append("\n");
        }
        return sb.toString();
    }
    
    public int tamaño() {
        return cola.size();
    }
    
    public boolean estaVacia() {
        return cola.isEmpty();
    }
    
    public void vaciar() {
        cola.clear();
    }
}