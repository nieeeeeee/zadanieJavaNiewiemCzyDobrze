public class Main {
    public static void main(String[] args) {
        FlightBookingSystem systemRezerwacji = new FlightBookingSystem();

        Flight lot1 = new Flight();
        lot1.setMiejsceWylotu("Warszawa");
        lot1.setMiejsceDocelowe("Kraków");
        lot1.setDataWylotu("2022-12-01");
        lot1.setCzasTrwaniaLotu(60);
        lot1.setLiczbaDostepnychMiejsc(100);

        Flight lot2 = new Flight();
        lot2.setMiejsceWylotu("Kraków");
        lot2.setMiejsceDocelowe("Gdańsk");
        lot2.setDataWylotu("2022-12-15");
        lot2.setCzasTrwaniaLotu(120);
        lot2.setLiczbaDostepnychMiejsc(50);

        systemRezerwacji.dostepneLoty.add(lot1);
        systemRezerwacji.dostepneLoty.add(lot2);

        systemRezerwacji.zarezerwujLot(lot1, "Jan Kowalski", 150.0);
        systemRezerwacji.zarezerwujLot(lot2, "Anna Nowak", 200.0);

        systemRezerwacji.wyswietlDostepneLoty();

        systemRezerwacji.anulujRezerwacje(lot1, "Jan Kowalski");

        systemRezerwacji.wyswietlDostepneLoty();
    }
}