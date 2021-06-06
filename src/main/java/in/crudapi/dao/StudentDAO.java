package in.crudapi.dao;

import java.util.List;

import in.crudapi.model.Students;

public interface StudentDAO {
	
	List<Students> get();
	
	Students get(int id);
	
	void save(Students students);
	
	void delete(int id); 
}
