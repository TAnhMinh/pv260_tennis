package org.example;

class Kata {
    int aScore;
    int bScore;
    String winner;
    boolean advantageA;
    boolean advantageB;



    public Kata(){
        this.aScore = 0;
        this.bScore = 0;
    }

    public void scoredA() {
        if (advantageA) {
            winner = "A";
            return;
        }
        if (aScore == 40 && bScore == 40) {
            if (advantageB) {
                advantageB = false;
                return;
            }
            advantageA = true;
            return;

        }
        if (aScore == 40){
            winner = "A";
            return;
        }
        aScore += (aScore == 30) ? 10 : 15;

    }

    public void scoredB() {
        if (advantageB) {
            winner = "B";
            return;
        }
        if (bScore == 40 && aScore == 40) {
            if (advantageA) {
                advantageA = false;
                return;
            }
            advantageB = true;
            return;
        }
        if (bScore == 40){
            winner = "B";
            return;
        }
        bScore += (bScore == 30) ? 10 : 15;

    }

    public String showScore() {

        if (winner != null) {
            return String.format("winner: %s", winner);
        }

        String stringA;
        String stringB;

        stringA = (advantageA) ? "A" : String.valueOf(aScore);
        stringB = (advantageB) ? "A" : String.valueOf(bScore);

        if (aScore != bScore || advantageA || advantageB) {
            return String.format("%s - %s", stringA, stringB);

        } else{
            return (aScore == 40) ? "deuce" : String.format("%s all", stringA);
        }
    }
}
