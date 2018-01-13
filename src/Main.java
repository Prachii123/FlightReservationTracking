public class Main {

    public static void main(String[] args) {
	// write your code here

        Flight flight1 = new Flight();
        Flight flight2 = new Flight();
        Flight flight3 = null;

        flight2.add1Passenger();
        flight1.add1Passenger();
        flight1.add1Passenger();

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





    }
}
