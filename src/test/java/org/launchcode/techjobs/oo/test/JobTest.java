package org.launchcode.techjobs.oo.test;
import org.junit.Test;

import static org.junit.Assert.*;

public class JobTest {
    //TODO: Create your unit tests here
    @Test
    public void testSettingJobId () {
        Job jobOne = new Job();
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
        Job jobOne = new Job("Industrial Maintenance", new Employer("Browning"), new Location("Arnold"), new PositionType("Warehouse"), new CoreCompetency("Mechanical"));
        Job jobTwo = new Job("Industrial Maintenance", new Employer("Browning"), new Location("Arnold"), new PositionType("Warehouse"), new CoreCompetency("Mechanical"));
        assertFalse(jobOne.equals(jobTwo));
    }
}
