package org.juanmario.model;

public class SpinRequest {
    private int numberOfSpins;
    private String strategy;

    public int getNumberOfSpins() {
        return numberOfSpins;
    }

    public void setNumberOfSpins(int numberOfSpins) {
        this.numberOfSpins = numberOfSpins;
    }

    public String getStrategy() {
        return strategy;
    }

    public void setStrategy(String strategy) {
        this.strategy = strategy;
    }
}
