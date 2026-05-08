import java.time.LocalTime;
import java.util.Scanner;

public class Main {
    private static ColaBanco<Cliente> cola = new ColaBanco<>();
    private static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        int opcion;
        do {
            System.out.println("\n=== SISTEMA DE COLA DEL BANCO (FIFO) ===");
            System.out.println("1. Agregar cliente");
            System.out.println("2. Atender siguiente cliente");
            System.out.println("3. Ver próximo cliente");
            System.out.println("4. Mostrar todos los clientes");
            System.out.println("5. Consultar cantidad");
            System.out.println("6. Vaciar la cola");
            System.out.println("7. Salir");
            System.out.print("Opción: ");
            
            try {
                opcion = Integer.parseInt(sc.nextLine());
                
                switch (opcion) {
                    case 1:
                        agregarCliente();
                        break;
                    case 2:
                        atenderCliente();
                        break;
                    case 3:
                        verProximo();
                        break;
                    case 4:
                        System.out.println(cola.mostrarTodos());
                        break;
                    case 5:
                        System.out.println("Clientes en espera: " + cola.tamaño());
                        break;
                    case 6:
                        System.out.print("¿Seguro? (s/n): ");
                        if (sc.nextLine().equalsIgnoreCase("s")) {
                            cola.vaciar();
                            System.out.println("Cola vaciada");
                        }
                        break;
                    case 7:
                        System.out.println("Adiós");
                        break;
                    default:
                        System.out.println("Opción inválida");
                }
            } catch (NumberFormatException e) {
                System.out.println("Ingrese un número válido");
                opcion = 0;
            }
        } while (opcion != 7);
        
        sc.close();
    }
    
    private static void agregarCliente() {
        System.out.print("Nombre: ");
        String nombre = sc.nextLine();
        
        System.out.print("Cédula: ");
        String cedula = sc.nextLine();
        
        System.out.print("Transacción (Depósito/Retiro/Consulta/Pago): ");
        String transaccion = sc.nextLine();
        
        System.out.print("Hora (HH:MM) - Enter para ahora: ");
        String horaStr = sc.nextLine();
        
        LocalTime hora;
        if (horaStr.isEmpty()) {
            hora = LocalTime.now();
        } else {
            String[] partes = horaStr.split(":");
            hora = LocalTime.of(Integer.parseInt(partes[0]), Integer.parseInt(partes[1]));
        }
        
        Cliente cliente = new Cliente(nombre, cedula, transaccion, hora);
        cola.encolar(cliente);
        System.out.println("✓ Cliente agregado (FIFO)");
    }
    
    private static void atenderCliente() {
        Cliente cliente = cola.desencolar();
        if (cliente == null) {
            System.out.println("✗ No hay clientes en espera");
        } else {
            System.out.println("Atendiendo a: " + cliente);
        }
    }
    
    private static void verProximo() {
        Cliente cliente = cola.verProximo();
        if (cliente == null) {
            System.out.println("✗ No hay clientes en espera");
        } else {
            System.out.println("Próximo cliente: " + cliente);
        }
    }
}