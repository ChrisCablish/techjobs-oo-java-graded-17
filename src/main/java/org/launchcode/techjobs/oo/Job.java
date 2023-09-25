package org.launchcode.techjobs.oo;

import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;

    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

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

    @Override
    public String toString() {
        int idRepresentation = (this.getId());
        String employerRepresentation = (employer.toString().isEmpty()) ? "Data not available" : employer.toString();
        String locationRepresentation = (location.toString().isEmpty()) ? "Data not available" : location.toString();
        String positionRepresentation = (positionType.toString().isEmpty() ? "Data not available" : positionType.toString());
        String competencyRepresentation = (coreCompetency.toString().isEmpty() ? "Data not available" : coreCompetency.toString());

        return System.lineSeparator() +
                "ID: " + idRepresentation + System.lineSeparator() +
                "Name: " + name + System.lineSeparator() +
                "Employer: " + employerRepresentation + System.lineSeparator() +
                "Location: " + locationRepresentation + System.lineSeparator() +
                "Position Type: " + positionRepresentation + System.lineSeparator() +
                "Core Competency: " + competencyRepresentation
                + System.lineSeparator();
    }


    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }


    public int getId() {
        return id;
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


    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.

    public Job() {
        this.id = nextId;
        nextId++;
    }

    public Job (String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
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


}
