package in.crudapi.service;

import java.util.List;

import in.crudapi.model.Students;

public interface StudentsService {
	
	List<Students> get();
	
	Students get(int id);
	
	void save(Students students);
	
	void delete(int id); 
}
