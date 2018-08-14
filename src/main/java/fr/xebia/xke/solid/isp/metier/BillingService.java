package fr.xebia.xke.solid.isp.metier;


import fr.xebia.xke.solid.isp.model.Billing;

import java.math.BigDecimal;

/**
 * Created by sbuisson on 14/06/2015.
 */
public class BillingService {

    public String writeBill(Billing order) {
        BigDecimal amount = order.getUnitPrice().multiply(BigDecimal.valueOf(order.getQuantity()));
        return order.getBillingAddress() + " must pay " + amount + " euros";
    }
}
