package fr.xebia.xke.solid.isp.metier;

import fr.xebia.xke.solid.isp.model.Billing;
import fr.xebia.xke.solid.isp.model.DematerializedOrder;
import fr.xebia.xke.solid.isp.model.MainOrder;
import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class BillingServiceTest {

    BillingService billingService;

    @Before
    public void setUp() {
        billingService = new BillingService();
    }

    @Test
    public void shouldChargeSNCF() {
        //Given
        Billing billingOrder = new MainOrder();
        billingOrder.setBillingAddress("SNCF");
        billingOrder.setUnitPrice(BigDecimal.valueOf(1));
        billingOrder.setQuantity(1);

        //When
        String actual = billingService.writeBill(billingOrder);

        //Then
        assertEquals("SNCF must pay 1 euros", actual);
    }

    @Test
    public void shouldChargeSFR() {
        //Given
        Billing order = new DematerializedOrder();
        order.setBillingAddress("SFR");
        order.setUnitPrice(BigDecimal.valueOf(666));

        //When
        String actual = billingService.writeBill(order);

        //Then
        assertEquals("SFR must pay 666 euros", actual);
    }


}