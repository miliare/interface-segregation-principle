package fr.xebia.xke.solid.isp.model;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.math.BigDecimal;

/**
 * Created by sbuisson on 19/06/2015.
 */
public class DematerializedOrder implements Billing {

    private String billingAddress;
    private BigDecimal unitPrice;

    public int getQuantity() {
        return 1;
    }

    public void setQuantity(int quantity) {
        throw new NotImplementedException();
    }

    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }

    public String getBillingAddress() {
        return billingAddress;
    }

    public void setBillingAddress(String billingAddress) {
        this.billingAddress = billingAddress;
    }
}
