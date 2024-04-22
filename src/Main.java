public class Main {
    public static void main(String[] args) {

        //TODO: Crear los siguientes pasos para comprobar el funcionamiento del programa 
        // Crear una veterinaria
        Veterinaria vete1 = new Veterinaria();
        // Crear dos clientes
        Cliente c1 = new Cliente("Antonio", "Rua Nova, Santiago", "981635247");
        Cliente c2 = new Cliente("Laura", "Rua Santiago de Chile, Santiago", "636251478");

        // Agregar clientes a la veterinaria

        // Crear dos animales
        Animal loro = new Animal("Perico", "Ave exótica", "Loro Lorito", c1);
        Animal perro = new Animal("Firulais", "Perro", "Sal y pimienta", c2);
        // Agregar animales a la veterinaria
        
        //Crear un veterinario 
        Veterinario veterinario1 = new Veterinario("Rosana", "Aves exóticas");
        // Crear una consulta
        Consulta consulta1 = new Consulta("27-08-2024", "Revisión general", "cambio de plumaje", null, veterinario1)

        // Asignar la consulta a un animal

        //Imprimir todas las consultas de los animales de la clínica

    }

}