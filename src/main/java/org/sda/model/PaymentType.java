package org.sda.model;

/**
 * Enum examples
 * List of PaymentType
 *
 * @author Marko
 */
public enum PaymentType {
    CARD(1),
    CASH(2),
    BANK_TRANSFER(3),
    MOBILE_BANKING(4),
    BANK_LINK(5);

    private int value;


    PaymentType(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
