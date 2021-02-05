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

    @Before
    public void beforeTests() {
        newJobOne = new Job();
        newJobTwo = new Job();
        newJobThree = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
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
        assertTrue(newJobThree instanceof Job);
    }

    @Test
    public void testJobsForEquality(){
        Job sameJobOne = new Job("Zoo Keeper", new Employer("Stl Zoo"), new Location("St. Louis"), new PositionType("Handler"), new CoreCompetency("Animal Care"));
        Job sameJobTwo = new Job("Zoo Keeper", new Employer("Stl Zoo"), new Location("St. Louis"), new PositionType("Handler"), new CoreCompetency("Animal Care"));
        assertFalse(sameJobOne == sameJobTwo);
    }

//    @Test
//    public void testJobForEmptyLabel(){
//        Job sameJobOne = new Job("Zoo Keeper", null , new Location("St. Louis"), new PositionType("Handler"), new CoreCompetency("Animal Care"));
//        assertEquals("Data not available", sameJobOne);
//    }

}

