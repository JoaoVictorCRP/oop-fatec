package br.edu.fatecfranca.lista3.ex3;

import br.edu.fatecfranca.lista3.ex3.classes.Flight;
import br.edu.fatecfranca.lista3.ex3.classes.Passenger;
import br.edu.fatecfranca.lista3.ex3.classes.Reservation;

import java.time.LocalDate;


public class Main {
    public static void main(String[] args) {
        Passenger p1 = new Passenger(1, "João Victor", "123.456.789-00");
        Passenger p2 = new Passenger(2, "Reinaldo", "987.654.321-00");
        Reservation r1 = new Reservation(100, LocalDate.now(), p1);
        Reservation r2 = new Reservation(200, LocalDate.now(), p2);

        Flight flight = new Flight(1000, "Sao Paulo", "Miami");
        flight.addReservation(r1);
        flight.addReservation(r2);

        System.out.println(flight);
    }
}
