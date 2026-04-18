package BRSpackage;
import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class booking {
	String name;
	int busno;
	Date date;
	
	
	booking(){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your name:");
		this.name = scanner.next();
		System.out.println("Enter busno:");
	    this.busno = scanner.nextInt();
		System.out.println("Enter date :");
		String sd = scanner.next();
		SimpleDateFormat dateInput = new SimpleDateFormat("dd-mm-yyyy");
		try {
			this.date = dateInput.parse(sd);
		}catch(ParseException e) {
			e.printStackTrace();
		}
	}
	public boolean IsAvailable(ArrayList<booking> bookings,ArrayList<bus> busses) {
		int capacity = 0;
		for(bus b2 : busses) {
			if(b2.getbusno() == busno) {
			capacity = b2.getcapacity();
			}
		}
		
		int booking = 0;
		for(booking b: bookings) {
		if(b.busno == busno && b.date.equals(date)) {
		booking++;
	}
		}
	return booking < capacity ? true : false;
}
}