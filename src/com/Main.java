package com;

import com.pluralsight.travel.*;
import com.pluralsight.travel.Flight;
import com.xyzcompany.bar.*;
import com.pluralsight.travel.Passenger;

import java.util.Arrays;


public class Main {

    Flight las175 = new Flight(175);
    Beer littleBeer = new Beer();
    Wine merlot = new Wine();

    public static void main(String args[]) {

        passengerSorting();
        flightSorting();


    }

    private static void passengerSorting() {
        Passenger bob = new Passenger();
        bob.setLevelAndDays(1,180);

        Passenger jane = new Passenger();
        jane.setLevelAndDays(1,90);

        Passenger steve = new Passenger();
        steve.setLevelAndDays(2,180);

        Passenger lisa = new Passenger();
        lisa.setLevelAndDays(3,730);

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
