
package com.nexus.backend.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.nexus.backend.entity.FinancialPlan;
import com.nexus.backend.repository.FinancialPlanRepository;

@Service
public class FinancialPlanService {

    private final FinancialPlanRepository financialPlanRepository;

    public FinancialPlanService(FinancialPlanRepository financialPlanRepository) {
        this.financialPlanRepository = financialPlanRepository;
    }

    public FinancialPlan saveFinancialPlan(FinancialPlan financialPlan) {
        return financialPlanRepository.save(financialPlan);
    }

    public List<FinancialPlan> getAllFinancialPlans() {
        return financialPlanRepository.findAll();
    }
}
