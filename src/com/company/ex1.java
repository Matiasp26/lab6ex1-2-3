package com.company;
import java.util.ArrayList;

public class ex1 {

    public static void ex1(String[] args) {
	    ArrayList<String> students = new ArrayList<String>();
        students.add("Ionut");
        students.add("Bogdan");
        students.add("Flaviu");
        students.add("Istvan");
        students.get(0);
        students.set(1, "Mircea");
        students.remove(3);
        System.out.println(students);
    }
}
