package org.example;

import org.junit.Test;

import static java.lang.invoke.MethodHandles.catchException;
import static org.junit.Assert.*;

/**
 * Unit test for simple App.
 */
public class KataTest
{
    @Test
    public void createGameTest()
    {
        Kata game = new Kata();
        assertNotNull(game);
    }

    @Test
    public void bothPlayersZeroScoreAfterCreationTest() {

        Kata game = new Kata();
        assertEquals(0, game.aScore);
        assertEquals(0, game.bScore);
    }

    @Test
    public void scoredPlayerTest() {

        Kata game = new Kata();
        int aScore = game.aScore;
        int bScore = game.bScore;

        game.scoredA();
        game.scoredB();

        assertEquals(game.aScore, 15);
        assertEquals(game.bScore, 15);

        assertTrue(game.aScore > aScore);
        assertTrue(game.bScore > bScore);

        // Sets score of both players to 40
        game.scoredA();
        game.scoredB();

        assertEquals(game.aScore, 30);
        assertEquals(game.bScore, 30);

        game.scoredA();
        game.scoredB();

        assertEquals(40, game.aScore);
        assertEquals(40, game.bScore);

        game.scoredA(); // should not go above 40
        game.scoredB(); // same

        assertEquals(40, game.aScore);
        assertEquals(40, game.bScore);
    }

    /**
     * Tests that if A player is at 40, the next
     * scoring sets the advantage.
     *  Other players points are going up so this does not
     *  test the impact of the difference yet.
     */
    @Test
    public void dumbAdvantageTestA() {

        Kata game = new Kata();

        game.scoredA();
        game.scoredB();
        game.scoredA();
        game.scoredB();
        game.scoredA();
        game.scoredB();
        game.scoredA();

        assertEquals(40, game.aScore);
        assertEquals(40, game.bScore);
        assertTrue(game.advantageA);
    }

    /**
     * Tests that if B player is at 40, the next
     * scoring sets the advantage.
     * Other players points are going up so this does not
     * test the impact of the difference yet.
     */
    @Test
    public void dumbAdvantageTestB() {

        Kata game = new Kata();

        game.scoredB();
        game.scoredA();
        game.scoredB();
        game.scoredA();
        game.scoredB();
        game.scoredA();
        game.scoredB();

        assertEquals(40, game.aScore);
        assertEquals(40, game.bScore);
        assertTrue(game.advantageB);
    }
}
