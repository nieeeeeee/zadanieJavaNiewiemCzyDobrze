public class Reservation {
    Flight lot;
    String danePosiadacza;
    private double cenaBiletu;

    public Reservation(Flight lot, String danePosiadacza, double cenaBiletu) {
        this.lot = lot;
        this.danePosiadacza = danePosiadacza;
        this.cenaBiletu = cenaBiletu;
        lot.setLiczbaDostepnychMiejsc(lot.getLiczbaDostepnychMiejsc() - 1);
    }
}
