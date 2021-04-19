package org.example;

class Kata {
    int aScore;
    int bScore;
    boolean advantageA;
    boolean advantageB;



    public Kata(){
        this.aScore = 0;
        this.bScore = 0;
    }

    public void scoredA() {

        if (aScore == 40){
            advantageA = true;
            return;
        }
        aScore += (aScore == 30) ? 10 : 15;

    }

    public void scoredB() {

        if (bScore == 40){
            advantageB = true;
            return;
        }
        bScore += (bScore == 30) ? 10 : 15;

    }

    public String showScore() {

        String stringA;
        String stringB;

        stringA = (advantageA) ? "A" : String.valueOf(aScore);

        stringB = (advantageB) ? "B" : String.valueOf(bScore);

        return String.format("%s - %s", stringA, stringB);


    }
}
