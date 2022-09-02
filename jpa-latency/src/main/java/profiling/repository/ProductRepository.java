package profiling.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import profiling.domain.Product;


@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
}