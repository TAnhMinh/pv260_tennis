package org.example;

class Kata {
    int aScore;
    int bScore;



    public Kata(){
        this.aScore = 0;
        this.bScore = 0;
    }

    public void scoredA() {
        if (aScore == 40) { return; }
        aScore += (aScore == 30) ? 10 : 15;
    }

    public void scoredB() {
        if (bScore ==40) { return; }
        bScore += (bScore == 30) ? 10 : 15;
    }
}
