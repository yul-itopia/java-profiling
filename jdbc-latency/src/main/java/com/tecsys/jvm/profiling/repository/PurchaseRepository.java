package com.tecsys.jvm.profiling.repository;


import com.tecsys.jvm.profiling.domain.model.Purchase;
import com.tecsys.jvm.profiling.repository.mapper.PurchaseRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public class PurchaseRepository {

    private final JdbcTemplate jdbcTemplate;

    public PurchaseRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Purchase> findAll() {
        String sql = "SELECT * FROM purchase";
        return jdbcTemplate.query(sql, new PurchaseRowMapper());
    }

}