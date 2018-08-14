package fr.xebia.xke.solid.isp.model;

public interface Deliverable {

    String getDeliveryAddress();

    void setDeliveryAddress(String deliveryAddress);

    String getReferenceItem();

    void setReferenceItem(String referenceItem);

    int getQuantity();

    void setQuantity(int quantity);

}
