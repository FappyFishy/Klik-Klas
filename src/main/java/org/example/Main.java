package org.example;

import java.util.ArrayList;

import gebruikers.Docent;
import gebruikers.Student;

public class Main {
	ArrayList<Student> studenten = new ArrayList<Student>();
	ArrayList<Docent> docenten = new ArrayList<Docent>();
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
    public void registreerGebruiker(int type) {
    	if (type == 1) {
    		Student nieuw = new Student();
    		studenten.add(nieuw);
    	}
    	if (type == 2) {
    		Docent nieuw = new Docent();
    		docenten.add(nieuw);
    	}
    }
}