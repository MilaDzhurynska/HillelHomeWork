package hw2;
public class Main {
    public static void main(String[] args) {

        String order = "Order No ";
        byte orderNumber1 = 1;
        System.out.print(order + orderNumber1 + " ");

        String client = "Client: ";
        String clientNameAlice = "Alice";
        System.out.println(client + clientNameAlice + ".");

        String product = "Product: ";
        String productNameSmartphone = "smartphone";
        System.out.println(product + productNameSmartphone + ",");

        String price = "Price EUR ";
        float priceSmartphone = 305.99f;
        System.out.println(price + priceSmartphone + ".");

        String adress = "Adress: ";
        String adressAlice = "Moon Street, 10";
        System.out.println(adress + adressAlice + ".");



        byte  orderNumber2 = 2;
        System.out.print(order + orderNumber2 + " ");

        String clientNameTom = "Tom";
        System.out.println(client + clientNameTom + ".");

        String productNameLaptop = "laptop";
        System.out.println(product + productNameLaptop + ",");

        float priceLaptop = 570.95f;
        System.out.println(price + priceLaptop + ".");

        String adressTom = "Terra Street, 17";
        System.out.println(adress + adressTom + ".");
    }
}
