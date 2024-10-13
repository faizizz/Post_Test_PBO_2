package model;

public abstract class Person {
    private String nama;

    // Constructor
    public Person(String nama) {
        this.nama = nama;
    }

    // Abstract method to be implemented by subclasses
    public abstract void displayInfo();

    // Getter and Setter for nama
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
}
