package profiling.service;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import profiling.domain.model.Product;
import profiling.domain.model.Purchase;
import profiling.repository.ProductRepository;
import profiling.repository.PurchaseRepository;

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