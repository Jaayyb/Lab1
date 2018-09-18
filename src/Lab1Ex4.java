import javax.swing.JOptionPane;
public class Lab1Ex4 {

    static int counter = 0;

    public static void main(String[] args) {


        JOptionPane.showMessageDialog(null, "The sum of all numbers entered is: " + getNumber());
        JOptionPane.showMessageDialog(null, "The amount of numbers entered is: " + getCount(counter));

    }

    public static double getNumber()
    {

        //int counter = 0;
        int total = 0;
        String input = JOptionPane.showInputDialog("Please enter a number: ");

        while (input.charAt(0) != 'q')
        {
           total = total + Integer.parseInt(input);
           counter++;
           input = JOptionPane.showInputDialog("Please enter a number: ");

        }
        return total;

    }

    public static int getCount(int c)
    {
        return c;
    }

}
