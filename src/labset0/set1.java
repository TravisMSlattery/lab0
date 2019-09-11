package labset0;

import javax.swing.*;

public class set1 {
    public static void main(String[] args) {

        String name = JOptionPane.showInputDialog("Please enter your name: ");
        String course = JOptionPane.showInputDialog("Please enter your class: ");
        String totalSnacksAsString = JOptionPane.showInputDialog("Please enter the amount of snacks ");
        int totalSnacks = Integer.parseInt(totalSnacksAsString);


        JOptionPane.showMessageDialog(null, "You owe €" + totalSum(totalSnacks), "Your Cost",
                JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);
    }

    public static Integer totalSum(int totalSnacks) {
        int cost = 2;
        //int totalSnacks;

       int totalAmount = cost * totalSnacks;

        return totalAmount;


    }
}

