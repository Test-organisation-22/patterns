package codeexamples.gui;

import javax.swing.*;

public class Addition {

    public static void main(String[] args){

        String firstNumber = JOptionPane.showInputDialog("Enter an integer");
        String secondNumber = JOptionPane.showInputDialog("Enter second integer");

        int number1, number2;

        try {
            number1 = Integer.parseInt(firstNumber);
            number2 = Integer.parseInt(secondNumber);
            int sum = number1 + number2;
            JOptionPane.showMessageDialog(null, "The sum is " + sum, "Sum", JOptionPane.PLAIN_MESSAGE);
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "probably that was not a number", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
