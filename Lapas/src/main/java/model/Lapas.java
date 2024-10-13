package model;

public final class Lapas implements Manageable {
    private final String idLapas;  // Final property
    private String namaLapas;
    private int kapasitas;

    public Lapas(String idLapas, String namaLapas, int kapasitas) {
        this.idLapas = idLapas;
        this.namaLapas = namaLapas;
        this.kapasitas = kapasitas;
    }

    // Display information about the Lapas
    public void displayInfo() {
        System.out.println("ID Lapas: " + idLapas);
        System.out.println("Nama Lapas: " + namaLapas);
        System.out.println("Kapasitas: " + kapasitas);
    }

    // Getters and Setters
    public String getIdLapas() {
        return idLapas;
    }

    public String getNamaLapas() {
        return namaLapas;
    }

    public void setNamaLapas(String namaLapas) {
        this.namaLapas = namaLapas;
    }

    public int getKapasitas() {
        return kapasitas;
    }

    public void setKapasitas(int kapasitas) {
        this.kapasitas = kapasitas;
    }

    // Implementing CRUD methods from Manageable interface
    @Override
    public void create() {
        System.out.println("Menambah data lapas");
    }

    @Override
    public void read() {
        displayInfo();
    }

    @Override
    public void update() {
        System.out.println("Mengupdate data lapas");
    }

    @Override
    public void delete() {
        System.out.println("Menghapus data lapas");
    }
}
