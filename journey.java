import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
public class journey {
	public Scanner scan = new Scanner(System.in);
	public void planjourney() {
			while(source().equalsIgnoreCase(destination())) { 
			System.out.println("invalid destination  : ");
			destination();}
			while(passengers()<1) {
				passengers();} 
	}
	String sat = "SATURDAY";
	String sun = "SUNDAY";
	public String userDate() {
		String userdate = scan.nextLine();
		return userdate;
	}
	DayOfWeek day = date();
	public DayOfWeek date() {
	    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
	        System.out.println("Enter a date in yyyy-MM-dd format:");
	        try {    
		        String userInput = userDate();
		        LocalDate userDate = LocalDate.parse(userInput, formatter);
	        	// Parse the user input into a LocalDate object
	        	// Get the current date
	        	LocalDate currentDate = LocalDate.now();
	            // Compare the two dates
	            if (userDate.isBefore(currentDate)) {
	                System.out.println("The user-provided date is invalid.");
	            }
	            else {
	            	return userDate.getDayOfWeek();
	            }
	        } catch (java.time.format.DateTimeParseException e) {
	            System.out.println("Invalid date format. Please use yyyy-MM-dd format.");
	        }
			return null;
	        
	    }
	public int passengers() {
		System.out.println("Enter number of passengers to travel : ");
		int passengers = scan.nextInt();
		return passengers;
	}
	public String source() {
		System.out.println("enter your source place (rajahmundry, Hyderabad): ");
		String source = scan.nextLine();
		while(!source.equalsIgnoreCase("rajahmundry") && !source.equalsIgnoreCase("Hyderabad")) {
			source();
		}
		return source;
	}
	public String destination() {
		System.out.println("enter your destination place (rajahmundry, Hyderabad): ");
		String destination = scan.nextLine();
		while(!destination.equalsIgnoreCase("rajahmundry")&& !destination.equalsIgnoreCase("Hyderabad")) {
			destination();
		}
		return destination;}
}
