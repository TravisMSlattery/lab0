package labset0;

import javax.swing.*;

public class set2 {
    public static void main(String[] args) {

        String name = JOptionPane.showInputDialog("Please enter your first name: ");
        String initial = JOptionPane.showInputDialog("Please enter your initial: ");
        String surname = JOptionPane.showInputDialog("Please enter your surname: ");
        String totalDistanceAsString = JOptionPane.showInputDialog("Please enter the distance you travelled: ");
        int totalDistance = Integer.parseInt(totalDistanceAsString);
        double lessThan10 = 0.07, moreThan10 = 0.10;

        if (totalDistance <=10){
            double shortDistance = totalDistance * lessThan10;

            JOptionPane.showMessageDialog(null,"Well Done " + name+" " + initial + " " + surname + "\nYou made " + shortDistance,"Cyclists Details",
                    JOptionPane.INFORMATION_MESSAGE);
        }
        else //if (totalDistance >10)
        {
            double longDistance = (totalDistance - 10) * moreThan10;
            double shortDistance = 10 * lessThan10;
            double sumDistance = longDistance + shortDistance;

            JOptionPane.showMessageDialog(null,"Well Done " + name +" " + initial + " " + surname + "\nYou made €" + String.format("%.2f",sumDistance),"Cyclists Details",
                    JOptionPane.INFORMATION_MESSAGE);
        }

    }
}
