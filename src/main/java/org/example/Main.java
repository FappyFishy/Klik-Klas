package org.example;

import java.util.ArrayList;

import org.hibernate.Session;

import gebruikers.Docent;
import gebruikers.Student;
import factories.DAOFactories;
import factories.DAOFactory;
import utils.HibernateSessionManager;

public class Main {
	ArrayList<Student> studenten = new ArrayList<Student>();
	ArrayList<Docent> docenten = new ArrayList<Docent>();
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        
        DAOFactory.setTheFactory(DAOFactories.HIBERNATE.getTheFactory());

		Session session = HibernateSessionManager.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		
		Student nieuw = new Student("test","test","test");
		
		
		DAOFactory.getTheFactory().getStudentDAO().saveOrUpdate(nieuw);
		
		HibernateSessionManager.getSessionFactory().getCurrentSession().getTransaction().commit();
		HibernateSessionManager.shutdown();
    }
    public void registreerGebruiker(String gebruikersNaam, String wachtwoord, String email) {
    	if (email.contains("@student.scalda.nl")) {
    		Student nieuw = new Student(gebruikersNaam, wachtwoord, email);
    		DAOFactory.getTheFactory().getStudentDAO().saveOrUpdate(nieuw);
    		studenten.add(nieuw);
    	}
    	if (email.contains("@scalda.nl")) {
    		Docent nieuw = new Docent(gebruikersNaam, wachtwoord, email);
    		DAOFactory.getTheFactory().getDocentDAO().saveOrUpdate(nieuw);
  
    		docenten.add(nieuw);
    	}
    }
}