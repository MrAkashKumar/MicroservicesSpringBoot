package com.akash.employee.responseHandler;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Company {

    private Long companyId;
    private String companyName;
    private String companyLocation;
    private String companyCode;
}
