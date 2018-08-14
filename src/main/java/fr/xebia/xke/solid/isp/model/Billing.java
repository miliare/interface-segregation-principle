package fr.xebia.xke.solid.isp.model;

import java.math.BigDecimal;

public interface Billing {

    String getBillingAddress();

    void setBillingAddress(String facturationAddress);

    BigDecimal getUnitPrice();

    void setUnitPrice(BigDecimal prixUnitaire);

    int getQuantity();

    void setQuantity(int quantity);
}
