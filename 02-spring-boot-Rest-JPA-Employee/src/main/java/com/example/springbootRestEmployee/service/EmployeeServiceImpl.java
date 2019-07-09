package com.example.springbootRestEmployee.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springbootRestEmployee.dao.EmployeeDao;
import com.example.springbootRestEmployee.entity.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	private EmployeeDao dao;

	@Override
	@Transactional
	public Employee saveEmployee(Employee employee) {
		
		return dao.saveEmployee(employee);
	}

	@Override
	public Employee getEmployeeById(int id) {
		
		return dao.getEmployeeById(id);
	}

	@Override
	@Transactional
	public List<Employee> getAllEmployee() {
		
		return dao.getAllEmployee();
	}

	@Override
	@Transactional
	public void deleteEmployee(int id) {
		 dao.deleteEmployee(id);

	}
};
