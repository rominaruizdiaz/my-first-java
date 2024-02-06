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
        PrimitiveData data = new PrimitiveData("Donald");

        data.setName("Mary Poppins");

        data.printNameReversed();
        
        System.out.println(data.getName());
    }
}
