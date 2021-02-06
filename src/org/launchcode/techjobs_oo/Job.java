package org.launchcode.techjobs_oo;

import java.util.Collection;
import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.
    public Job() {
        id = nextId;
        nextId++;
    }

    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }

    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return id == job.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    //toString method

    @Override
    public String toString(){
        String aString;
        if(getName().equals("") || getName() == null){
            aString = "\n" + "ID: " + getId() + "\n" + "Name: Data not available";
        }
        else{
            aString = "\n" + "ID: " + getId() + "\n" + "Name: " + getName();
        }

        if(getEmployer().getValue().equals("") || getEmployer().getValue() == null){
            aString = aString +"\n" + "Employer: Data not available";
        }
        else {
            aString = aString + "\n" + "Employer: " + getEmployer();
        }

        if(getLocation().getValue().equals("") || getLocation().getValue() == null){
            aString = aString + "\n" + "Location: Data not available";
        }
        else {
            aString = aString + "\n" + "Location: " + getLocation();
        }

        if(getPositionType().getValue().equals("") || getPositionType().getValue() == null){
            aString = aString + "\n" + "Position Type: Data not available";
        }
        else {
            aString = aString + "\n" + "Position Type: " + getPositionType();
        }

        if(getCoreCompetency().getValue().equals("") || getCoreCompetency().getValue() == null){
            aString = aString + "\n" + "Core Competency: Data not available";
        }
        else {
            aString = aString + "\n" + "Core Competency: " + getCoreCompetency() + "\n";
        }
        return aString;
    }



    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }

    public int getId() {
        return id;
    }






}
