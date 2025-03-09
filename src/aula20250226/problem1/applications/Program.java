package aula20250226.problem1.applications;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import aula20250226.problem1.entities.Reservation;

public class Program {
    private static SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy"); // por que isso foi declarado aqui?
    public static void main(String[] args) throws ParseException { // o que significa esse throws ParseException?
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Room number");
            int roomNumber = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Check-in date (dd/MM/yyyy): ");
            Date checkin = format.parse(scanner.nextLine()); // o que esse format.parse() faz?
            System.out.println("Check-out date (dd/MM/yyyy): ");
            Date checkout = format.parse(scanner.nextLine());
    
            Reservation reservation = new Reservation(roomNumber, checkin, checkout);
            System.out.println(reservation);
    
            System.out.println();
            System.out.println("Check-in date (dd/MM/yyyy): ");
            checkin = format.parse(scanner.nextLine());
            System.out.println("Check-out date (dd/MM/yyyy): ");
            checkout = format.parse(scanner.nextLine());

            reservation.updateDates(checkin, checkout);
            System.out.println(reservation);
        } catch (ParseException e) {
            System.out.println("Invalid date format.");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
