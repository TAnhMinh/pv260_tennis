package org.example;

import java.util.ArrayList;
import java.util.Arrays;

class Kata {
    ArrayList<String> playerLetters = new ArrayList<>(Arrays.asList("A", "B"));
    ArrayList<Integer> scores;
    ArrayList<Boolean> advantages;
    int aScore;
    int bScore;
    String winner;
    boolean advantageA;
    boolean advantageB;



    public Kata(){
        scores = new ArrayList<>(Arrays.asList(0,0));
        advantages = new ArrayList<>(Arrays.asList(false, false));
        winner = null;
        advantageA = false;
        advantageB = false;
    }

    private void scored(int playerNumber){
        checkAlreadyWinner();

        int otherPlayerNumber = 1 - playerNumber;
        if (advantages.get(playerNumber)) {
            winner = playerLetters.get(playerNumber);
            return;
        }
        if (scores.get(playerNumber) == 40 && scores.get(otherPlayerNumber) == 40) {
            if (advantages.get(otherPlayerNumber)) {
                advantages.set(otherPlayerNumber, false);
                return;
            }
            advantages.set(playerNumber, true);
            return;

        }
        if (scores.get(playerNumber) == 40){
            winner = playerLetters.get(playerNumber);
            return;
        }
        int addToScore = (scores.get(playerNumber) == 30) ? 10 : 15;
        scores.set(playerNumber, addToScore);
    }

    public void scoredA() {
        scored(0);

    }

    public void scoredB() {
        scored(1);
    }



    public String showScore() {

        if (winner != null) {
            return String.format("winner: %s", winner);
        }

        String stringA;
        String stringB;

        stringA = (advantageA) ? "A" : String.valueOf(aScore);
        stringB = (advantageB) ? "B" : String.valueOf(bScore);

        return getRightScoreString(stringA, stringB);
    }

    private String getRightScoreString(String stringA, String stringB) {
        if (aScore != bScore || advantageA ) {
            return String.format("%s - %s", stringA, stringB);
        }
        else if ( advantageB){
            return String.format("%s - %s", stringB, stringA);
        }
        else{
            return (aScore == 40) ? "deuce" : String.format("%s all", stringA);
        }
    }

    private void checkAlreadyWinner() {
        if (winner != null) {
            throw new IllegalStateException(winner + "already won!");
        }
    }
}
