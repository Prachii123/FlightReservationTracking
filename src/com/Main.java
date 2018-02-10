package com;

import com.pluralsight.travel.*;
import com.pluralsight.travel.Flight;
import com.xyzcompany.bar.*;
import com.pluralsight.travel.Passenger;

import javax.xml.crypto.dsig.spec.XPathType;
import java.util.Arrays;
import java.util.Iterator;


public class Main {

    Flight las175 = new Flight(175);
    Beer littleBeer = new Beer();
    Wine merlot = new Wine();

    public static void main(String args[]) {
        //passengerSorting();
        //flightSorting();

        Passenger[] passenger = addPassenger();
        Flight[] flight = addFlight();
        CrewMember[] crewMembers = addCrewMember();
        sorting(passenger);
        sorting(flight);

        Flight lax045 = new Flight(45);

        lax045.setCrew(addCrewMember());
        lax045.setRoster(addPassenger());

        /*
        Both of this for-loop and while loop gives the same result.
         */

       /* for(Person p : lax045)
            System.out.println(p.getName());

        Iterable<Person> laxIterable = lax045;
        Iterator<Person> persons = laxIterable.iterator();
        while(persons.hasNext()) {
            Person p = persons.next();
            System.out.println(p.getName());
        }*/


    }

    private static Passenger[] addPassenger() {
        Passenger bob = new Passenger();
        bob.setLevelAndDays(1,180, "bob");

        Passenger jane = new Passenger();
        jane.setLevelAndDays(1,90, "jane");

        Passenger steve = new Passenger();
        steve.setLevelAndDays(2,180, "steve");

        Passenger lisa = new Passenger();
        lisa.setLevelAndDays(3,730, "lisa");

        Passenger[] passengers = {bob, jane, steve, lisa};

        return passengers;
    }

    private static Flight[] addFlight() {

        Flight lax045 = new Flight();
        lax045.setFlightTime(45);

        Flight lax015 = new Flight();
        lax015.setFlightTime(15);

        Flight lax030 = new Flight();
        lax030.setFlightTime(30);

        return new Flight[]{lax045, lax015, lax030};

    }

    private static CrewMember[] addCrewMember() {

        //CrewMember[] cm = new CrewMember[3];

        //CrewMember cm1 = new CrewMember(FlightCrewJob.Pilot, "Patty");
        //CrewMember cm2 = new CrewMember(FlightCrewJob.CoPilot, "Karl");
        //CrewMember cm3 = new CrewMember(FlightCrewJob.AirMarshal, "Mary");

        CrewMember[] cm = {new CrewMember(FlightCrewJob.Pilot, "Patty"),
                           new CrewMember(FlightCrewJob.CoPilot, "Karl"),
                           new CrewMember(FlightCrewJob.AirMarshal, "Mary") };

        return cm;

    }

    private static void sorting( Object[] obj){

        if(obj instanceof Passenger[]) {
            Passenger[] p = (Passenger[])obj;
            Arrays.sort(p);
            for (Passenger xyz : p) {
                System.out.println(xyz);
            }
        }

        if(obj instanceof Flight[]) {
            Flight[] f = (Flight[])obj;
            Arrays.sort(f);
            for (Flight xyz : f) {
                System.out.println(xyz);
            }
        }
    }




    private static void passengerSorting() {
        Passenger bob = new Passenger();
        bob.setLevelAndDays(1,180, "bob");

        Passenger jane = new Passenger();
        jane.setLevelAndDays(1,90, "jane");

        Passenger steve = new Passenger();
        steve.setLevelAndDays(2,180, "steve");

        Passenger lisa = new Passenger();
        lisa.setLevelAndDays(3,730, "lisa");

        Passenger[] passengers = {bob, jane, steve, lisa};
        Arrays.sort(passengers);

        for (Passenger xyz : passengers) {
            System.out.println(xyz);
        }
    }

    private static void flightSorting() {
        Flight lax045 = new Flight();
        lax045.setFlightTime(45);

        Flight lax015 = new Flight();
        lax015.setFlightTime(15);

        Flight lax030 = new Flight();
        lax030.setFlightTime(30);

        Flight[] flights = {lax045, lax015, lax030};
        Arrays.sort(flights);

        for( Flight xyz : flights) {
            System.out.println(xyz);
        }

    }

}
