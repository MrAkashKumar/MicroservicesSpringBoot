package com.akash.company.service;

import com.akash.company.dto.CompanyDTO;
import com.akash.company.entity.Company;
import com.akash.company.repository.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CompanyService {

    @Autowired
    private CompanyRepository companyRepository;

    public Company createCompany(CompanyDTO companyDTO) {

        System.out.println("Inside :: createCompany :: CompanyService ");
        Company company = new Company();
        company.setCompanyName(companyDTO.getCompanyName());
        company.setCompanyLocation(companyDTO.getCompanyLocation());
        company.setCompanyCode(companyDTO.getCompanyCode());
        return companyRepository.save(company);
    }

    public Company getCompanyById(Long companyId) {
        return companyRepository.findByCompanyId(companyId);
    }
}
