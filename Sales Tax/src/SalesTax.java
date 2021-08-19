public class SalesTax {

    /*
    Create a program which takes a quantity, price and tax percentage and outputs the total cost with tax.
     */

    public static void main(String[] args) {

        //declare and initialize variable
        double price = 9.99;
        int quantity = 6;
        double _tax = 7; //.07
        final double TAX = _tax/100.0;

        //calculations

        double subTotal = price * quantity;
        double taxTotal = subTotal * TAX;
         double totalCost = subTotal * taxTotal;

        System.out.println("You bought" + quantity + "shirts for" + price + "per shirt");
        System.out.println("Subtotal: " + subTotal);
        System.out.println("Tax: " + taxTotal);
        System.out.println("Total: " + totalCost);

        //DISCOUNTS AND INCREASES

        //FORMULA:  Amount * (1 +/- Percentage) = Total

    }




}
