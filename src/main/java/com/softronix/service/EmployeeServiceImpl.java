package com.softronix.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.softrnoix.entity.Employee;
import com.softronix.dao.EmployeeDao;
@Service
public class EmployeeServiceImpl implements EmployeeService {
@Autowired

EmployeeDao empDao;



@Override
public String addEmployee(Employee emp) {
	
String status =empDao.add(emp);
return status;

}
@Override
public Employee searchEmployee(String eid) {

	Employee emp=empDao.search(eid);
			return emp;
}
@Transactional
@Override
public String updateEmployee(Employee emp) {
	String status =empDao.update(emp);
			
			return status;
		}

	
@Override
public String deleteEmployee(String eid) {
String status=empDao.delete(eid);
return status;

}}
