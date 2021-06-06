package in.crudapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import in.crudapi.dao.StudentDAO;
import in.crudapi.model.Students;

@Service
public class StudentsServiceImpl implements StudentsService {

	@Autowired
	private StudentDAO studentDAO; 
	
	@Transactional
	@Override
	public List<Students> get() {
		return studentDAO.get();
	}

	@Transactional
	@Override
	public Students get(int id) {
		return studentDAO.get(id);
	}

	@Transactional
	@Override
	public void save(Students students) {
		studentDAO.save(students);
	}

	@Transactional
	@Override
	public void delete(int id) {
		studentDAO.delete(id);
	}

}
