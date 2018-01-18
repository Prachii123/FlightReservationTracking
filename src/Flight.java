public class Flight {

    private int passengers;
    public int seats;
    private int flightNumber;
    private char flightClass;
    int totalCheckedBags;
    int maxCarryOns = seats * 2;
    int totalCaaryOns;

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

    public String getType() { return "Flight"; }

    Flight() {
        seats = 150;
        passengers = 0;
    }

    Flight(int flightNumber) {
        super();
        //this();
       this.flightNumber = flightNumber;
    }

    public void add1Passenger() {
        if( hasSeating())
            passengers += 1;
        else
            handeTooMany();
    }

    public void add1Passenger(int bags) {
        if(hasSeating()) {
            add1Passenger();
            totalCheckedBags += bags;
        }
    }

    public void add1Passenger(Passenger p) {
        add1Passenger(p.getCheckedBags());
    }

    public void add1Passenger(int bags, int carryOns) {
        if(hasSeating() && hasCarryOnSpace(carryOns)) {
            add1Passenger(bags);
            totalCaaryOns += carryOns;
        }
    }

    public void add1Passenger(Passenger p, int carryOns) {
        add1Passenger(p.getCheckedBags(), carryOns);
    }

    public void add1Passengers(Passenger... list) {
        if(hasSeating(list.length)) {
            passengers += list.length;
            for (Passenger passenger : list)
                totalCheckedBags += passenger.getCheckedBags();
        }
        else
            handeTooMany();
    }

    private void handeTooMany() {
        System.out.println("Too Many");
    }

    private boolean hasSeating() {
        return passengers < getSeats();
    }

    private boolean hasSeating(int count) {
        return passengers + count <= getSeats();
    }

    private boolean hasCarryOnSpace(int carryOns) {
        System.out.println(totalCaaryOns + carryOns <= maxCarryOns);
        System.out.println(totalCaaryOns+" "+carryOns+" "+maxCarryOns);
        return totalCaaryOns + carryOns <= maxCarryOns;
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
