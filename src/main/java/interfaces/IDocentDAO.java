package interfaces;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import gebruikers.Docent;

@Entity
@Table(name = "student", uniqueConstraints = {@UniqueConstraint(columnNames = "email")})
public interface IDocentDAO extends IGenericDAO<Docent, String> {
	
}
