import java.util.ArrayList;
import java.util.List;
public class FlightBookingSystem implements FlightReservationSystem {
    List<Flight> dostepneLoty = new ArrayList<>();
    private List<Reservation> rezerwacje = new ArrayList<>();

    @Override
    public void zarezerwujLot(Flight lot, String danePosiadacza, double cenaBiletu) {
        Reservation nowaRezerwacja = new Reservation(lot, danePosiadacza, cenaBiletu);
        rezerwacje.add(nowaRezerwacja);
    }

    @Override
    public void anulujRezerwacje(Flight lot, String danePosiadacza) {
        rezerwacje.removeIf(r -> r.lot.equals(lot) && r.danePosiadacza.equals(danePosiadacza));
    }

    @Override
    public Flight wyszukajLot(String miejsceWylotu, String miejsceDocelowe, String dataWylotu) {
        return dostepneLoty.stream()
                .filter(lot -> lot.getMiejsceWylotu().equals(miejsceWylotu) && lot.getMiejsceDocelowe().equals(miejsceDocelowe) && lot.getDataWylotu().equals(dataWylotu))
                .findFirst()
                .orElse(null);
    }

    @Override
    public void wyswietlDostepneLoty() {
        dostepneLoty.forEach(lot -> System.out.println("Lot z " + lot.getMiejsceWylotu() + " do " + lot.getMiejsceDocelowe() + " dnia " + lot.getDataWylotu()));
    }
}