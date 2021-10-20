package minicalculadora;

import javax.swing.JOptionPane;

public class MiniCalculadora {

    public static void main(String[] args) {
        
        double num1, num2, soma, sub, mul, div;
        
        num1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o primeiro número!"));
        num2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o segundo número!"));
        
        soma = num1 + num2;
        sub = num1 - num2;
        mul = num1 * num2;
        div = num1 / num2;
        
        JOptionPane.showMessageDialog(null, 
                num1 + " + " + num2 + " = " + soma +
                "\n" + num1 + " - " + num2 + " = " + sub +
                "\n" + num1 + " * " + num2 + " = " + mul +
                "\n" + num1 + " / " + num2 + " = " + div + ""
        );
         
    }
    
}
