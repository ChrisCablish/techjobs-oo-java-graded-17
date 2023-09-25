package org.launchcode.techjobs.oo;
//import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.launchcode.techjobs.oo.*;

import static org.junit.Assert.*;

public class JobTest {
    //TODO: Create your unit tests here
    private Job jobOne;
    @BeforeEach
    public void setUp () {
        jobOne = new Job("Industrial Maintenance", new Employer("Browning"), new Location("Arnold"), new PositionType("Warehouse"), new CoreCompetency("Mechanical"));
    }

    @Test
    public void testSettingJobId () {
//        Job jobOne = new Job();
        Job jobTwo = new Job();
        assertNotEquals(jobOne.getId(),jobTwo.getId());
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        Job job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertTrue(job.getName() instanceof String);
        assertEquals(job.getName(), "Product tester");
        assertTrue(job.getEmployer() instanceof Employer);
        assertEquals(job.getEmployer().toString(), "ACME");
        assertTrue(job.getLocation() instanceof Location);
        assertEquals(job.getLocation().toString(), "Desert");
        assertTrue(job.getPositionType() instanceof PositionType);
        assertEquals(job.getPositionType().toString(), "Quality control");
        assertTrue(job.getCoreCompetency() instanceof CoreCompetency);
        assertEquals(job.getCoreCompetency().toString(), "Persistence");
    }

    @Test
    public void testJobsForEquality () {
        Job jobTwo = new Job("Industrial Maintenance", new Employer("Browning"), new Location("Arnold"), new PositionType("Warehouse"), new CoreCompetency("Mechanical"));
        assertFalse(jobOne.equals(jobTwo));
    }

    @Test
    public void testToStringStartsAndEndsWithNewLine () {
        assertTrue(jobOne.toString().startsWith(System.lineSeparator()));
        assertTrue(jobOne.toString().endsWith(System.lineSeparator()));

    }

    @Test
    public void testToStringContainsCorrectLabelsAndData () {
        String expected =
                System.lineSeparator() + "ID: " + jobOne.getId() + System.lineSeparator() + "Name: "
                        + jobOne.getName() + System.lineSeparator() + "Employer: " + jobOne.getEmployer()
                        + System.lineSeparator() + "Location: " + jobOne.getLocation() + System.lineSeparator()
                        + "Position Type: " +jobOne.getPositionType() + System.lineSeparator() + "Core Competency: "
                        + jobOne.getCoreCompetency() + System.lineSeparator();
        Assertions.assertEquals(expected, jobOne.toString());
    }

    @Test
    public void testToStringHandlesEmptyField() {
        Job jobWithSomeEmpty = new Job("Industrial Maintenance", new Employer(""), new Location("Arnold"), new PositionType("Warehouse"), new CoreCompetency("Mechanical"));
        String result = jobWithSomeEmpty.toString();

        // Checking if the employer part of the result has "Data not available"
        Assertions.assertTrue(result.contains("Employer: Data not available"));
    }


}
