package edu.ucsb.cs156.spring.hello;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TeamTest {

    Team team;

    @BeforeEach
    public void setup() {
        team = new Team("test-team");
        
    }

    @Test
    public void getName_returns_correct_name() {
       assert(team.getName().equals("test-team"));
    }

    @Test
    public void toString_returns_correct_string() {
        assertEquals("Team(name=test-team, members=[])", team.toString());
    }

    @Test
    public void equals_returns_correct_boolean() {
        Team t1 = team;
        assertEquals(true, team.equals(t1));

        int[] testArr = new int[5];
        


        Team t2 = new Team();
        Team t3 = new Team("test-team");
        
        assertEquals(false, team.equals(t2));
        assertEquals(true, t3.equals(team));
        
        
        assertEquals(false, team.equals(testArr));
        t3.addMember("testName1");
        t2.addMember("testName1");
        assertEquals(false, t2.equals(t3));
        assertEquals(false, t3.equals(team));
    }

    @Test
    public void hash_testing() {
        Team t = new Team();
        int result = t.hashCode();
        int expectedResult = 1;
        assertEquals(result, expectedResult);
    }
    // TODO: Add additional tests as needed to get to 100% jacoco line coverage, and
    // 100% mutation coverage (all mutants timed out or killed)

}
