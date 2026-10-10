
package com.nexus.backend.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nexus.backend.entity.FinancialPlan;

public interface FinancialPlanRepository extends JpaRepository<FinancialPlan, Long> {

    Optional<FinancialPlan> findByUserId(Long userId);

    List<FinancialPlan> findAllByUserId(Long userId);
}
