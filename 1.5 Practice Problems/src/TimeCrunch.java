public class TimeCrunch {

    /*
    Create a program which takes a number in seconds and breaks it down into hours, minutes and seconds.

    Example:
     */

    public static void main(String[] args){

        int numSec = 450 ;

        double decimalSec = 0.0166;

        double totalValue = numSec * decimalSec;

        int totalMinSec = 3600;

        double totalValue2 = numSec/totalMinSec;


        System.out.println("Total value in min: " + totalValue);
        System.out.println("Total value in hours: " + totalValue2);
        System.out.println("total value in seconds: " +  numSec);



    }

}
