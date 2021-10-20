package mmcemdc;

import javax.swing.JOptionPane;

public class MMCeMDC {

    public static void main(String[] args) {
        
        int num1, num2;
        
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número: "));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite uo segundo número: "));
        
        JOptionPane.showMessageDialog(null, 
        " MMC: Mínimo Múltiplo Comum" +
        "\n MDC: Máximo Divisor Comum" +
        "\n\n MMC(" + num1 + ",  " + num2 +") = " +  MMC.mmc(num1, num2) +
        "\n\n MDC(" + num1 + ",  " +  + num2 + ") = " + MDC.mdc(num1, num2)
        );
    }   
}
