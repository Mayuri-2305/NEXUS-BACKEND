
package com.nexus.backend.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nexus.backend.entity.FinancialPlan;
import com.nexus.backend.service.FinancialPlanService;

@RestController
@RequestMapping("/api/financial-plans")
@CrossOrigin(origins = "http://localhost:5173")
public class FinancialPlanController {

    private final FinancialPlanService financialPlanService;

    public FinancialPlanController(FinancialPlanService financialPlanService) {
        this.financialPlanService = financialPlanService;
    }

    @PostMapping
    public FinancialPlan saveFinancialPlan(@RequestBody FinancialPlan financialPlan) {
        return financialPlanService.saveFinancialPlan(financialPlan);
    }

    @GetMapping
    public List<FinancialPlan> getAllFinancialPlans() {
        return financialPlanService.getAllFinancialPlans();
    }
}
