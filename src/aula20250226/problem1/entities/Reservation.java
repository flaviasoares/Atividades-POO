package aula20250226.problem1.entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import aula20250226.problem1.entities.exceptions.ReservationException;

public class Reservation {
    private int roomNumber;
    private Date checkin;
    private Date checkout;

    private static SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");

    public Reservation(int roomNumber, Date checkin, Date checkout) throws ReservationException {
        ReservationException.validateDates(checkin, checkout);
        this.roomNumber = roomNumber;
        this.checkin = checkin;
        this.checkout = checkout;
    }

    public void updateDates(Date checkin, Date checkout) throws ReservationException {
        ReservationException.validateFutureDates(checkin, checkout);
        ReservationException.validateDates(checkin, checkout);

        this.checkin = checkin;
        this.checkout = checkout;
    }

    private int duration() {
        long diff = checkout.getTime() - checkin.getTime();
        return (int) (diff / (1000 * 60 * 60 * 24));
    }

    @Override
    public String toString() {
        return "Reservation: Room " + roomNumber +
                ", check-in: " + format.format(checkin) +
                ", check-out: " + format.format(checkout) +
                ", " + duration() + " nights";
    }
}
