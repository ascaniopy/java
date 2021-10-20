package descontoproduto;

import javax.swing.JOptionPane;

public class DescontoProduto {

    public static void main(String[] args) {
        double produto;
        double taxa;
        double desconto;
        double resultado;
                
        produto = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do produto."));
        taxa = Double.parseDouble(JOptionPane.showInputDialog("Digite a taxa de desconto."));
        
        desconto = (produto * taxa) / 100;
        resultado = produto - desconto;
        
        JOptionPane.showMessageDialog(null,
                "********* DESCONTO ************" +
                "\n\n" + "O valor do produto é: R$ " + String.format("%.2f", produto) +
                "\n\n" + "A taxa (%) é: " + String.format("%.2f", taxa) +
                "\n\n" + "O valor do desconto é: R$ " + String.format("%.2f", desconto) +   
                "\n\n" + "O valor com o desconto é: R$ " + String.format("%.2f", resultado) 
        );  
    }   
}
