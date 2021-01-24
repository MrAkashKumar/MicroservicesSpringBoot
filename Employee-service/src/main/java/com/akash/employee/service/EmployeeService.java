package com.akash.employee.service;

import com.akash.employee.dto.EmployeeDTO;
import com.akash.employee.entity.Employee;
import com.akash.employee.repository.EmployeeRepository;
import com.akash.employee.responseHandler.Company;
import com.akash.employee.responseHandler.ResponseTemplateHandler;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@Slf4j
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private RestTemplate restTemplate;

    public Employee createEmployee(EmployeeDTO employeeDTO) {
        System.out.println("Inside :: createEmployee :: EmployeeService ");
        log.info("Inside method :: createEmployee :: EmployeeService ");
        Employee employee = new Employee();
        employee.setEmployeeName(employeeDTO.getEmployeeName());
        employee.setEmail(employeeDTO.getEmail());
        employee.setEmployeeCode(employeeDTO.getEmployeeCode());
        employee.setCompanyId(employeeDTO.getCompanyId());
        return employeeRepository.save(employee);
    }

    public ResponseTemplateHandler getEmployeeWithDepartment(Long employeeId) {
        log.info("Inside method :: getEmployeeWithDepartment :: EmployeeService ");
        ResponseTemplateHandler responseHandler = new ResponseTemplateHandler();
        Employee employee = employeeRepository.findByEmployeeId(employeeId);
        /*System.out.println(employee);*/
        Company company = restTemplate.getForObject("http://localhost:9001/com/api/company/"+employee.getCompanyId(), Company.class);

        /*Company company = restTemplate.getForObject("http://COMPANY-SERVICE/api/company/"+employee.getCompanyId(), Company.class);*/

        /*System.out.println(company);*/

        responseHandler.setCompany(company);
        responseHandler.setEmployee(employee);

        return responseHandler;
    }
}
