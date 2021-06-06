package in.crudapi.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import in.crudapi.model.Students;

@Repository
public class StudentDAOImpl implements StudentDAO {

	@Autowired
	private EntityManager entityManager;
	
	@Override
	public List<Students> get() {
		Session currentSession = entityManager.unwrap(Session.class);
		Query<Students> query = currentSession.createQuery("from Students", Students.class);
		List<Students> list = query.getResultList();
		return list;
	}

	@Override
	public Students get(int id) {
		Session currentSession = entityManager.unwrap(Session.class);
		Students employeeObj = currentSession.get(Students.class, id);
		return employeeObj;
	}

	@Override
	public void save(Students students) {
		Session currentSession = entityManager.unwrap(Session.class);
		currentSession.saveOrUpdate(students);
	}

	@Override
	public void delete(int id) {
		Session currentSession = entityManager.unwrap(Session.class);
		Students employeeObj = currentSession.get(Students.class, id);
		currentSession.delete(employeeObj);
	}

}
