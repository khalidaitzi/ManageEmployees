package com.angular.firstApp.EmployeesManager.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.angular.firstApp.EmployeesManager.Model.Employee;

import java.util.Optional;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    void deleteEmployeeById(Long id);

    Optional<Employee> findEmployeeById(Long id);
}