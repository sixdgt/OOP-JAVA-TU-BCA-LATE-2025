package controller;

import java.util.Map;
import model.EmployeeModel;
import java.util.HashMap;

public class EmployeeController {
	EmployeeModel em;
	
	public EmployeeController() {
		em = new EmployeeModel();
	}
	
	public boolean recordEmployee(Map<String, String> user_data) {
		Map<Integer, EmployeeModel> db_data = new HashMap<>();
		// preparing data from view
		em.setEmpNo(Integer.parseInt(user_data.get("emp_no")));
		em.setFullName(user_data.get("full_name"));
		em.setEmail(user_data.get("email"));
		em.setDesignation(user_data.get("designation"));
		em.setDepartment(user_data.get("department"));
		// preparing data according to our model data holder variable
		db_data.put(em.getEmpNo(), em);
		em.setData(db_data);
		return true;
	}
	
	public void showEmployee() {
		Map<Integer, EmployeeModel> db_data = em.getData();
		// instead of creating variable we can directly access data
		// for example:
		// for(Map.Entry<Integer, EmployeeModel> data: em.getData().entrySet()) {}
		for(Map.Entry<Integer, EmployeeModel> data: db_data.entrySet()) {
			System.out.println("Employee No: " + data.getValue().getEmpNo());
			System.out.println("Full Name: " + data.getValue().getFullName());
			System.out.println("Email: " + data.getValue().getEmail());
			System.out.println("Designation: " + data.getValue().getDesignation());
			System.out.println("Department: " + data.getValue().getDepartment());
		}
	}
}
