import java.util.*;


class flightinfo 
{

    public static void flightdetails()
    {
        //System.out.println("Sr.no\t Flight Number\t Source\t Destination \tFare(Rs.)");
        String flightdetails[][]  = new String[6][6];
        
        flightdetails[0][0] =  "Sr.no";
        flightdetails[1][0] =  "FlightNo.";
        flightdetails[2][0] =  "Source";
        flightdetails[3][0] =  "Destination";
        flightdetails[4][0] =  "Fare(Rs.)";

        for(int i = 1; i<6; i++)
        {
            String s=Integer.toString(i); 
            flightdetails[0][i] = s;
        }
        flightdetails[1][1] =  "6E404";
        flightdetails[1][2] =  "SE479";
        flightdetails[1][3] =  "AK401";
        flightdetails[1][4] =  "SJ293";
        flightdetails[1][5] =  "7H781";

        flightdetails[2][1] = "BOMBAY";
        flightdetails[2][2] = "DELHI";
        flightdetails[2][3] = "KOLKATA";
        flightdetails[2][4] = "CHENNAI";
        flightdetails[2][5] = "SHRINAGAR";

        flightdetails[3][1] = "PANAGI";
        flightdetails[3][2] = "DEHRADUN";
        flightdetails[3][3] = "JAIPUR";
        flightdetails[3][4] = "BOMBAY";
        flightdetails[3][5] = "HYDERABAD";

        flightdetails[4][1] = "7000"; 
        flightdetails[4][2] = "9000"; 
        flightdetails[4][3] = "8500"; 
        flightdetails[4][4] = "4400"; 
        flightdetails[4][5] = "10000"; 
    
        
        for(int i = 0; i<6; i++)
        {
            for(int j = 0; j<5; j++)
            {
                System.out.print("\t" + flightdetails[j][i]);
            }
            System.out.println();
        }
    }

}

class reservation extends flightinfo
{
    public static void booking()
    {
        
    }
}

public class Airline extends flightinfo
{
    public static void main(String[] args) 
    {
        flightdetails();
    }
}
