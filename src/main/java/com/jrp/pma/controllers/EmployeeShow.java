package com.jrp.pma.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jrp.pma.dao.EmployeeRepository;
import com.jrp.pma.entities.Employee;

@Controller
@RequestMapping("/employeeshow")
public class EmployeeShow {
	
	@Autowired
	EmployeeRepository emprepo;
	
	@GetMapping("/show")
	public String displayEmployee(Model model) {
		List<Employee> emlpoyeelist=emprepo.findAll();
		model.addAttribute("empList",emlpoyeelist);
		return "employee";
		
	}

}
