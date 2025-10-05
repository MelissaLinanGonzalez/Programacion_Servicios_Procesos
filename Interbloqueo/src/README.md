# Interbloqueo (Deadlock)

---
En la clase Transferencia provocamos el interbloqueo. <br>
Incializamos la Transferencia con la cuenta de origen, la cuenta de destino, la cantidad que deseamos transferir y el nombre de la transferencia para tener identificado qué proceso es el que se está ejecutando. <br>
En la clase Cuenta tenemos el saldo y nombre, este último también para identificar qué cuenta es. Los métodos Retirar(double saldo) e Ingresar(double saldo) nos sirven para modificar el atributo de saldo, tanto para sumarle, en el caso de Ingresar, como de restarle, en el caso de Retirar. <br>
En el Main, inicializamos las cuentas que deseamos modificar. Lanzamos los hilos para realizar la transferencia, en t1 y t2 se produce el interbloqueo. <br> <br>
SOLUCIÓN: <br>
Tenemos la clase TransferenciaSinDeadlock, que es en la que se evita el deadlock, en la que establecemos un orden de bloqueo de cuenta:


        Cuenta primera = origen;
        Cuenta segunda = destino;
        if (System.identityHashCode(origen) > System.identityHashCode(destino)){
            primera = destino;
            segunda = origen;
        }

Aquí asumimos que la cuenta que bloquearemos primero será la de origen y luego la de destino. Comprobamos cuál es la que tiene un hachCode mayor, que será la que definiremos como la segunda. Después de haber definido esto, la Cuenta primera será la que menor hashCode tiene, por lo que será la que bloqueemos en primera instancia y después lo haremos con la de mayor hashCode. <br>
            
            synchronized (primera){
            System.out.println(nombre + " ha bloqueado: " + primera.getNombre());

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Error: " + e.getMessage());
            }

            synchronized (segunda){
                System.out.println(nombre + " ha bloqueado: " + segunda.getNombre());

                if (cantidad <= origen.getSaldo()){
                    origen.Retirar(cantidad);
                    destino.Ingresar(cantidad);
                    System.out.println("Se ha realizado la transferencia con éxito");
                    System.out.println("Cuenta: " + destino.getNombre() + "; Saldo: " + destino.getSaldo());
                } else {
                    System.out.println("ERROR, no se puede retirad " + cantidad + ", supera el saldo de " + origen.getNombre());
                }
            }

Con el synchronized bloqueamos las cuentas respectivas, lo que nos garantiza el orden que olden de bloqueo será el mismo, eliminando la posiblidad de que un hilo bloquee una cuenta mientras la otra la espera.