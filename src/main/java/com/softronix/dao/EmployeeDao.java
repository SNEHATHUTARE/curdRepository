package com.softronix.dao;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.softrnoix.entity.Employee;

public interface EmployeeDao {

	public String add(Employee emp);
	public Employee search(String eid);
	public String update(Employee emp);
	public String delete(String eid);
	

}
