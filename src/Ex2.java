import javax.swing.*;

public class Ex2 {
    public static void main(String[] args) {
        String name = getName();
        int distanceNo = getDistance();
        double total = getTotal(distanceNo);

        JOptionPane.showMessageDialog(null, "Your information is " + name + "\nYour distanced cycled is "
                + distanceNo + "\nThe total amount due is: " + (String.format("%.2f", total)));
    }


    public static String getName()
    {
        String fName = JOptionPane.showInputDialog("Please enter your first name: ");
      String initials =  JOptionPane.showInputDialog("Please enter your initials: ");
      String sName = JOptionPane.showInputDialog("Please enter your surname: ");

      return fName + " " + initials + " " + sName;
    }

    public static int getDistance()
    {
        String distance = JOptionPane.showInputDialog("What distance did you cycle?");
        int distanceNo = Integer.parseInt(distance);

        return distanceNo;
    }

    public static double getTotal(int a)
    {
        double b = a;

        if (a <= 10)
        {
           b  = b * 0.07;
        }
        else if(a > 10)
        {
           a = a - 10;
           b = (a * 0.1) + 0.7;
        }

        return b;
    }
}
