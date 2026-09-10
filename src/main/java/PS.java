public class PS {
    private String id;
    private String jenis;
    private int harga;

    public PS(String id, String jenis, int harga) {
        this.id = id;
        this.jenis = jenis;
        this.harga = harga;
    }

    public String getId() {
        return id;
    }

    public String getJenis() {
        return jenis;
    }

    public int getHarga() {
        return harga;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }
}
