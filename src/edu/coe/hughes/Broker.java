package edu.coe.hughes;

import java.util.ArrayList;
import java.util.ArrayList;

public class Broker implements StockObserver {
    private String name;
    private int increasingStreak;
    private int decreasingStreak;
    private double previousPrice;

    public Broker(String name) {
        this.name = name;
        this.increasingStreak = 0;
        this.decreasingStreak = 0;
        this.previousPrice = Double.NaN;
    }

    private void resetStreaks() {
        increasingStreak = 0;
        decreasingStreak = 0;
    }

    @Override
    public void update(StockEvent stockEvent) {
        double currentPrice = stockEvent.getPrice();
        if (Double.isNaN(previousPrice)) {
            previousPrice = currentPrice;
        } else if (currentPrice > previousPrice) {
            increasingStreak++;
            decreasingStreak = 0;
            if (increasingStreak == 5) {
                System.out.println("BUY!!!");
                resetStreaks();
            }
        } else if (currentPrice < previousPrice) {
            decreasingStreak++;
            increasingStreak = 0;
            if (decreasingStreak == 5) {
                System.out.println("SELL!!!");
                resetStreaks();
            }
        }
        previousPrice = currentPrice;
    }
}

