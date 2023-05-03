package edu.coe.hughes;

public class Investor implements StockObserver {
    private String name;
    private int sharesOwned;
    private double investmentAmount;

    public Investor(String name) {
        this.name = name;
        this.sharesOwned = 0;
        this.investmentAmount = 0.0;
    }

    public void makeTransaction(int numShares, double price) {
        if (numShares > 0) {
            sharesOwned += numShares;
            investmentAmount += numShares * price;
        } else {
            int numSharesToSell = Math.min(sharesOwned, -numShares);
            sharesOwned -= numSharesToSell;
            investmentAmount -= numSharesToSell * price;
        }
    }

    @Override
    public void update(StockEvent stockEvent) {
        makeTransaction(10, stockEvent.getPrice());
    }
}

