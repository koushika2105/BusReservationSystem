package BRSpackage;

import java.util.ArrayList;
import java.util.Scanner;

public class info {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayList<bus> busses = new ArrayList<>();
        ArrayList<booking> bookings = new ArrayList<>();

        busses.add(new bus(1, true, 3));
        busses.add(new bus(2, false, 2));
        busses.add(new bus(3, true, 4));

        for (bus bd : busses) {
            bd.displayInfo();
        }

        int userOpt = 1;

        while (userOpt == 1) {

            System.out.println("Enter 1 to book and 2 to Exit:");
            userOpt = scanner.nextInt();

            if (userOpt == 1) {

                booking b1 = new booking();

                if (b1.isAvailable(bookings, busses)) {
                    bookings.add(b1);
                    System.out.println("Booking is confirmed, happy journey");
                } else {
                    System.out.println("Sorry bus is full, try another bus or date");
                }
            }
        }

        scanner.close();
    }
}