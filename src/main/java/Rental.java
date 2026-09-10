public class Rental {
    private String idRental;
    private String idPS;
    private int lamaRental;

    public Rental(String idRental, String idPS, int lamaRental) {
        this.idRental = idRental;
        this.idPS = idPS;
        this.lamaRental = lamaRental;
    }

    public String getIdRental() {
        return idRental;
    }

    public String getIdPS() {
        return idPS;
    }

    public int getLamaRental() {
        return lamaRental;
    }
    
}