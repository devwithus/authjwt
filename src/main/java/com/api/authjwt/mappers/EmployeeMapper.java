package com.api.authjwt.mappers;

import com.api.authjwt.dtos.EmployeeDTO;
import com.api.authjwt.entities.Employee;

public class EmployeeMapper {
	
	public static EmployeeDTO entityToDTO(Employee emp) {
		
		EmployeeDTO empdto = new EmployeeDTO();
		empdto.setFirstNam(emp.getFirstNam());
		empdto.setLastName(emp.getLastName());
		empdto.setFunction(emp.getFunction());
		empdto.setSalary(emp.getSalary());
		
		return empdto;
		
	}
	
	public static Employee dtoToEntity(EmployeeDTO empdto) {
		
		Employee emp = new Employee();
		emp.setFirstNam(empdto.getFirstNam());
		emp.setLastName(empdto.getLastName());
		emp.setFunction(empdto.getFunction());
		emp.setSalary(empdto.getSalary());
		
		return emp;
	}

}
