package in.crudapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.crudapi.model.Students;
import in.crudapi.service.StudentsService;

/**
 * 
 * @author 
 * Controller Class 
 * All APIS which all are we calling from 
 * postman it will come and and API end Points are hear
 *
 */

@RestController
@RequestMapping("/api")
public class StudentsController {

	@Autowired
	private StudentsService studentsService;
	
	//Adding a new Data
	@PostMapping("/employee")
	public Students save(@RequestBody Students employeeObj) {
		studentsService.save(employeeObj);
		return employeeObj;
	}
	
	
	//Get All the students
	@GetMapping("/employee")
	public List<Students> get(){
		return studentsService.get();
	}
	
	//Get All the students with id
	@GetMapping("/employee/{id}")
	public Students get(@PathVariable int id) {
		Students employeeObj = studentsService.get(id);
		if(employeeObj == null) {
			throw new RuntimeException("Students not found for the Id:"+id);
		}
		return employeeObj;
	}
	
	//Update  students
	@PutMapping("/employee")
	public Students update(@RequestBody Students employeeObj) {
		studentsService.save(employeeObj);
		return employeeObj;
	}
	
	//Delete  students with id
	@DeleteMapping("/employee/{id}")
	public String delete(@PathVariable int id) {
		studentsService.delete(id);
		return "Students has been deleted with id:"+id;
	}
}
