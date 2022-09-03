package com.tecsys.jvm.profiling.service;


import com.tecsys.jvm.profiling.domain.model.Product;
import com.tecsys.jvm.profiling.domain.model.Purchase;
import com.tecsys.jvm.profiling.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import com.tecsys.jvm.profiling.repository.PurchaseRepository;

import java.sql.SQLException;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


@Service
@RequiredArgsConstructor
public class PurchaseService {

    private final ProductRepository productRepository;
    private final PurchaseRepository purchaseRepository;

    public Set<String> getProductNamesForPurchases() {

        try {

            Set<String> productNames = new HashSet<>();
            List<Purchase> purchases = purchaseRepository.findAll();

            for (Purchase p : purchases) {
                Product product = productRepository.findProduct(p.getProduct());
                productNames.add(product.getName());
            }

            return productNames;

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return Set.of();
    }

}