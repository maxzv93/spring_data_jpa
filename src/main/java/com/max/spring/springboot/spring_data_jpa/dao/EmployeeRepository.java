package com.max.spring.springboot.spring_data_jpa.dao;

import com.max.spring.springboot.spring_data_jpa.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author ZuevMYu
 * @since 17.07.2024
 */
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    public List<Employee> findAllByName(String name);

}
