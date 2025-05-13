package com.microservice.quarkus.application.ports.api;

import java.util.List;

import com.microservice.quarkus.application.outbound.PostDTO;
import com.microservice.quarkus.domain.model.loan.Loan;

public interface LoanAPIService {

    Loan getLoan(String id);

    List<Loan> getAllLoans();
    
    void deleteLoan(String id);

    void create(Loan prop);

    void update(Loan prop);

    List<PostDTO> fetchExternalPosts();
}
