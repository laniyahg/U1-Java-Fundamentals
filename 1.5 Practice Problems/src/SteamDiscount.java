public class SteamDiscount {

    /*
    A game on Steam costs $60.00, but is currently on sale for 20% off. Create a program to display how much the game costs after the discount.
     */

    public static void main(String[] args){

      int totalCost = 60;

      double  percentCost = .20;

      double totalC = totalCost * percentCost;

      double totalF = totalCost - totalC;


        System.out.println("Total discount: " + totalF);



    }
}
