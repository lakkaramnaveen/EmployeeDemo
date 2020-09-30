package com.cp.bootcamp.ctr;

import com.cp.bootcamp.bean.Employee;

public class EmployeeOperations {
	Employee arr[] = new Employee[100];
	static int index = 0;
	
	public boolean addEmployee(Employee e)
	{
		arr[index++] = e;
		return true;
	}
	
	public Employee getEmployeeById(int id)
	{
		Employee e = null;
		for (int i = 0; i < index; i++) {
			if(arr[i].getCode() == id)
			{
				return arr[i];
			}
		}
		return e;
	}
	
	public Employee[] getAllEmployess()
	{
		return arr;
	}
	
	public Employee updateEmployeeById(Employee e)
	{
		for (int i = 0; i < index; i++) {
			if(arr[i].getProject().equals(e.getProject()))
			{
				int updatedSal = arr[i].getSalary();
				updatedSal= (int)(updatedSal + (updatedSal*0.1));
				arr[i].setSalary(updatedSal);
				return arr[i];
			}
		}
		return null;
	}

}
