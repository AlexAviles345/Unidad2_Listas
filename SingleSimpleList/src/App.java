public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        SinglyLinkedList lista = new SinglyLinkedList();

        lista.insertar(10);
        lista.insertar(20);
        lista.insertar(30);
        lista.mostrar();

        // Buscar el numero 20
        lista.buscar(20);

        // Buscar el numero 25
        lista.buscar(25);

        // Eliminar el numero 10
        lista.eliminar(10);
        lista.mostrar();
    }
}
