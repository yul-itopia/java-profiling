package profiling.repository.mapper;


import org.springframework.jdbc.core.RowMapper;
import profiling.domain.model.Purchase;

import java.sql.ResultSet;
import java.sql.SQLException;


public class PurchaseRowMapper implements RowMapper<Purchase> {

    @Override
    public Purchase mapRow(ResultSet rs, int rowNum) throws SQLException {

        Purchase p = new Purchase();

        p.setId(rs.getInt("id"));
        p.setProduct(rs.getInt("product"));
        p.setPrice(rs.getBigDecimal("price"));

        return p;
    }

}