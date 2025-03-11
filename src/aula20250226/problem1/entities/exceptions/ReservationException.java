package aula20250226.problem1.entities.exceptions;

import java.util.Date;

public class ReservationException extends Exception {
    public ReservationException(String message) {
        super(message);
    }
    
    public static void validateDates(Date checkIn, Date checkOut) throws ReservationException {
        if (!checkOut.after(checkIn)) {
            throw new ReservationException("Error in reservation: Check-out date must be after check-in date");
        }
    }
    
    public static void validateFutureDates(Date checkIn, Date checkOut) throws ReservationException {
        Date now = new Date();
        if (checkIn.before(now) || checkOut.before(now)) {
            throw new ReservationException("Error in reservation: Reservation dates for update must be future dates");
        }
    }
}
