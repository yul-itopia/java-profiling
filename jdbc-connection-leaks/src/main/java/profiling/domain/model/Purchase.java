package profiling.domain.model;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;


@Getter
@Setter
@NoArgsConstructor
public class Purchase {

    private int id;
    private int product;
    private BigDecimal price;

}
