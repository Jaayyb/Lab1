import javax.swing.JOptionPane;
public class Lab1Ex6 {
    public static void main(String[] args) {

        JOptionPane.showMessageDialog(null, getCalculation());


    }

    public static double getCalculation()
    {
        String input = JOptionPane.showInputDialog("Please select an option:\na - addition\ns - subtraction\nm - multiplication\nd - divsion ");
        double result = 0;
        String numString1, numString2;
        double num1, num2;

        while(! (input.equalsIgnoreCase("q") || input.equalsIgnoreCase("quit"))) {

            switch (input.charAt(0)) {
                case 'a':
                    numString1 = JOptionPane.showInputDialog("Please enter the first number: ");
                    num1 = Double.parseDouble(numString1);
                    numString2 = JOptionPane.showInputDialog("Please enter the first number: ");
                    num2 = Double.parseDouble(numString2);

                    result = (num1 + num2);
                    break;

                case 's':
                    numString1 = JOptionPane.showInputDialog("Please enter the first number: ");
                    num1 = Double.parseDouble(numString1);
                    numString2 = JOptionPane.showInputDialog("Please enter the first number: ");
                    num2 = Double.parseDouble(numString2);

                    result = (num1 - num2);
                    break;

                case 'm':
                    numString1 = JOptionPane.showInputDialog("Please enter the first number: ");
                    num1 = Double.parseDouble(numString1);
                    numString2 = JOptionPane.showInputDialog("Please enter the first number: ");
                    num2 = Double.parseDouble(numString2);

                    result = (num1 * num2);
                    break;

                case 'd':
                    numString1 = JOptionPane.showInputDialog("Please enter the first number: ");
                    num1 = Double.parseDouble(numString1);
                    numString2 = JOptionPane.showInputDialog("Please enter the first number: ");
                    num2 = Double.parseDouble(numString2);

                    result = (num1 / num2);
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Error, shutting down");
                    System.exit(0);

            }
        }

        return result;

    }

}
