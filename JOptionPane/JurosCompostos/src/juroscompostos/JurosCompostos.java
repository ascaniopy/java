package juroscompostos;

import javax.swing.JOptionPane;

public class JurosCompostos {

    public static void main(String[] args) {
        double capital;
        double taxa;
        double montante;
        double juros;
        double acumulado;
        int tempo;
        
        capital = Double.parseDouble(JOptionPane.showInputDialog("Digite o capital"));
        taxa = Double.parseDouble(JOptionPane.showInputDialog("Digite a taxa"));
        tempo = Integer.parseInt(JOptionPane.showInputDialog("Digite o tempo"));
        
        
        montante = capital * Math.pow((1 + taxa / 100), tempo);
        juros = montante - capital;
        
        acumulado = (Math.pow((1 + taxa/100), tempo) - 1) * 100;
        
        //JOptionPane.showMessageDialog(null, "O Montante é: " + montante); //Aparece um de cada vez
        //JOptionPane.showMessageDialog(null, "O juros é: " + juros);
        
        JOptionPane.showMessageDialog(null,
                "************ JUROS COMPOSTOS ************" +
                "\n\n" + "O Capital é: R$ " + String.format("%.2f", capital) +
                "\n" + "A taxa é: " + String.format("%.4f", taxa) + "%" +
                "\n" + "O tempo é: " + tempo + " meses " +
                "\n\n" + "Os juros são: R$ " + String.format("%.2f", juros) +
                "\n" + "O Montante é: R$ " + String.format("%.2f", montante) +    //Aparece tudo na mesma tela.
                "\n" + "A taxa acumulada é: " + String.format("%.4f", acumulado) + "%"     
        );
    }   
}
