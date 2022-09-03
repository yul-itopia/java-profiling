package com.tecsys.jvm.profiling.service;


import com.tecsys.jvm.profiling.domain.Product;
import com.tecsys.jvm.profiling.domain.Purchase;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import com.tecsys.jvm.profiling.repository.ProductRepository;
import com.tecsys.jvm.profiling.repository.PurchaseRepository;

import java.util.HashSet;
import java.util.List;
import java.util.Set;


@Service
@RequiredArgsConstructor
public class PurchaseService {

    private final ProductRepository productRepository;
    private final PurchaseRepository purchaseRepository;

    public Set<String> getProductNamesForPurchases() {

        Set<String> productNames = new HashSet<>();

        List<Purchase> purchases = purchaseRepository.findAll();

        for (Purchase p : purchases) {
            Product product = productRepository.findById(p.getProduct())
                    .orElse(null);
            productNames.add(product.getName());
        }

        return productNames;
    }

}
