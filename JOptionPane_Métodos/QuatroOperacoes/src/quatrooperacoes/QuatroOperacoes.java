package quatrooperacoes;

import javax.swing.JOptionPane;

public class QuatroOperacoes {

    public static void main(String[] args) {
        double a, b;
        
        a = Double.parseDouble(JOptionPane.showInputDialog("Digite o Primeiro Número: "));
        b = Double.parseDouble(JOptionPane.showInputDialog("Digite o Segundo Número: "));
        
        JOptionPane.showMessageDialog(null, 
        " ==== AS 4 OPERAÇÕES =====" +
        "\n\n O Primeiro Número é: " + a +
        "\n O Segundo Número è: "  + b +      
        "\n\n A Soma é: " + String.format("%.2f", Soma.somar(a, b)) +
        "\n A Subtração é: " + String.format("%.2f", Subtrair.sub(a, b)) +
        "\n A Multiplicação é: " + String.format("%.2f", Multiplicar.mult(a, b)) +
        "\n A Divisão é: " + String.format("%.4f", Dividir.div(a, b)) 
        );
    }
}
