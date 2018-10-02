package com.pathan.springboot.employee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

List<Employee> employees=new ArrayList<>(Arrays.asList(
		
		new Employee("101", "pathan", "javadeveloper"),
		new Employee("102","Narendra", "Bhoomi Developer"),
		new Employee("103","Venkatesh", "Webmethods Developer"),
		new Employee("104","Kalesha", "Webmethods Developer")
		)) ;

public List<Employee> getEmployees()
{
	return employees;
}

public Employee getEmployee(String id)
{
	return employees.stream().filter(e -> e.getEid().equals(id)).findFirst().get();
}

public void deleteEmployee(String id)
{
	employees.removeIf(e -> e.getEid().equals(id));
}

public void updateEmployee(String id, Employee employee)
{
	for(int i=0;i<employees.size();i++)
	{
		Employee e=employees.get(i);
		if(e.getEid().equals(id))
		{
			employees.set(i, employee);
			return;
		}
	}
}

public void addEmployee(Employee employee) {
	// TODO Auto-generated method stub
	employees.add(employee);
}
}
