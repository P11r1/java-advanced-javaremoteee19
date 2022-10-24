package org.sda.model;




//Inheritance
//ONE LEVEL INHERITANCE
public class Passeneger extends Person{
    private String paymentType;
    private String destinationAddress;

    public Passeneger(String paymentType, String destinationAddress) {
        this.paymentType = paymentType;
        this.destinationAddress = destinationAddress;
    }

    public Passeneger(Long id, String address, String paymentType, String destinationAddress) {
        super(id, address); // Super refers to parent class PERSON
        this.paymentType = paymentType;
        this.destinationAddress = destinationAddress;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public String getDestinationAddress() {
        return destinationAddress;
    }

    public void setDestinationAddress(String destinationAddress) {
        this.destinationAddress = destinationAddress;
    }


}
