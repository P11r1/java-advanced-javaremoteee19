package org.sda.model;

//MULTI-LEVEL INHERITANCE
public class PrivatePassenger extends Passeneger {
    private boolean isPrivate;
    private String personalIDCode;

    public PrivatePassenger(PaymentType paymentType, String destinationAddress) {
        super(paymentType, destinationAddress);
    }

    public boolean isPrivate() {
        return isPrivate;
    }

    public void setPrivate(boolean aPrivate) {
        isPrivate = aPrivate;
    }

    public String getPersonalIDCode() {
        return personalIDCode;
    }

    public void setPersonalIDCode(String personalIDCode) {
        this.personalIDCode = personalIDCode;
    }
}
