package Tut4;

public class CardTester {
    public static void main(String[] args) {
        DriverLicense D1 = new DriverLicense("Kamal",2018);
        System.out.println(D1.getName()+"'s License is expired : "+D1.isExpired());

        DriverLicense D2 = new DriverLicense("Kane",2023);
        System.out.println(D2.getName()+"'s License is expired : "+D2.isExpired());

        Passport P1=new Passport("Kamal","SriLanka",2019);

        System.out.println(P1.format());
    }
}
