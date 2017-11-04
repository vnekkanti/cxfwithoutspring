package com.visu.service;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;


import com.visu.pojo.Department;


@Path("/deptservice")
@Produces("application/xml")
public class DepartmentService {

	@GET
	@Path("/dept")
	public Department getDepartment() {
		Department dept = new Department();
		dept.setId("1");
		dept.setName("BCM3");
		return dept;
	}
}
