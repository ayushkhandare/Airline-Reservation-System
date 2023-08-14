import java.util.*;

class flightinfo 
{
    public int srno;
    public String FlightNo;
    public String Source;
    public String Destination;
    public int Fare;
    public flightinfo(int srno, String FlightNo, String Source, String Destination, int Fare)
    {
        this.srno = srno;
        this.FlightNo = FlightNo;
        this.Source = Source;
        this.Destination = Destination;
        this.Fare = Fare;
    }
}

class reservation 
{
    public int srno;
    public String FlightNo;
    public String Source;
    public String Destination;
    public int Fare;
    public reservation(int srno, String FlightNo, String Source, String Destination, int Fare)
    {
        this.srno = srno;
        this.FlightNo = FlightNo;
        this.Source = Source;
        this.Destination = Destination;
        this.Fare = Fare;
    }   
}



public class Airline
{
    public static void main(String[] args)
    {
        int choice, srno, Fare; 
        String Source, Destination, FlightNo; 

        Scanner sc=new Scanner(System.in); 
        Vector<flightinfo> flight=new Vector<flightinfo>();
        Vector<reservation> book = new Vector<reservation>();
        
        System.out.println("Operation Menu"); 
        while(true)
        {
            System.out.println();
            System.out.println("1. Show Flight Details.");
            System.out.println("2. Booking.");
            System.out.println("3. Cancellation");
            System.out.println("4. Show all bookings");
            System.out.println("5. Exit");
            System.out.println("Select operation number you want to perform"); 
            choice=sc.nextInt();
            switch(choice)
            {
                case 1:
                    srno = 1;
                    FlightNo = "KG604";
                    Source = "BOMBAY";
                    Destination = "PANAGI";
                    Fare = 7000;
                    flight.addElement(new flightinfo(srno, FlightNo, Source, Destination, Fare));

                    srno = 2;
                    FlightNo = "SE479";
                    Source = "DELHI";
                    Destination = "DEHRADUN";
                    Fare = 9000;
                    flight.addElement(new flightinfo(srno, FlightNo, Source, Destination, Fare));

                    srno = 3;
                    FlightNo = "AK401";
                    Source = "KOLKATA";
                    Destination = "JAIPUR";
                    Fare = 8500;
                    flight.addElement(new flightinfo(srno, FlightNo, Source, Destination, Fare));

                    srno = 4;
                    FlightNo = "LJ293";
                    Source = "CHENNAI";
                    Destination = "BOMBAY";
                    Fare = 4400;
                    flight.addElement(new flightinfo(srno, FlightNo, Source, Destination, Fare));

                    srno = 5;
                    FlightNo = "PM781";
                    Source = "SHRINAGAR";
                    Destination = "HYDERABAD";
                    Fare = 10000;
                    flight.addElement(new flightinfo(srno, FlightNo, Source, Destination, Fare));

                    System.out.print("Srno\t");
                    System.out.print("Flight Number\t"); 
                    System.out.print("Source\t\t"); 
                    System.out.print("Destination\t");
                    System.out.print("Fare\n");

                    for(int i=0;i<4;i++)
                    {
                        System.out.print(flight.get(i).srno+"\t");
                        System.out.print(flight.get(i).FlightNo+"\t\t"); 
                        System.out.print(flight.get(i).Source+"\t\t"); 
                        System.out.print(flight.get(i).Destination+"\t\t");
                        System.out.print(flight.get(i).Fare);
                        System.out.println();
                    }

                    System.out.print(flight.get(4).srno+"\t");
                    System.out.print(flight.get(4).FlightNo+"\t\t"); 
                    System.out.print(flight.get(4).Source+"\t"); 
                    System.out.print(flight.get(4).Destination+"\t");
                    System.out.print(flight.get(4).Fare);
                    System.out.println();
                    
                    break;

                case 2:
                    int a=0;
                    System.out.println("Enter the Flight Number you want to book");
                    FlightNo=sc.next();
                    for(int i=0;i<flight.size();i++)
                    {
                        if(FlightNo.equals(flight.get(i).FlightNo))
                        {
                            srno = flight.get(i).srno;
                            Source = flight.get(i).Source;
                            Destination = flight.get(i).Destination;
                            Fare = flight.get(i).Fare;
                            book.addElement(new reservation(srno, FlightNo, Source, Destination, Fare));
                            a++;

                            break;
                        }
                    }
                    if(a==0)
                    {
                        System.out.println("Flight not found.");
                    }
                    else
                    {
                        System.out.println("Ticket for Flight Number: "+FlightNo+" is booked.");
                    }    
                    break;

                case 3:
                    System.out.println();
                    System.out.print("Srno\t");
                    System.out.print("Flight Number\t"); 
                    System.out.print("Source\t\t"); 
                    System.out.print("Destination\t");
                    System.out.print("Fare\n");    
                    
                    for(int i=0;i<book.size();i++)
                    {
                        System.out.print(book.get(i).srno+"\t");
                        System.out.print(book.get(i).FlightNo+"\t\t"); 
                        System.out.print(book.get(i).Source+"\t\t"); 
                        System.out.print(book.get(i).Destination+"\t\t");
                        System.out.print(book.get(i).Fare);
                        System.out.println();
                    }

                    a=0;
                    System.out.println("Enter srno of flight you want to delete:");
                    srno=sc.nextInt();
                    for(int i=0;i<book.size();i++)
                    {
                        if(srno == (book.get(i).srno))
                        {
                            book.remove(i); 
                            a++;
                            break;
                        }
                    }
                    if(a==0)
                        System.out.println("Flight not found."); 
                    break;
                
                case 4:
                    if(book.size() == 0)
                    {
                        System.out.println("You have no bookings");
                    }
                    else
                    {
                        System.out.println();
                        System.out.print("Srno\t");
                        System.out.print("Flight Number\t"); 
                        System.out.print("Source\t\t"); 
                        System.out.print("Destination\t");
                        System.out.print("Fare\n");    

                        for(int i=0;i<book.size();i++)
                        {
                            System.out.print(book.get(i).srno+"\t");
                            System.out.print(book.get(i).FlightNo+"\t\t"); 
                            System.out.print(book.get(i).Source+"\t\t"); 
                            System.out.print(book.get(i).Destination+"\t\t");
                            System.out.print(book.get(i).Fare);
                            System.out.println();
                        }
                    }
                    break;
         
                case 5:
                    System.out.println("EXIT");
                    System.exit(0); 
                    break;
            }
        }
    }
}

