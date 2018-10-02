package com.pathan.springboot.employee;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
@Autowired
	public EmployeeService employeeservice;

@RequestMapping("/employees")
	public List<Employee> getEmployees()
	{
		return employeeservice.getEmployees();
		
	}
@RequestMapping("employees/{id}")
public Employee getEmployee(@PathVariable String id)
{
	return employeeservice.getEmployee(id);
}
@RequestMapping(method=RequestMethod.DELETE, value="employees/{id}")
public void deleteEmployee(@PathVariable String id)
{
	employeeservice.deleteEmployee(id);
}

@RequestMapping(method=RequestMethod.PUT, value="/employees/{id}")
public void updateEmployee(@PathVariable String id, @RequestBody Employee employee) {
    employeeservice.updateEmployee(id, employee);
}
@RequestMapping(method=RequestMethod.POST, value="/employees")
public void addEmployee(@RequestBody Employee employee)
{
	employeeservice.addEmployee(employee);
}
}
