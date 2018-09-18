import javax.swing.JOptionPane;
public class Ex1 {
    public static void main(String args[]) {

        String name = getName(), collegeClass = getCollegeClass();


        JOptionPane.showMessageDialog(null, name + collegeClass);
    }

    private static String getName()
    {
        return JOptionPane.showInputDialog("What is your name?");
    }

    private static String getCollegeClass()
    {
        return JOptionPane.showInputDialog("What class are you in?");
    }

}