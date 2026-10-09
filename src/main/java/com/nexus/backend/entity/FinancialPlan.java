
package com.nexus.backend.entity;

import java.math.BigDecimal;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "financial_plans")
public class FinancialPlan {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long userId;

    private BigDecimal salary;
    private BigDecimal rent;
    private BigDecimal food;
    private BigDecimal travel;
    private BigDecimal bills;
    private BigDecimal shopping;
    private BigDecimal emi;

    private String goalName;
    private BigDecimal goalAmount;
    private Integer goalMonths;

    private String savingMethod;

    public FinancialPlan() {
    }

    public Long getId() {
        return id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    public BigDecimal getRent() {
        return rent;
    }

    public void setRent(BigDecimal rent) {
        this.rent = rent;
    }

    public BigDecimal getFood() {
        return food;
    }

    public void setFood(BigDecimal food) {
        this.food = food;
    }

    public BigDecimal getTravel() {
        return travel;
    }

    public void setTravel(BigDecimal travel) {
        this.travel = travel;
    }

    public BigDecimal getBills() {
        return bills;
    }

    public void setBills(BigDecimal bills) {
        this.bills = bills;
    }

    public BigDecimal getShopping() {
        return shopping;
    }

    public void setShopping(BigDecimal shopping) {
        this.shopping = shopping;
    }

    public BigDecimal getEmi() {
        return emi;
    }

    public void setEmi(BigDecimal emi) {
        this.emi = emi;
    }

    public String getGoalName() {
        return goalName;
    }

    public void setGoalName(String goalName) {
        this.goalName = goalName;
    }

    public BigDecimal getGoalAmount() {
        return goalAmount;
    }

    public void setGoalAmount(BigDecimal goalAmount) {
        this.goalAmount = goalAmount;
    }

    public Integer getGoalMonths() {
        return goalMonths;
    }

    public void setGoalMonths(Integer goalMonths) {
        this.goalMonths = goalMonths;
    }

    public String getSavingMethod() {
        return savingMethod;
    }

    public void setSavingMethod(String savingMethod) {
        this.savingMethod = savingMethod;
    }
}
