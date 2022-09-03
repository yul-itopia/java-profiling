package com.tecsys.jvm.profiling.repository;


import com.tecsys.jvm.profiling.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
}