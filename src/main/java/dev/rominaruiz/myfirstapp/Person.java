package dev.rominaruiz.myfirstapp;

public class Person {
    private String name;
    private String firstname;
    private int dni;
    private int year;
    private String country;
    private char gender;

    public Person(String name, String firstname, int dni, int year, String country, char gender) {
        this.name = name;
        this.firstname = firstname;
        this.dni = dni;
        this.year = year;
        this.country = country;
        this.gender = gender;
    }


    public char getGender() {
        return gender;
    }
    public void setGender(char gender) {
        this.gender = gender;
    }

    
    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
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
        System.out.println("País: " + getCountry());
        System.out.println("Género: " + getGender());
    }

}
