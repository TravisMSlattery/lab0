import javax.swing.*;

public class set3 {
    public static void main(String[] args) {

        String name = JOptionPane.showInputDialog("Please enter your name: ");
        String totalIncomeAsString = JOptionPane.showInputDialog("Please enter your income: ");
        double totalIncome = Double.parseDouble(totalIncomeAsString);
        double lowRate = 0.20, highRate = 0.41;
        double taxFree = 20000;
        double lowTax = 36000;
        double taxableIncome = totalIncome - taxFree;

        if (totalIncome <= 20000){

            JOptionPane.showMessageDialog(null,"Hi " + name + " your Tax rate is 0%.\nYour income is €" + String.format("%.2f",totalIncome),"Tax Details",
                    JOptionPane.INFORMATION_MESSAGE);
        }
        else if (totalIncome > 20000 && totalIncome <= 36000)
        {
            double lessTax = (totalIncome - taxFree) * lowRate;
            double net = taxableIncome - lessTax;
            double gross = taxFree + net;

            JOptionPane.showMessageDialog(null,"Hi " + name + " your Tax rate is 20%.\nYour income is €"  + String.format("%.2f",gross),"Tax Details",
                    JOptionPane.INFORMATION_MESSAGE);
        }
        else
        {
            double stage1 = totalIncome - taxFree;
            double stage2 = stage1 * lowRate;
            double stage3 = (totalIncome - lowTax) * highRate;
            double net = taxableIncome - (stage2 + stage3);
            double gross = taxFree + net;

            JOptionPane.showMessageDialog(null,"Hi " + name + " your Tax rate is 41%.\nYour income is €"  + String.format("%.2f",gross),"Tax Details",
                    JOptionPane.INFORMATION_MESSAGE);
        }

    }
}