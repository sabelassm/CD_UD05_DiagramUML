import java.util.ArrayList;
import java.util.Scanner;

public class Veterinaria {
    private ArrayList<Animal> listaAnimales;
    private ArrayList<Cliente> listaClientes;

    public Veterinaria() {
        listaClientes = new ArrayList<>();
        listaAnimales = new ArrayList<>();
    }

    //TODO: Completar los siguientes métodos
    public void agregarCliente(Cliente cliente) {
        Scanner teclado = new Scanner(System.in);

        /*Cliente nuevoCliente: nombre, direccion, telefono y animal(array)*/
        // Agregar cliente a la lista de clientes

    }

    public void agregarAnimal(Animal animal) {
        // Agregar animal a la lista de animales
    }

    public void asignarConsulta(Animal animal, Consulta consulta) {
        // Asignar consulta a un animal

    }

    //TODO: Crear un método para imprimir todas las consultas de todas las listas de animales. De las consultas imprimir el motivo, la fecha y el diagnostico. 
    public void imprimirConsultas(){
        for (Animal animal : listaAnimales) {
            for (Cliente cliente : listaClientes) {
                System.out.println(cliente.getListaAnimales());
                System.out.println(animal.getHistorialConsultas());
                
            }
        }
    }

    //TODO: Generar getters y setters
    public ArrayList<Animal> getListaAnimales() {
        return listaAnimales;
    }

    public void setListaAnimales(ArrayList<Animal> listaAnimales) {
        this.listaAnimales = listaAnimales;
    }

    public ArrayList<Cliente> getListaClientes() {
        return listaClientes;
    }

    public void setListaClientes(ArrayList<Cliente> listaClientes) {
        this.listaClientes = listaClientes;
    }
    

}
