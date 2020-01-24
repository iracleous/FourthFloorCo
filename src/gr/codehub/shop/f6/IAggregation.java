package gr.codehub.shop.f6;

import java.math.BigDecimal;

public interface IAggregation {
    int count();
    BigDecimal sum();
    BigDecimal average();
    BigDecimal min();
    BigDecimal max();

}
