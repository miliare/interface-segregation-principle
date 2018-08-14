package fr.xebia.xke.solid.isp.model;

import java.math.BigDecimal;

public interface Billing {

    String getBillingAddress();

    void setBillingAddress(String billingAddress);

    BigDecimal getUnitPrice();

    void setUnitPrice(BigDecimal unitPrice);

    int getQuantity();

    void setQuantity(int quantity);
}
