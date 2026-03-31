package model;
import java.util.Map;
import java.util.HashMap;
// model class will be the plain java class where the properties of object i.e. real-world
// will be presented and also, add the business logic 
// we will follow encapsulation concept to present model
public class EmployeeModel {
	// private attributes
	// note: not necessary to define all private
	private int emp_no;
	private String full_name;
	private String email;
	private String designation;
	private String department;
	private Map<Integer, EmployeeModel> data;
	
	// public getter and setter methods for private attributes
	public int getEmpNo() { return this.emp_no; }
	public void setEmpNo(int param_emp_no) { this.emp_no = param_emp_no; }
	
	public String getFullName() { return this.full_name; }
	public void setFullName(String param_name) { this.full_name = param_name;}
	
	public String getEmail() { return this.email; }
	public void setEmail(String param_email) { this.email = param_email; }
	
	public String getDesignation() { return this.designation; }
	public void setDesignation(String param_designation) { this.designation = param_designation; }
	
	public String getDepartment() { return this.department; }
	public void setDepartment(String param_department) { this.department = param_department; }
	
	public Map<Integer, EmployeeModel> getData(){ return this.data; }
	public void setData(Map<Integer, EmployeeModel> param_data) {this.data = param_data;}
}
