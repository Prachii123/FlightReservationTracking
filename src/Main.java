public class Main {

    public static void main(String[] args) {
	// write your code here

       /* Flight flight1 = new Flight();
        Flight flight2 = new Flight();
        Flight flight3 = null;

       // flight2.add1Passenger();
        //flight1.add1Passenger();
        //flight1.add1Passenger();

        //flight2 = flight1;

        if( flight1.hasRoom(flight2))
            flight3 = flight1.createNewWithBoth(flight2);

        Passenger bob = new Passenger();
        bob.setCheckedBags(3);

        Passenger jane = new Passenger(2);
        jane.setCheckedBags(3);

        Passenger jane1 = new Passenger(2,3);

        Flight val1 = new Flight(10);
        Flight val2 = new Flight(20);
        flight3.swap(val1, val2);
        System.out.println("inside swap of Main class  "+val1.getFlightNumber() + "   "+val2.getFlightNumber());
        flight3.swapNumbers(val1,val2);
        System.out.println("inside SwapNumbers of Main class  "+val1.getFlightNumber() + "   "+val2.getFlightNumber());

        Flight f = new Flight();
        System.out.println(f.toString());
        Passenger p1 = new Passenger(0,1);
        Passenger p2 = new Passenger(0,2);

        f.add1Passenger();
        f.add1Passenger(2);
        f.add1Passenger(p1);
        System.out.println("Total number of passengers "+f.getPassengers());
        short threeBags = 3;
        f.add1Passenger(threeBags,2);
        f.add1Passenger(p2,1);
        System.out.println("Total number of passengers "+f.getPassengers());

        Flight f1 = new Flight();
        Passenger janet = new Passenger(0,1);
        Passenger john = new Passenger(0,2);
        f1.add1Passengers(janet,john);

        Passenger fred = new Passenger(0,2);
        Passenger sarah = new Passenger(0,2);
        Passenger susie = new Passenger(0,0);
        f1.add1Passengers(fred,sarah,susie);
        System.out.println("Total number of passengers "+f1.getPassengers()); */

        /*
            From this point onwards we are doing coding for class inheritance chapter -09
         */

        /*CargoFlight cf = new CargoFlight();
        cf.add1package(1.0f,2.5f,3.9f);
        Passenger janeCF = new Passenger(0,2);
        cf.add1Passenger(janeCF);

        Flight f_cf = new CargoFlight();
        f_cf.add1Passenger(janeCF);
        //not allowed f.add1Package(1.0,2.5,1.5); // coz reference type(Flight in this case) does not know about methods and variables of  specific type of instance.
        Flight[] squadron = new Flight[2];
        squadron[0] = new Flight();
        squadron[1] = new CargoFlight();
        // with squadron[1]. we cannot call add1Package of CargoFlight Class.
        System.out.println(cf.seats);
        System.out.println(f_cf.seats);

        Flight f11 = new Flight();
        System.out.println("### f11.seats "+f11.seats);

        CargoFlight cf1 = new CargoFlight();
        System.out.println("### cf1.seats "+cf1.seats);
        System.out.println("### cf1.getType() "+cf1.getType());

        Flight f22 = new CargoFlight();//cf1;//new CargoFlight();
        System.out.println("### f22.seats "+f22.seats);
        System.out.println("### f22.getType() "+f22.getType());
        f22.add1Passenger(); // add1Passenger will call add1Passenger of Flight class, hasSeating will check seats from Flight call, which is wrong, we end up in adding 150 Passengers in a CargoFlight class.
        cf1.add1Passenger(); // it will call add1Passenger in Flight and seats from Flight as well
        // Fields hide base class fields with same name. Idea of hiding fields is v dangerous, instead we can use method overridding.

        System.out.println(f11.getSeats());
        System.out.println(cf1.getSeats());
        System.out.println(f22.getSeats());

        // object calss cahpter 9
        Object[] stuff = new Object[3];
       stuff[0] = new Flight();
       stuff[1] = new Passenger(0,2);
       stuff[2] = new CargoFlight();

        Object o = new Passenger();
        o = new Flight[5];
        o = new CargoFlight();

        if(o instanceof CargoFlight) {
           CargoFlight cf2 = (CargoFlight)o;
           cf2.add1package(1.0f,2.5f,3.0f);
    }*/

    // chapter -9 equality

        Flight flight1 = new Flight(175);
        Flight flight2 = new Flight(175);

        flight1 = flight2;

        if(flight1 == flight2)
            System.out.println("equals");
         else
            System.out.println("not equals");

        if(flight1.equals(flight2))
            System.out.println("equals");
        else
            System.out.println("not equals");

        Passenger p = new Passenger();
        if(flight1.equals(p))
            System.out.println("equals");
        else
            System.out.println("not equals");

        Flight f175 = new Flight(175);
        CargoFlight cf = new CargoFlight();
        CargoFlight cf249 = new CargoFlight(249);
        CargoFlight cf85 = new CargoFlight(85,2000.0f);
        CargoFlight cfBig = new CargoFlight(5000.0f);

        System.out.println("My Flight is "+ f175);

        StringBuilder sb = new StringBuilder(40);
        String location = "Florida";

        sb.append(" I Flew to ");
        sb.append(location);
        sb.append(" on ");
        sb.append(f175);
        int time = 9;
        System.out.println(sb.toString());

        int pos = sb.length() - " on ".length() - f175.toString().length();
        sb.insert(pos," at ");
        sb.insert(pos +4, time);
        System.out.println(sb.toString());

        CrewMember judy = new CrewMember(FlightCrewJob.CoPilot);
        judy.setJob(FlightCrewJob.Pilot);

    }
}
