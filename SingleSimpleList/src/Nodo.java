public class Nodo {

    private Integer dato; // El dato
    private Nodo siguiente; // La referencia al siguiente que es un nodo

    public Nodo(Integer dato){
        this.dato = dato;
    }

    public Integer getDato() {
        return dato;
    }

    public void setDato(Integer dato) {
        this.dato = dato;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    
}

