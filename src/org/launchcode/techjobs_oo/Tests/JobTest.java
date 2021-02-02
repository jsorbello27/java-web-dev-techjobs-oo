package org.launchcode.techjobs_oo.Tests;

import org.junit.Before;
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
        assertEquals(1, newJobOne.getId());
        assertEquals(2, newJobTwo.getId());
    }

    @Test
    public void testJobConstructorSetsAllFields(){
        assertEquals("Product tester", newJobThree.getName());
        assertTrue(newJobThree instanceof Job);

    }
}

