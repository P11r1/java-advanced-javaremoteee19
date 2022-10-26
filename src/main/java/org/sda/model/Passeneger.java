package org.sda.model;




//Inheritance
//ONE LEVEL INHERITANCE
public class Passeneger extends Person{
    private PaymentType paymentType;
    private String destinationAddress;
    public Passeneger() {

    }

    public Passeneger(PaymentType paymentType, String destinationAddress) {
        this.paymentType = paymentType;
        this.destinationAddress = destinationAddress;
    }

    public Passeneger(Long id, String address, PaymentType paymentType, String destinationAddress) {
        super(id, address); // Super refers to parent class PERSON
        this.paymentType = paymentType;
        this.destinationAddress = destinationAddress;
    }

    public PaymentType getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(PaymentType paymentType) {
        this.paymentType = paymentType;
    }

    public String getDestinationAddress() {
        return destinationAddress;
    }

    public void setDestinationAddress(String destinationAddress) {
        this.destinationAddress = destinationAddress;
    }


    @Override
    public String getEmail() {
        return "sda@gmail.com";
    }

    public String getAddresses() {
        return "Source Address: " + super.getAddress() + ", Destination address: " + getDestinationAddress();
    }

    @Override
    public String toString() {
        return "Passeneger{" +
                "paymentType='" + paymentType + '\'' +
                ", destinationAddress='" + destinationAddress + '\'' +
                '}';
    }

    //PROTECTED
    public boolean getHiddenAlive() {
        return super.isAlive();
    }
}
