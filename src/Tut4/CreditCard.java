package Tut4;

public class CreditCard extends Card {
    private int pinNumber;
    private int number;

    @Override
    public boolean isExpired() {
        return false;
    }

    public CreditCard(String n, int pin, int num)
    {
        super(n);
        pinNumber = pin;
        number = num;
    }
}
