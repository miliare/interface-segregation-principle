package fr.xebia.xke.solid.isp.metier;


import fr.xebia.xke.solid.isp.model.Deliverable;

/**
 * Created by sbuisson on 14/06/2015.
 */
class DeliveryService {

    String processOrder(Deliverable order) {
        return "send " + order.getQuantity() + " " + order.getReferenceItem() + " to " + order.getDeliveryAddress();
    }
}
