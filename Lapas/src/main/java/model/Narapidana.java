package model;

public class Narapidana extends Person implements Manageable {
    private final String id;  // Final property
    private int masaTahanan;

    public Narapidana(String id, String nama, int masaTahanan) {
        super(nama);  // Call superclass constructor
        this.id = id;
        this.masaTahanan = masaTahanan;
    }

    // Implement displayInfo method from Person class
    @Override
    public void displayInfo() {
        System.out.println("ID Narapidana: " + id);
        System.out.println("Nama Narapidana: " + getNama());
        System.out.println("Masa Tahanan: " + masaTahanan + " tahun");
    }

    // Getters and Setters
    public String getId() {
        return id;
    }

    public int getMasaTahanan() {
        return masaTahanan;
    }

    public void setMasaTahanan(int masaTahanan) {
        this.masaTahanan = masaTahanan;
    }

    // Implementing CRUD methods from Manageable interface
    @Override
    public void create() {
        System.out.println("Menambah data narapidana");
    }

    @Override
    public void read() {
        displayInfo();
    }

    @Override
    public void update() {
        System.out.println("Mengupdate data narapidana");
    }

    @Override
    public void delete() {
        System.out.println("Menghapus data narapidana");
    }
}
