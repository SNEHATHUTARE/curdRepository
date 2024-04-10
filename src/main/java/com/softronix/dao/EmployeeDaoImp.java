package com.softronix.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.softrnoix.entity.Employee;
@Repository
public   class EmployeeDaoImp implements EmployeeDao {
@Autowired
	JdbcTemplate jdbcTemplate;
@Override
	public String add(Employee emp) {
		String status="";
		Employee employee=search(emp.getEid());
		if(employee==null)
		{
			int rowCount=jdbcTemplate.update("insert into Employee values('"+emp.getEid()+"','"+emp.getEname()+"','"+emp.getEsal()+"','"+emp.getEaddr()+"')");
			if(rowCount==1) {
				status="success";
			}
		
		
		else
		{
			status="failure";
		}
		}else {
			status="existed";
		}
		return status;
	}

	@Override
	public Employee search(String eid)
	{
		Employee emp=null;
		List<Employee>employeeList=jdbcTemplate.query("select * from Employee where EID='"+eid+"'",(rs,rowNum)->
		{Employee emp1=new Employee();
		emp1.setEid(rs.getString("EID"));
		emp1.setEname(rs.getString("ENAME"));
		emp1.setEsal(rs.getString("ESAL"));
		emp1.setEaddr(rs.getString("EADDR"));
		return emp1;
		});
	
		if(employeeList.isEmpty()==true)
		{
			emp=null;
			
		}
		else
		{
			emp=employeeList.get(0);
		}
		return emp;
	}

	@Override
	public String update(Employee emp)
	{
		String status="";
		int rowCount=jdbcTemplate.update("update employee set ENAME='"+emp.getEname()+"',ESAL='"+emp.getEsal()+"',EADDR='"+emp.getEaddr()+"'where EID='"+emp.getEid()+"'");
		if(rowCount==1)
		{
			status="success";
			
		}
		else 
		{
			status="failure";
			
		}
		
		return status;
	}

	@Override
	public String delete(String eid)
	{
		String status="";
		Employee emp=search(eid);
		if(emp==null) {
			status="notexisted";
			
		}else 
		{
			int rowCount=jdbcTemplate.update("delete from employee where EID='"+eid+"'");
			if(rowCount==1)
			{
				status="success";
				
			}
			else 
			{
				status="failure";
				
			}
		}
		return status;
	}

	

	

}
