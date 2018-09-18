import javax.swing.JOptionPane;
public class Lab1Ex3 {
    public static void main(String[] args) {

        String name = JOptionPane.showInputDialog("What is your name?");
        String income = JOptionPane.showInputDialog("What is your income?");
        int incomeNo = Integer.parseInt(income);
        double t = getTax(incomeNo, getRate(incomeNo));

        JOptionPane.showMessageDialog(null, "Your name is: " + name + "\nGross income: " + incomeNo + "\nTax rate is: " + getRate(incomeNo) + "%" + "\nJ" +
                "The amount taxed is: " + getTax(incomeNo, getRate(incomeNo)) + "\nThe income after tax is: " + afterTax(incomeNo, getTax(incomeNo, getRate(incomeNo))));


    }

    public static int getRate(int i)
    {
        int rate = 0;

        if (i <= 20000 && i >= 0)
        {
          rate = 0;
        }
        else if (i > 20000 && i <= 36000)
        {
            rate = 20;
        }
        else if (i > 36000)
        {
            rate = 41;
        }
        else {
            JOptionPane.showMessageDialog(null, "Error!");
        }

        return rate;
    }

    public static double getTax(int i, int r) {

        if (r == 0)
        {
            i = i;
        }
        else if (r == 20)
        {
            i = (i / 100) * 20;
        }
        else if (r == 41)
        {
            i = (i / 100) * 41;
        }

        return i;
    }

    public static double afterTax(int i, double t)
    {
        t = (i - t);

        return t;

    }
}
