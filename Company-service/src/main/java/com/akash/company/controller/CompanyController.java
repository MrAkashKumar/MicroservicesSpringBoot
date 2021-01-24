package com.akash.company.controller;

import com.akash.company.dto.CompanyDTO;
import com.akash.company.entity.Company;
import com.akash.company.service.CompanyService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/com")
@Slf4j
public class CompanyController {

    @Autowired
    private CompanyService companyService;

    @PostMapping(value = "/api/company")
    public Company createCompany(@RequestBody CompanyDTO companyDTO){
        log.info("Inside method :: createCompany :: CompanyController ");
        return companyService.createCompany(companyDTO);
    }

    @GetMapping(value = "/api/company/{id}")
    public Company getCompanyById(@PathVariable("id") Long companyId){
        log.info("Inside method :: getCompanyById :: CompanyController ");
        return companyService.getCompanyById(companyId);
    }
}
