package edu.coe.hughes;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	 Assign a = new Assign(5);
	 Student s; //= new Student();
	 ArrayList<Student> course = new ArrayList<Student>();
	 for (int i= 0; i< 5; i++){
	 	s = new Student();
	 	course.add(s);
	 	a.addObserver(s);
	 }
	 //a.addObserver(s);
	 a.setDaysuntilDue(7);
    }
}
