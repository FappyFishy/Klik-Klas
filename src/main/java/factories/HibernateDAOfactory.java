package factories;

import org.hibernate.Session;

import dao.GenericHibernateDAO;
import dao.StudentDAO;
import gebruikers.Student;
import interfaces.IDocentDAO;
import interfaces.IRuimteDAO;
import interfaces.IStudentDAO;
import utils.HibernateSessionManager;

public class HibernateDAOfactory extends DAOFactory {

	protected Session getCurrentSession() {
		return HibernateSessionManager.getSessionFactory().openSession();
	}


	@Override
	public IStudentDAO getStudentDAO() {
		GenericHibernateDAO<Student, String> dao = null;
		try {
			dao = StudentDAO.class.newInstance();
			dao.setSession(getCurrentSession());
		} catch (InstantiationException | IllegalAccessException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return (IStudentDAO) dao;
	}
	
	@Override
	public IDocentDAO getDocentDAO() {
		GenericHibernateDAO<Student, String> dao = null;
		try {
			dao = StudentDAO.class.newInstance();
			dao.setSession(getCurrentSession());
		} catch (InstantiationException | IllegalAccessException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return (IDocentDAO) dao;
	}
	
	@Override
	public IRuimteDAO getRuimteDAO() {
		GenericHibernateDAO<Student, String> dao = null;
		try {
			dao = StudentDAO.class.newInstance();
			dao.setSession(getCurrentSession());
		} catch (InstantiationException | IllegalAccessException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return (IRuimteDAO) dao;
	}
	
}
