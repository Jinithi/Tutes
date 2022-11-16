package Tut4;

public class DriverLicense extends Card {
    private int expirationYear;

    public DriverLicense(String n, int expYear){
        super(n);
        expirationYear=expYear;
    }

    @Override
    public boolean isExpired() {
        int this_year=2022;

        if (expirationYear < this_year)
            return true;
        else
            return false;
    }
}
