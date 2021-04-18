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
}
