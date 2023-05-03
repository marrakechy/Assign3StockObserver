package edu.coe.hughes;

public interface StockSource {
    public void addStockObserver(StockObserver stockObserver);
    public void removeStockObserver(StockObserver stockObserver);
    public void notifyStockObservers(StockEvent stockEvent);
}

