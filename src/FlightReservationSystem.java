public interface FlightReservationSystem {
    void zarezerwujLot(Flight lot, String danePosiadacza, double cenaBiletu);
    void anulujRezerwacje(Flight lot, String danePosiadacza);
    Flight wyszukajLot(String miejsceWylotu, String miejsceDocelowe, String dataWylotu);
    void wyswietlDostepneLoty();
}
