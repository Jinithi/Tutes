package Tut4;

public class Passport extends Card {
    private String birthLocation;
    private int expirationYear;

    public Passport(String n,String birthLoc, int expYear){
        super(n);
        birthLocation=birthLoc;
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

    @Override
    public String format() {
        String name=super.format();
        return name + ", Birth location: " + birthLocation + ", Expires: " + expirationYear;
    }
}
