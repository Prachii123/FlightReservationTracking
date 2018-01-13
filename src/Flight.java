public class Flight {

    private int passengers;
    private int seats;
    private int flightNumber;
    private char flightClass;

    public int getPassengers() {
        return passengers;
    }
    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }
    public int getSeats() {
        return seats;
    }
    public void setSeats(int seats) {
        this.seats = seats;
    }
    public int getFlightNumber() {
        return flightNumber;
    }
    public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }
    public char getFlightClass() {
        return flightClass;
    }
    public void setFlightClass(char flightClass) {
        this.flightClass = flightClass;
    }

    Flight() {
        seats = 150;
        passengers = 0;
    }

    Flight(int flightNumber) {
        super();
        //this();
       this.flightNumber = flightNumber;
    }

    void add1Passenger() {
        if( passengers < seats)
            passengers += 1;
        else
            handeTooMany();
    }



    private void handeTooMany() {
        System.out.println("Too Many");
    }

    public boolean hasRoom(Flight f2) {
        int total = this.passengers + f2.passengers;
        return total <= seats;
    }

    public Flight createNewWithBoth(Flight f2) {
        Flight newFlight = new Flight();
        newFlight.seats = seats;
        newFlight.passengers = this.passengers + f2.passengers;
        return newFlight;

    }

    void swap(Flight i, Flight j) {
        Flight k = i;
        i = j;
        j = k;
        System.out.println("inside Swap of Flight class  "+i + "   "+j);
    }

    void swapNumbers(Flight i, Flight j) {
        int k = i.getFlightNumber();
        i.setFlightNumber(j.getFlightNumber());
        j.setFlightNumber(k);
        System.out.println("inside SwapNumbers of Flight class  "+i + "   "+j);
    }

    @Override
    public String toString() {
        return "Flight{" +
                "passengers=" + passengers +
                ", seats=" + seats +
                ", flightNumber=" + flightNumber +
                '}';
    }
}
