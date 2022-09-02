package profiling.controller;


import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import profiling.service.PurchaseService;

import java.util.Set;


/*
 * curl -s -w 'Total: %{time_total}s\n'  http://127.0.0.1:8080/api/products
 */
@RestController
@RequiredArgsConstructor
public class PurchaseController {

    private final PurchaseService purchaseService;

    @GetMapping("/api/products")
    public Set<String> findPurchasedProductNames() {
        return purchaseService.getProductNamesForPurchases();
    }

}