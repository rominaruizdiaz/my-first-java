package dev.rominaruiz.myfirstapp;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {

        Person nicolas = new Person("Nicolas", "Albarenque", 123, 2001, "Argentina", 'H');
        Person romina = new Person("Romina", "Ruiz", 453, 2004, "Paraguay", 'M');

        System.out.println("Datos de Nicolas:");
        nicolas.printAtributes();

        System.out.println(); // Separador

        System.out.println("Datos de Romina:");
        romina.printAtributes();
    }
}
