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
        assertEquals(true, team.equals(team));
        Team t2 = new Team();
        int[] testArr = new int[5];
        assertEquals(false, team.equals(t2));
        assertEquals(false, team.equals(testArr));
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
