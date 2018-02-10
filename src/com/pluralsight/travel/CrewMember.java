package com.pluralsight.travel;

public class CrewMember extends Person { //implements Comparable<CrewMember>{

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

    /*public int compareTo(CrewMember cm) {
        if(job.compareTo(cm.job) == 0)
            return -1;
        else if(job < cm.job)
            return 1;
        else {
            if(name > cm.name)
                return -1;
            else if(name < cm.name)
                return 1;
            else
                return 0;
        }
    }*/
}
