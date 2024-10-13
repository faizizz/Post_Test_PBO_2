package main;

import model.Lapas;
import model.Narapidana;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static ArrayList<Narapidana> narapidanaList = new ArrayList<>();
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Lapas lapas = new Lapas("L001", "Lapas Skibidi Sigma", 500);
        
        // Menambah data Narapidana ke dalam narapidanaList
        narapidanaList.add(new Narapidana("N001", "Budi Santoso", 10));
        narapidanaList.add(new Narapidana("N002", "Andi Wijaya", 5));
        narapidanaList.add(new Narapidana("N003", "Siti Aminah", 8));
        narapidanaList.add(new Narapidana("N004", "Ahmad Syafii", 15));
        narapidanaList.add(new Narapidana("N005", "Dewi Lestari", 3));
        narapidanaList.add(new Narapidana("N006", "Hasan Basri", 7));
        narapidanaList.add(new Narapidana("N007", "Rina Permata", 12));

        int pilihan;
        do {
            System.out.println("\n--- Sistem Manajemen Lapas ---");
            System.out.println("1. Tambah Narapidana");
            System.out.println("2. Lihat Semua Narapidana");
            System.out.println("3. Update Narapidana");
            System.out.println("4. Hapus Narapidana");
            System.out.println("5. Lihat Info Lapas");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (pilihan) {
                case 1:
                    tambahNarapidana(narapidanaList);
                    break;
                case 2:
                    lihatSemuaNarapidana();
                    break;
                case 3:
                    updateNarapidana(scanner);
                    break;
                case 4:
                    hapusNarapidana(scanner);
                    break;
                case 5:
                    lapas.read(); // Menggunakan metode dari interface Manageable
                    break;
                case 0:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 0);
    }

    // Menambah narapidana baru
    public static void tambahNarapidana(ArrayList<Narapidana> narapidanaList) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("===== Tambah Narapidana =====");
        System.out.print("Masukkan ID Narapidana: ");
        String id = scanner.nextLine();

        boolean isExisting = false;
        for (Narapidana n : narapidanaList) {
            if (n.getId().equals(id)) {
                isExisting = true;
                break;
            }
        }

        if (isExisting) {
            System.out.println("Data dengan ID tersebut sudah ada di sistem!");
        } else {
            System.out.print("Masukkan Nama Narapidana: ");
            String nama = scanner.nextLine();
            System.out.print("Masukkan Masa Tahanan (tahun): ");
            int masaTahanan = scanner.nextInt();

            Narapidana narapidanaBaru = new Narapidana(id, nama, masaTahanan);
            narapidanaList.add(narapidanaBaru);
            System.out.println("Data narapidana berhasil ditambahkan!");
        }
    }

    // Menampilkan semua narapidana
    private static void lihatSemuaNarapidana() {
        if (narapidanaList.isEmpty()) {
            System.out.println("Belum ada narapidana.");
        } else {
            for (Narapidana n : narapidanaList) {
                n.read(); // Menggunakan metode dari interface Manageable
                System.out.println("-------------------");
            }
        }
    }

    // Update data narapidana
    private static void updateNarapidana(Scanner scanner) {
        System.out.print("Masukkan ID Narapidana yang akan di-update: ");
        String id = scanner.nextLine();
        for (Narapidana n : narapidanaList) {
            if (n.getId().equals(id)) {
                System.out.print("Masukkan Nama Baru: ");
                String nama = scanner.nextLine();
                System.out.print("Masukkan Masa Tahanan Baru: ");
                int masaTahanan = scanner.nextInt();
                scanner.nextLine(); // Consume newline
                n.setNama(nama);
                n.setMasaTahanan(masaTahanan);
                n.update(); // Menggunakan metode dari interface Manageable
                return;
            }
        }
        System.out.println("Narapidana dengan ID tersebut tidak ditemukan.");
    }

    // Hapus data narapidana
    private static void hapusNarapidana(Scanner scanner) {
        System.out.print("Masukkan ID Narapidana yang akan dihapus: ");
        String id = scanner.nextLine();
        for (Narapidana n : narapidanaList) {
            if (n.getId().equals(id)) {
                n.delete(); // Menggunakan metode dari interface Manageable
                narapidanaList.remove(n);
                return;
            }
        }
        System.out.println("Narapidana dengan ID tersebut tidak ditemukan.");
    }
}
