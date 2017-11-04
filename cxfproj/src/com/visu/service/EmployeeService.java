package com.visu.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import com.visu.pojo.Employee;

@Path("/service")
@Produces("application/xml")
public class EmployeeService {

	@GET
	@Path("/emp")
	public Employee getEmployee() {
		Employee emp = new Employee();
		emp.setId("1");
		emp.setName("visu");
		return emp;
	}
}
