package com.akash.employee.responseHandler;

import com.akash.employee.entity.Employee;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseTemplateHandler {

    private Employee employee;
    private Company company;

}
