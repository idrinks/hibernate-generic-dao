package test.trg.dao.dao.standard;

import java.util.List;

import test.trg.model.Person;

import com.trg.dao.hibernate.GenericDAO;

public interface PersonDAO extends GenericDAO<Person, Long> {
	public List<Person> findByName(String firstName, String lastName);
}