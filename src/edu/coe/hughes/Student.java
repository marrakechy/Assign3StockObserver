package edu.coe.hughes;

public class Student implements Observer{

    @Override
    public void update() {
        System.out.println("Right away Sir!");
    }
}
