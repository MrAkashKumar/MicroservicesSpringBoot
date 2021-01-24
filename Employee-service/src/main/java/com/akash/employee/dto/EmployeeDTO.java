package com.akash.employee.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeDTO {

    private String employeeName;
    private String email;
    private String employeeCode;
    private Long companyId;
}
