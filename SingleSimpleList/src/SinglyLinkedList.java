public class SinglyLinkedList {
    Nodo cabeza; 

    public SinglyLinkedList(){
        this.cabeza = null;
    }

    public void insertar(Integer dato){
        // Crear un nodo
        Nodo nuevoNodo = new Nodo(dato);

        // Verificar si la lista esta vacia
        if(cabeza == null){
            // Coloca el nuevo nodo como la cabeza
            cabeza = nuevoNodo;
        } else {
            Nodo temp = cabeza; // Iniciamos desde la cabeza (El primero ps)
            // Recorremos todos los nodos hasta encontrar un null en las referencias
            while (temp.getSiguiente() != null) {
                temp = temp.getSiguiente();
            }
            temp.setSiguiente(nuevoNodo); // Se pasa al siguiente nodo 
        }
    }

    public void mostrar(){
        Nodo temp = cabeza; // Comienzo desde la cabeza (inicio)
        // Mientras temp no sea nulo
        while(temp != null){
            System.out.print(temp.getDato() + "->");
            temp = temp.getSiguiente();
        }
        System.out.println("null");
    }

    public boolean buscar(Integer dato){
        // Verificar si la lista esta vacia
        if(cabeza == null){
            System.out.println("La lista esta vacia");
            return false;
        } else {
            Nodo temp = cabeza; // Comenzamos desde la cabeza (inicio)
            // Mientras temp no sea nulo
            while (temp != null) {
                if( temp.getDato() == dato ){
                    // Si encuentra el nodo, se rompe el ciclo y el metodo
                    System.out.println("El dato " + dato + " si existe en la lista");
                    return true;
                }
                else{
                    temp = temp.getSiguiente();  // Se pasa al siguiente nodo 
                }
            }
        }

        System.out.println("El dato " + dato + " no existe en la lista");
        return false;
    }

    public void eliminar(Integer valor){
        if(cabeza == null){
            System.out.println("No se puede eliminar porque la lista esta vacia");
        }
        if(cabeza.getDato() == valor){
            cabeza = cabeza.getSiguiente();
            return;
        }
        Nodo temp = cabeza;
        Nodo anterior = null;
        while (temp != null && temp.getDato() != valor) { // Recorrer hasta encontrar el nodo con el valor
            anterior = temp;
            temp= temp.getSiguiente();
        }
        if(temp == null){
            System.out.println("No se encontro el valor");
            return;
        }
        anterior.setSiguiente(temp.getSiguiente());
        System.out.println("Se elimina correctamente " + valor);
    }
}
