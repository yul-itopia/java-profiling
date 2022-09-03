package com.tecsys.jvm.profiling.repository;


import com.tecsys.jvm.profiling.domain.Purchase;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PurchaseRepository extends JpaRepository<Purchase, Integer> {
}