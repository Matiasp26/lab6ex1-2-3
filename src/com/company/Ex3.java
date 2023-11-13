package com.company;
import java.util.HashMap;

public class Ex3 {

    public static void main(String[] args){
        HashMap<String, Integer> note = new HashMap<String, Integer>();
        note.put("Matias", 8);
        note.put("Ionci", 10);
        note.put("Florian", 7);
        note.put("Mihael", 4);
        System.out.println("Acestea sunt notele: ");
        System.out.println(note);
        System.out.println(note.get("Ionci"));
        System.out.println("In clasa sunt atatia studenti: ");
        System.out.println(note.size());
        note.remove("Mihael");
        System.out.println("Mihael a picat examenul, asa ca au ramas urmatorii elevi: ");
        for (String i : note.keySet())
            System.out.println(i);
    }
}
