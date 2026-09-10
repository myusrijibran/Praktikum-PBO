import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static Scanner input = new Scanner(System.in);
    static ArrayList<PS> daftarPS = new ArrayList<>();
    static ArrayList<Rental> daftarRental = new ArrayList<>();

    public static void main(String[] args) {

        int pilihan;

        do {
            System.out.println("\n=== SISTEM MANAJEMEN RENTAL PS ===");
            System.out.println("1. Tambah PS");
            System.out.println("2. Tampilkan PS");
            System.out.println("3. Ubah PS");
            System.out.println("4. Hapus PS");
            System.out.println("5. Rental PS");
            System.out.println("6. Keluar");

            System.out.print("Pilih menu: ");
            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {

                case 1:
                    tambahPS();
                    break;

                case 2:
                    tampilkanPS();
                    break;

                case 3:
                    ubahPS();
                    break;

                case 4:
                    hapusPS();
                    break;

                case 5:
                    rentalPS();
                    break;

                case 6:
                    System.out.println("Program selesai.");
                    break;

                default:
                    System.out.println("Menu tidak tersedia.");
            }

        } while (pilihan != 6);
    }

    // Tambah PS
    static void tambahPS() {

        System.out.println("\n--- Tambah PS ---");

        System.out.print("ID PS     : ");
        String id = input.nextLine();

        System.out.print("Jenis PS  : ");
        String jenis = input.nextLine();

        System.out.print("Harga/Jam : ");
        int harga = input.nextInt();
        input.nextLine();

        daftarPS.add(new PS(id, jenis, harga));

        System.out.println("PS berhasil ditambahkan.");
    }

    // Tampilkan PS
    static void tampilkanPS() {

        System.out.println("\n--- Daftar PS ---");

        if (daftarPS.isEmpty()) {
            System.out.println("Belum ada data PS.");
        } else {

            for (PS ps : daftarPS) {

                System.out.println("-------------------");
                System.out.println("ID      : " + ps.getId());
                System.out.println("Jenis   : " + ps.getJenis());
                System.out.println("Harga   : Rp" + ps.getHarga());
            }
        }
    }

    // Ubah PS
    static void ubahPS() {

        System.out.print("\nMasukkan ID PS: ");
        String id = input.nextLine();

        for (PS ps : daftarPS) {

            if (ps.getId().equals(id)) {

                System.out.print("Jenis PS baru : ");
                String jenis = input.nextLine();

                System.out.print("Harga baru    : ");
                int harga = input.nextInt();
                input.nextLine();

                ps.setJenis(jenis);
                ps.setHarga(harga);

                System.out.println("Data berhasil diubah.");
                return;
            }
        }

        System.out.println("ID PS tidak ditemukan.");
    }

    // Hapus PS
    static void hapusPS() {

        System.out.print("\nMasukkan ID PS: ");
        String id = input.nextLine();

        for (PS ps : daftarPS) {

            if (ps.getId().equals(id)) {

                daftarPS.remove(ps);

                System.out.println("Data berhasil dihapus.");
                return;
            }
        }

        System.out.println("ID PS tidak ditemukan.");
    }

    // Rental PS
    static void rentalPS() {

    System.out.println("\n--- RENTAL PS ---");

    System.out.print("Nama penyewa : ");
    String nama = input.nextLine();

    System.out.print("ID PS        : ");
    String idPS = input.nextLine();

    PS psDipilih = null;

    for (PS ps : daftarPS) {
        if (ps.getId().equals(idPS)) {
            psDipilih = ps;
            break;
        }
    }

    if (psDipilih == null) {
        System.out.println("PS tidak ditemukan.");
        return;
    }

    // Masukkan lama rental
    System.out.print("Lama rental (jam): ");
    int lama = input.nextInt();
    input.nextLine();

    // Menghitung total harga
    int total = psDipilih.getHarga() * lama;

    // Menyimpan transaksi rental
    Rental rental = new Rental(nama, idPS, lama);
    daftarRental.add(rental);

    System.out.println("\n=== DETAIL RENTAL ===");
    System.out.println("Nama Penyewa : " + nama);
    System.out.println("ID PS        : " + psDipilih.getId());
    System.out.println("Jenis PS     : " + psDipilih.getJenis());
    System.out.println("Lama Rental  : " + lama + " jam");
    System.out.println("Total Harga  : Rp" + total);

    System.out.println("\nRental berhasil!");
}

    }
