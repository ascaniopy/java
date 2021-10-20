package expoente;

import javax.swing.JOptionPane;

public class Expoente {

    public static void main(String[] args) {
        double base;
        double exp;
        double resultado;
        
        base = Double.parseDouble(JOptionPane.showInputDialog("Digite a base"));
        exp = Double.parseDouble(JOptionPane.showInputDialog("Digite o expoente"));
        
        resultado = Math.pow(base, exp);
        JOptionPane.showMessageDialog(null, "O valor  é: " + String.format("%.2f", resultado));
    }
    
}
