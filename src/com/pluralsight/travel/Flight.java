package com.pluralsight.travel;//package com.pluralsight.travel;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

public class Flight implements Comparable<Flight>, Iterable<Person>{

    static final int MAX_FAA_SEATS = 550;

    private int passengers;
    public int seats;
    private int flightNumber;
    private char flightClass;
    int totalCheckedBags;
    int maxCarryOns = seats * 2;
    int totalCaaryOns;

    private int flightTime; // minutes past midnight

    Integer wrapperFlightNumber;
    Character wrapperflightClass;

    private CrewMember[] crew;
    private Passenger[] roster;

    public CrewMember[] getCrew() {
        return crew;
    }

    public void setCrew(CrewMember[] crew) {
        this.crew = crew;
    }

    public Passenger[] getRoster() {
        return roster;
    }

    public void setRoster(Passenger[] roster) {
        this.roster = roster;
    }

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
        if ( seats <= MAX_FAA_SEATS)
        this.seats = seats;
        //else
            //handle Error
    }
    public int getFlightNumber() {
        return flightNumber;
    }
    public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }
    public void setFlightTime(int flightTime) { this.flightTime = flightTime; }

    public int getFlightTime() {return flightTime;}
    public char getFlightClass() {
        return flightClass;
    }
    public void setFlightClass(char flightClass) {
        this.flightClass = flightClass;
    }


    public String getType() { return "Flight"; }

    public Flight() {
        seats = 150;
        passengers = 0;
    }

    public Flight(int flightNumber) {
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

    public void addPassengers(String fileName) throws IOException {

        BufferedReader reader = null;
        try{
            reader = new BufferedReader(new FileReader(fileName));
            String line = null;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(" ");
                passengers = Integer.valueOf(parts[0]);
            }
        } finally {
            if(reader != null)
                reader.close();
        }
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

    /*@Override
    public String toString() {
        return "Flight{" +
                "passengers=" + passengers +
                ", seats=" + seats +
                ", flightNumber=" + flightNumber +
                '}';
    }*/

   // @Override // meaningfull representation of a Object as a String.
    /*public String toString(){
       if(flightNumber > 0)
           return "Flight # " + flightNumber;
       else
           return "Flight Class " + flightClass;

    }*/

    /*
    this toString() is just for wrapper variable Demo/usages.
     */
    /*@Override
    public String toString(){
            if(wrapperFlightNumber != null)
                return "Flight # " + flightNumber;
            else if(wrapperflightClass != null)
                return "Flight Class " + flightClass;
            else
                return "Flight identity not set";
    }*/

    @Override
    public String toString() {
        return "Flight{" +
                "passengers=" + passengers +
                ", seats=" + seats +
                ", flightNumber=" + flightNumber +
                ", flightClass=" + flightClass +
                ", totalCheckedBags=" + totalCheckedBags +
                ", maxCarryOns=" + maxCarryOns +
                ", totalCaaryOns=" + totalCaaryOns +
                ", flightTime=" + flightTime +
                ", wrapperFlightNumber=" + wrapperFlightNumber +
                ", wrapperflightClass=" + wrapperflightClass +
                '}';
    }

    /*
       The base class object implements a version of equals that checks to see if two references pont to the same object. i.e.e it does reference comparision.
    */
    @Override
    public boolean equals(Object o) {
        if(super.equals(o))
            return true;
        if(!(o instanceof Flight))
            return false;
        Flight other = (Flight) o;
        return flightNumber == other.flightNumber &&
                flightClass == other.flightClass;

    }

    public int compareTo(Flight f) {
       return flightTime - f.flightTime;
    }

    public Iterator<Person> iterator() {
        return new FlightIterator(crew, roster);
    }
}
