package com.gl.empmgmt.service;



import java.util.List;

import org.springframework.stereotype.Service;

import com.gl.empmgmt.dao.EmplyoeeDao;
import com.gl.empmgmt.model.Employee;
@Service
public class EmployeeServiceImpl implements EmployeeService {
	EmplyoeeDao empDao;


	public EmployeeServiceImpl(EmplyoeeDao empDao) {
		super();
		this.empDao = empDao;
	}


	@Override
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return empDao.findAll();
	}


	@Override
	public Employee saveEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return empDao.save(employee);
	}


	@Override
	public Employee getEmployeeById(int id) {
		// TODO Auto-generated method stub
		return empDao.findById(id).get();
	}


	@Override
	public Employee updateEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return empDao.save(employee);
	}


	@Override
	public void deleteEmployeeById(int id) {
		empDao.deleteById(id);

	}



}
