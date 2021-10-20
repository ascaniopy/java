package divisoresdeumnumero;

import javax.swing.JOptionPane;

public class DivisoresDeUmNumero {

    public static void main(String[] args) {
        int dividendo, divisor, resto;
	String num, div = "";
	
	num = JOptionPane.showInputDialog("Digite um Número Inteiro:");
	dividendo = Integer.parseInt(num);
        
        for (divisor = 1; divisor <= dividendo; divisor++){
            resto = dividendo % divisor;
            
            if (resto == 0){
                div += "  " + divisor;
            }
	}
        JOptionPane.showMessageDialog(null, "Os divisores de " + num + " são: " + div);
    }
}
