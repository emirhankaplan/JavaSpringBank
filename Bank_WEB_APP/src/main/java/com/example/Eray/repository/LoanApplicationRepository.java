package com.example.Emirhan.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.Emirhan.model.LoanApplication;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LoanApplicationRepository extends JpaRepository<LoanApplication, Long> {

    List<LoanApplication> findByUserId(Long userId);

    List<LoanApplication> findByStatus(String status);

}
