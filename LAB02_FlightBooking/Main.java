package LAB02_FlightBooking;
import java.util.Scanner;

class FlightBooking{
    public String flightID = "OOP24";
    private static int seatAvaible = 180;

    public FlightBooking(){
        reset();
    }

    public void checkStatus(String status, int userID){
        if(status.equals("Booking")){
            seatAvaible--;
            System.out.print("[Seat Available: " + (seatAvaible) + "]");
        }else if(status.equals("Confirmed")){
            System.out.print("--User " + userID + " Confirmed--[Seat Available: " + seatAvaible + "]");
        }else if(status.equals("Cancel")){
            seatAvaible++;
            System.out.println("[Seat Available: " + (seatAvaible) + "]");
        }
    }

    public void reset(){
        seatAvaible = 180;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Test = sc.nextInt();
        sc.nextLine();

        while (Test != 0) {
            String input = sc.nextLine();
            String[] words = input.split(" ");

            FlightBooking fB = new FlightBooking();
            for(int i = 0; i < words.length; i+= 2){
                fB.checkStatus(words[i + 1], Integer.parseInt(words[i]));
            }
            System.out.println();
            Test--;
        }
    }
}
