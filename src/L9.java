import javax.swing.JOptionPane;


public class L9{

    public static void main(String[] args) {

        String firstName;
        String lastName;

        firstName = JOptionPane.showInputDialog("what is your name?");
        lastName = JOptionPane.showInputDialog("what is your last name?");


      JOptionPane.showMessageDialog(null, "Hello !!" + firstName + lastName + "!!" );
      System.exit(0);


     //All input is received as a String

        //Pro Tip: variables in the same data type can be separated with a comma in the declaration

        int mph, minutes;

        double distance, hours;

        mph = Integer.parseInt(JOptionPane.showInputDialog("How fast were you travelling (in mph)"));
        minutes = Integer. parseInt(JOptionPane.showInputDialog("How Long, in minutes, were you travelling?"));

        hours = minutes/60.0;

        distance = mph * hours;

        JOptionPane.showMessageDialog(null, "You travelled " + distance + " miles.");

    }

}
