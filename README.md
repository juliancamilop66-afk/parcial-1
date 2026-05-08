# parcial-1
- Descripción del Proyecto -
El Sistema de Cola Bancaria es una aplicación desarrollada en Java que simula el funcionamiento de una app o ventanilla para la atención al cliente en un banco, el sistema ejecuta bajo el principio FIFO (First In, First Out), validando que los que los clientes sean atendidos en su respectivo orden de llegada, tal cual como en la vida real.

Contexto de uso
En una sucursal bancaria, los clientes llegan, toman un turno y esperan a ser atendidos. El cajero atiende uno por uno siguiendo el orden de llegada. Este sistema digitaliza ese proceso, permitiendo:

Registrar clientes con sus datos completos

Mantener el orden correcto de atención

Consultar el estado de la cola en tiempo real

Persistir los datos para no perder información

Funcionalidades principales
#	Función	Descripción
1	Agregar cliente	Registra un nuevo cliente al final de la cola
2	Atender cliente	Elimina y muestra al primer cliente de la cola
3	Ver próximo	Muestra el siguiente cliente sin eliminarlo
4	Mostrar cola	Lista todos los clientes en espera
5	Consultar cantidad	Indica cuántos clientes están en fila
6	Vaciar cola	Elimina todos los clientes (emergencia)
7	Salir	Cierra la aplicación
Atributos del cliente
Cada cliente registrado contiene:

Nombre (obligatorio, no vacío)

Identificación (cédula de 7-10 dígitos)

Tipo de transacción (Depósito, Retiro, Consulta, Pago)

Hora de llegada (registro temporal automático o manual)

Beneficios del sistema
✅ Orden garantizado - Atención estrictamente FIFO

✅ Interfaz amigable - Menú numérico fácil de usar

✅ Robustez - Manejo de errores y validaciones

✅ Persistencia - Guardado automático de la cola

✅ Portabilidad - Funciona en cualquier sistema con Java

Tecnologías utilizadas
Tecnología	Propósito
Java 11+	Lenguaje de programación principal
Queue (LinkedList)	Implementación de la estructura FIFO

-DIAGRAMA-
┌─────────────────────────────────────────────────────────────────────────────┐
│                                  MAIN                                       │
├─────────────────────────────────────────────────────────────────────────────┤
│ - cola: ColaBanco<Cliente>                                                  │
├─────────────────────────────────────────────────────────────────────────────┤
│ + main(args: String[]): void                                                │
│ + agregarCliente(): void                                                    │
│ + atenderCliente(): void                                                    │
│ + verProximo(): void                                                        │
└─────────────────────────────────┬───────────────────────────────────────────┘
                                  │
                                  │ usa
                                  ↓
┌─────────────────────────────────────────────────────────────────────────────┐
│                            ColaBanco<T>                                     │
├─────────────────────────────────────────────────────────────────────────────┤
│ - cola: Queue<T>                                                            │
├─────────────────────────────────────────────────────────────────────────────┤
│ + ColaBanco()                                                               │
│ + encolar(elemento: T): void                                                │
│ + desencolar(): T                                                           │
│ + verProximo(): T                                                           │
│ + mostrarTodos(): String                                                    │
│ + tamaño(): int                                                             │
│ + estaVacia(): boolean                                                      │
│ + vaciar(): void                                                            │
└─────────────────────────────────┬───────────────────────────────────────────┘
                                  │
                                  │ contiene (T)
                                  ↓
┌─────────────────────────────────────────────────────────────────────────────┐
│                              Cliente                                        │
├─────────────────────────────────────────────────────────────────────────────┤
│ - nombre: String                                                            │
│ - identificacion: String                                                    │
│ - tipoTransaccion: String                                                   │
│ - horaLlegada: LocalTime                                                    │
├─────────────────────────────────────────────────────────────────────────────┤
│ + Cliente(nombre: String, identificacion: String,                           │
│           tipoTransaccion: String, horaLlegada: LocalTime)                  │
│ + getNombre(): String                                                       │
│ + getIdentificacion(): String                                               │
│ + getTipoTransaccion(): String                                              │
│ + getHoraLlegada(): LocalTime                                               │
│ + toString(): String                                                        │
└─────────────────────────────────────────────────────────────────────────────┘


<img width="529" height="660" alt="image" src="https://github.com/user-attachments/assets/673990e5-1030-491e-9faf-bf9c3b0b028e" />
<img width="408" height="792" alt="image" src="https://github.com/user-attachments/assets/1146bd8d-3408-43bc-afd9-625c645d7b60" />
<img width="347" height="197" alt="image" src="https://github.com/user-attachments/assets/689783d6-ef7b-47be-84b3-914bc0a79be7" />

