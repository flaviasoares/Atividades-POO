package aula20250226.problem1.entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Reservation {
    private int roomNumber;
    private Date checkin;
    private Date checkout;

    private static SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");

    public Reservation(int roomNumber, Date checkin, Date checkout) {
        if (!checkout.after(checkin)) {
            throw new IllegalArgumentException("Error in reservation: Check-out date must be after check-in date.");
        }
        this.roomNumber = roomNumber;
        this.checkin = checkin;
        this.checkout = checkout;
    }

    public void updateDates(Date checkin, Date checkout) {
        Date now = new Date();
        if (checkin.before(now) || checkout.before(now)) {
            throw new IllegalArgumentException("Error in reservation: Reservation dates for update must be future dates.");
        }
        if (!checkout.after(checkin)) {
            throw new IllegalArgumentException("Error in reservation: Check-out date must be after check-in date.");
        }
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
