package edu.coe.hughes;

import java.util.ArrayList;

public class Assign implements Subject {
    private int daysuntilDue;
    private ArrayList<Observer> observers;

    public Assign(int daysuntilDue) {
        this.daysuntilDue = daysuntilDue;
        observers = new ArrayList<Observer>();
    }

    public int getDaysuntilDue() {
        return daysuntilDue;
    }

    public void setDaysuntilDue(int daysuntilDue) {
        this.daysuntilDue = daysuntilDue;
        alert();
    }

    @Override
    public void addObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void alert() {
        for (Observer o: observers){
            o.update();
        }
    }
}
