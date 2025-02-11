import java.util.Scanner;

import javax.swing.JOptionPane;

public class no3 {
    public static void main(String[] args) {
        // Create a simple program to calculate income and accept input from user using Scanner
        // and show the output of netIncome using JOptionPane

        // Declare Scanner object
        Scanner sc = new Scanner(System.in);

        // Declare variables
        int income, bonus, fine;
        double taxPercentage, netIncome;

        System.out.println("Enter income: ");
        income = sc.nextInt();
        System.out.println("Enter bonus: ");
        bonus = sc.nextInt();
        System.out.println("Enter fine: ");
        fine = sc.nextInt();
        System.out.println("Enter tax percentage: ");
        taxPercentage = sc.nextDouble();

        // Calculate net income
        int totalIncome = income + bonus - fine;
        netIncome = totalIncome - (totalIncome * (taxPercentage/100));
        JOptionPane.showMessageDialog(null, "Your total income is " + netIncome);
    }
}
