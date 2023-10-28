
import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.Supplier;
public class Main {
	// creating a method with arraylist data type
    public static ArrayList<Passenger> StoredUserData() {
        // Create and return a sample ArrayList of Passenger objects
        ArrayList<Passenger> userList = new ArrayList<>();
        userList.add(new Passenger("jayasyam", "pallellamudi", "7382465488", "Male", "jayasyam12356@gmail.com", "@#Jayasyam12356#@", "10000"));
        userList.add(new Passenger("suryavamsi", "eluri", "9493515341", "male", "suryavamsi550@gmail.com", "@Surya143", "50000"));
        return userList;
    }
    // creating a method with arraylist data type
	public static ArrayList<Price> StoredJourneyData(){
	// Create and return a sample ArrayList of Price objects
	ArrayList<Price> JourneyList = new ArrayList<Price>();
	JourneyList.add(new Price("rajahmundry", "Hyderabad", 650, 20));
  	JourneyList.add(new Price("Hyderabad", "rajahmundry", 740, 51));
  	 return JourneyList;
  	 }
	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {
		System.out.println("WELL COME TO ABC TRAVELS");
    	try (// scanner class for taking input from the user
		Scanner scan = new Scanner(System.in)) {
			//Call the StoredUserData() method to get the list of passengers
    	// storing passengers data into userdata arraylist
		ArrayList<Passenger> userData = StoredUserData();
		int faildcount = 0;
		// itarating userdata data to passenger object  
		for (Passenger obj : userData) {
				// it will count the faild logins, 5 failed logins account will be blocked 
				while(faildcount<5) {
				System.out.println("enter your E-mail and password : ");
				// veryfing the user entered email & password to system data 
			    if (obj.email.equals(scan.nextLine()) && obj.password.equals(scan.nextLine())){
			        System.out.println("E-mail & password is  valid");
			        	journey k = new journey();
			        	// storing arraylist method in arraylist variable
			        	ArrayList<Price> userJourneyData = StoredJourneyData();
			        	//  storing a another class method in a variable 
			        	Supplier<String> sourcestation = k::source;
			        	Supplier<String> destinationstation = k::destination;
			        	Supplier<Integer> passenger = k::passengers;
			        	String sourcestation1 =sourcestation.get();
			        	String destination1 = destinationstation.get();
			        	int passengers = passenger.get();
			        	// itarating userjourney data into the price  reference variable
			        	for (Price objj : userJourneyData) {
			        		// veryfing if source station and destionation stations are not equal or not
			        		if (!sourcestation1.equalsIgnoreCase(destination1)){
			        			// veryfing vacancies available in that route are not
			        			if (passengers<=objj.vacancies) {
			        				// verifying user enter souce and destination stations are in the system data or not
			        				if (objj.source.equalsIgnoreCase(sourcestation1) && objj.destination.equalsIgnoreCase(destination1)) {
			        					// preaparing chargers based on number of passengers
			        					int price = passengers * objj.price;
			        					// checking the user given date is weekeds are not if weekends add extra charges
			        					if(k.day.toString().equalsIgnoreCase(k.sat) || k.day.toString().equalsIgnoreCase(k.sun)) {
			        						System.out.println("payable amount : "+ (price + 200 + price*0.18) );
			        						System.out.println("your booking is confirmed");
			        						System.out.println("Do you want to change the travel date type : YES OR NO");
			        						if(scan.nextLine().equalsIgnoreCase("yes")) {
			        							k.date();
			        						}
			        						System.out.println("new date is scheduled");
					                			break;
			        					}
			        					else {
			        						System.out.println("payable amount : " + price);
			        						System.out.println("your booking is confirmed");
			        						System.out.println("Do you want to change the travel date type : YES OR NO");
			        						if(scan.nextLine().equalsIgnoreCase("yes")) {
			        							k.date();
			        						}
			        						System.out.println("new date is scheduled");
			        						break;
			        					}
			        				}
									}
			        			else {
			        				System.out.println("less vacanies available");
			        				break;
			        			}
								}
			        		else {
			        			System.out.println("invalid source and destination");
			        			break;
			        		}
			        	}
			    		break;}
				else {
			    	faildcount++;
			    	System.out.println("E-mail& password not valid");}
				}
			    if(faildcount>=5) {
			        System.out.println("your account is blocked");}
			    break;}
}}}