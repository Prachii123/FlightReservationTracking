package com.pluralsight.travel;

public class CrewMember extends Person{

    private FlightCrewJob job;

    public CrewMember(FlightCrewJob job) {
        this.job = job;
    }

    public void setJob(FlightCrewJob job) {
        this.job = job;
    }

    public CrewMember() {};

    public CrewMember(FlightCrewJob job, String name) {
        this.name = name;
        this.job = job;

    }

    public String addCrewMembers() {
        return job + " " +name;
    }
}
