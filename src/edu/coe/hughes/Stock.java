package edu.coe.hughes;

import java.util.ArrayList;

public class Stock implements StockSource {
    private String symbol;
    private double price;
    private ArrayList<StockObserver> observers;

    public Stock(String symbol, double price) {
        this.symbol = symbol;
        this.price = price;
        observers = new ArrayList<StockObserver>();
    }

    public String getSymbol() {
        return symbol;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
        notifyStockObservers(new StockEvent(price));
    }

    @Override
    public void addStockObserver(StockObserver stockObserver) {
        observers.add(stockObserver);
    }

    @Override
    public void removeStockObserver(StockObserver stockObserver) {
        observers.remove(stockObserver);
    }

    @Override
    public void notifyStockObservers(StockEvent stockEvent) {
        for (StockObserver observer : observers) {
            observer.update(stockEvent);
        }
    }
}

