package com.gl.empmgmt.dao;


import org.springframework.data.jpa.repository.JpaRepository;

import com.gl.empmgmt.model.Employee;

public interface EmplyoeeDao extends JpaRepository<Employee, Integer> {

}
