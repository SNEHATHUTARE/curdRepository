package com.softronix.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.softrnoix.entity.Employee;
import com.softronix.service.EmployeeService;
@Controller
public class EmployeeController {
	@Autowired
	EmployeeService empService;
	
@RequestMapping(value ="/welcome", method=RequestMethod.GET)
	public String welcome()
    {
		return "welcome";
		
	}
@RequestMapping(value ="/addform", method=RequestMethod.GET)
public String showAdd() {
	return "addform";
}

@RequestMapping(value ="/searchform", method=RequestMethod.GET)
public String showSearch() {
	return "searchform";
}


@RequestMapping(value ="/updateform", method=RequestMethod.GET)
public String showupdate() {
	return "updateform";
}

@RequestMapping(value ="/delete", method=RequestMethod.GET)
public String showDelete() {
	return "delete";
}
@RequestMapping(value ="/add", method=RequestMethod.POST)
public String add(@RequestParam String eid,@RequestParam String ename,@RequestParam String esal,@RequestParam String eaddr,ModelMap map)
{
	String status="";
	Employee emp=new Employee();
	emp.setEid(eid);
	emp.setEname(ename);
	emp.setEsal(esal);
	emp.setEaddr(eaddr);
	
	status=empService.addEmployee(emp);
	map.addAttribute("Operation","Employee Insertion");
	return status;
}
@RequestMapping(value="/search",method=RequestMethod.POST)
public String search(@RequestParam String eid,ModelMap map) 
{

	String status="";
	Employee emp=empService.searchEmployee(eid);
	if(emp==null)
	{
		status="notexisted";
		
	}
	else
	{
		map.addAttribute("emp",emp);
		status="employeeDetails";
		
	}
	return status;
}
@RequestMapping(value="/edit",method=RequestMethod.POST)
public String update(@RequestParam String eid,ModelMap map)
{
	String status="";
	Employee emp=empService.searchEmployee(eid);
	if(emp==null)
	{
		status="notexisted";
	}else 
	{
		map.addAttribute("emp",emp);
		
		status="editform";
		
	}
	return status;
}
@RequestMapping(value="/update",method=RequestMethod.POST)
public String edit(@RequestParam String eid,@RequestParam String ename,@RequestParam String esal,@RequestParam String eaddr,ModelMap map)
{
	String status="";
	Employee emp=new Employee();
	emp.setEid(eid);
	emp.setEname(ename);
	emp.setEsal(esal);
	emp.setEaddr(eaddr);
	
	status=empService.updateEmployee(emp);
	map.addAttribute("Operation","Employee Updation ");
	return status;
}
@RequestMapping(value="/delete",method=RequestMethod.POST)
public String delete(@RequestParam String eid,ModelMap map)
{
	String status="";
		map.addAttribute("Operation","Employee Deletion");
		status=empService.deleteEmployee(eid);
	return status;
}
}
