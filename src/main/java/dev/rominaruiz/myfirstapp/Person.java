package dev.rominaruiz.myfirstapp;

public class Person {
    private String name;
    private String firstname;
    private int dni;
    private int year;

    public Person(String name, String firstname, int dni, int year) {
        this.name = name;
        this.firstname = firstname;
        this.dni = dni;
        this.year = year;
    }

    

    public String getFirstname() {
        return firstname;
    }
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }


    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }


    public int getDni() {
        return dni;
    }
    public void setDni(int dni) {
        this.dni = dni;
    }


    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }


    public void printAtributes() {
        System.out.println("Nombre: " + getName());
        System.out.println("Apellido: " + getFirstname());
        System.out.println("DNI: " + getDni());
        System.out.println("Año de nacimiento: " + getYear());
    }

}
