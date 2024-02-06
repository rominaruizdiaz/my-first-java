package dev.rominaruiz.myfirstapp;

// PascalCase
public class PrimitiveData {
    // Attributes
    private String name;
        // no se puede cambiar aunque sea publico (final)
    public final int fingers = 2;

    // Constructores . nombre igual - se puede tener varios con una sobrecarga, pero uno tiene que ser distinto
    public PrimitiveData() {
        // decimos que el atributo tenga este nombre.
        this.name = "Mini";
    }

    public PrimitiveData(String name) {
        // segun el nombre que recibo, el atributo tendra ese valor.
        this.name = name;
    }

    
    
    // Métodos = acción (getters and setters - recuperan los atributos)
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Métodos = acción camelCase
    public void printNameReversed() {
        System.out.println("metodo reverse");
    }

    public String removeVocals() {
        return name;
    }
}
