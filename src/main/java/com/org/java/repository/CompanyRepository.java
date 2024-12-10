package com.org.java.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.org.java.entity.Company;
@Repository
public interface CompanyRepository extends JpaRepository<Company, Integer>{

}
