package org.launchcode.techjobs_oo.Tests;

import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.launchcode.techjobs_oo.*;
import org.junit.Test;

import static org.junit.Assert.*;

public class JobTest {
    Job newJobOne;
    Job newJobTwo;
    Job newJobThree;
    Job testIdentical1;
    Job testIdentical2;

    @Before
    public void beforeTests() {
        newJobOne = new Job();
        newJobTwo = new Job();
        newJobThree = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        testIdentical1 = new Job("Analyst", new Employer("Microsoft"), new Location("Webster Groves"), new PositionType("Data"), new CoreCompetency("Detail-Oriented"));
        testIdentical2 = new Job("Analyst", new Employer("Microsoft"), new Location("Webster Groves"), new PositionType("Data"), new CoreCompetency("Detail-Oriented"));
    }


    @Test
    public void testSettingJobId() {
        assertFalse(newJobOne == newJobTwo);
        assertEquals(1, newJobTwo.getId() - newJobOne.getId());
//        assertEquals(2, newJobTwo.getId());
    }

    @Test
    public void testJobConstructorSetsAllFields(){
        assertEquals("Product tester", newJobThree.getName());
        assertEquals("ACME", newJobThree.getEmployer().toString());
        assertTrue(newJobThree.getEmployer() instanceof Employer);
        assertEquals("Desert", newJobThree.getLocation().toString());
        assertTrue(newJobThree.getLocation() instanceof Location);
        assertEquals("Quality control", newJobThree.getPositionType().toString());
        assertTrue(newJobThree.getPositionType() instanceof PositionType);
        assertEquals("Persistence", newJobThree.getCoreCompetency().toString());
        assertTrue(newJobThree.getCoreCompetency() instanceof CoreCompetency);
    }

    @Test
    public void testJobsForEquality(){
        assertFalse(testIdentical1 == testIdentical2);
    }

    @Test
    public void testJobsForToString(){
        String testString = "\n" + "ID: " + testIdentical1.getId() + "\n" + "Name: " + testIdentical1.getName() + "\n" + "Employer: " + testIdentical1.getEmployer() + "\n" + "Location: " + testIdentical1.getLocation() + "\n" + "Position Type: " + testIdentical1.getPositionType() + "\n" + "Core Competency: " + testIdentical1.getCoreCompetency() + "\n";
        assertTrue(testString.equals(testIdentical1.toString()));

        String testStringBlank = "\n" + "ID: " + newJobOne.getId() + "\n" + "Name: Data not available" + "\n" + "Employer: Data not available" + "\n" + "Location: Data not available"+ "\n" + "Position Type: Data not available" + "\n" + "Core Competency: Data not available" + "\n";
        assertTrue(testStringBlank.equals(testStringBlank.toString()));
    }

}

