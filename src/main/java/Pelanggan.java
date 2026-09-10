public class Pelanggan {
    private String idPelanggan;
    private String nama;
    private String noTelepon;

    // Constructor
    public Pelanggan(String idPelanggan, String nama, String noTelepon) {
        this.idPelanggan = idPelanggan;
        this.nama = nama;
        this.noTelepon = noTelepon;
    }

    // Getter
    public String getIdPelanggan() {
        return idPelanggan;
    }

    public String getNama() {
        return nama;
    }

    public String getNoTelepon() {
        return noTelepon;
    }

    // Setter
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setNoTelepon(String noTelepon) {
        this.noTelepon = noTelepon;
    }

    public void tampilkanData() {
        System.out.println(
            "ID Pelanggan : " + idPelanggan +
            "\nNama         : " + nama +
            "\nNo. Telepon  : " + noTelepon
        );
    }
}
