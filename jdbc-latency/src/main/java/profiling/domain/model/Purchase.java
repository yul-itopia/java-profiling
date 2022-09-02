package profiling.domain.model;


import lombok.*;

import java.math.BigDecimal;


@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
public class Purchase {

    private int id;
    private int product;
    private BigDecimal price;

}