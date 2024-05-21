package com.codebind;

public class Die {
    private final int topBound;
    private final int bottomBound = 1;

    public Die(int topBound) {
        this.topBound = topBound;
    }

    public int roll() {
        return (int) (Math.random() * (topBound - bottomBound + 1) + bottomBound);
    }
}
