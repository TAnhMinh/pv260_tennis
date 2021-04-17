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

        assertTrue(game.aScore > aScore);
        assertTrue(game.bScore > bScore);

        // Sets score of both players to 40
        game.scoredA();
        game.scoredA();
        game.scoredB();
        game.scoredB();

        assertEquals(40, game.aScore);
        assertEquals(40, game.bScore);


        game.scoredA(); // Sets playerA to have advantage
        game.scoredB(); // Resets playerA advantage

        assertEquals(40, game.aScore);
        assertEquals(40, game.bScore);
    }
}
