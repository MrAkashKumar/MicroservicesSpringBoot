package com.akash.employee.controller;

import com.akash.employee.dto.EmployeeDTO;
import com.akash.employee.entity.Employee;
import com.akash.employee.responseHandler.ResponseTemplateHandler;
import com.akash.employee.service.EmployeeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/emp")
@Slf4j
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping(value = "/api/employee")
    public Employee createEmployee(@RequestBody EmployeeDTO employeeDTO){
        log.info("Inside method :: createEmployee :: EmployeeController ");
        return employeeService.createEmployee(employeeDTO);
    }

    @GetMapping(value = "/api/employee/{id}")
    public ResponseTemplateHandler getEmployeeWithDepartment(@PathVariable("id") Long employeeId){
        log.info("Inside method :: getEmployeeWithDepartment :: EmployeeController ");
        return employeeService.getEmployeeWithDepartment(employeeId);
    }
}
