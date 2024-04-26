import java.util.ArrayList;

public class Veterinaria {
    private ArrayList<Animal> listaAnimales;
    private ArrayList<Cliente> listaClientes;

    public Veterinaria() {
        listaClientes = new ArrayList<>();
        listaAnimales = new ArrayList<>();
    }

    //TODO: Completar los siguientes métodos
    public void agregarCliente(Cliente cliente) {
       listaClientes.add(cliente);
        // Agregar cliente a la lista de clientes

    }

    public void agregarAnimal(Animal animal) {
        // Agregar animal a la lista de animales
        listaAnimales.add(animal);
    }

    public void asignarConsulta(Animal animal, Consulta consulta) {
        // Asignar consulta a un animal
        animal.agregarConsulta(consulta);
    }

    //TODO: Crear un método para imprimir todas las consultas de todas las listas de animales. De las consultas imprimir el motivo, la fecha y el diagnostico. 
    public void imprimirConsultas(){
        for (Animal animal : listaAnimales) {
            for (Consulta consulta : animal.getHistorialConsultas()) {
                System.out.println("Cliente: " + animal.getPropietario().getNombre());
                System.out.println("Animal: " + animal.getNombre());
                System.out.println("Fecha: " + consulta.getFecha());
                System.out.println("Motivo: " + consulta.getMotivo());
                System.out.println("Diagnóstico: " + consulta.getDiagnostico());
                System.out.println("------------------------");
                
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
