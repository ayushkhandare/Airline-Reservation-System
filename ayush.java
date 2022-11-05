import java.util.*;


class flightinfo 
{
    public String FlightNo;
    public String Source;
    public String Destination;
    public int Fare;

    public static void flightdetails()
    {
        flightinfo[] arr;
        arr = new flightinfo[5];

        String FlightNo;
        String Source;
        String Destination;
        int Fare;
        FlightNo = "6E404";
        Source = "BOMBAY";
        Destination = "PANAGI";
        Fare = 7000;
        arr[0] = new flightinfo(FlightNo, Source, Destination, Fare);
        
        FlightNo = "SE479";
        Source = "DELHI";
        Destination = "DEHRADUN";
        Fare = 9000;
        arr[1] = new flightinfo(FlightNo, Source, Destination, Fare);
        
        FlightNo = "AK401";
        Source = "KOLKATA";
        Destination = "JAIPUR";
        Fare = 8500;
        arr[2] = new flightinfo(FlightNo, Source, Destination, Fare);
        
        FlightNo = "SJ293";
        Source = "CHENNAI";
        Destination = "BOMBAY";
        Fare = 4400;
        arr[3] = new flightinfo(FlightNo, Source, Destination, Fare);
        
        FlightNo = "7H781";
        Source = "SHRINAGAR";
        Destination = "HYDERABAD";
        Fare = 10000;
        arr[4] = new flightinfo(FlightNo, Source, Destination, Fare);

        System.out.printf("%-15s%-15s%-15s%-15s%-18s%n","Sr. No.", "FlightNo.", "Source", "Destination", "Fare");
        for(int i=0;i<arr.length;i++)
        {
            System.out.printf("%-15s%-15s%-15s%-15s%-18s%n", i+1, arr[i].FlightNo, arr[i].Source, arr[i].Destination, arr[i].Fare);
        }

            
    }

    public flightinfo(String FlightNo, String Source, String Destination, int Fare)
    {
        this.FlightNo = FlightNo;
        this.Source = Source;
        this.Destination = Destination;
        this.Fare = Fare;
    }

}


public class Airline extends flightinfo
{
    public Airline(String FlightNo, String Source, String Destination, int Fare)
    {
        super(FlightNo, Source, Destination, Fare);
    }
    public static void main(String[] args) 
    {
        flightdetails();
    }
}
