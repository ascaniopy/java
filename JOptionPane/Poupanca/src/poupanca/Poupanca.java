package poupanca;

import javax.swing.JOptionPane;

public class Poupanca {

    public static void main(String[] args) {
        double capital;
        double taxa = 0.1733;
        double taxaSelic = 3.00;
        double montante;
        double juros;
        double acumulado;
        int tempo;
        
        capital = Double.parseDouble(JOptionPane.showInputDialog("Digite o capital"));
        tempo = Integer.parseInt(JOptionPane.showInputDialog("Digite o tempo"));
        
        
        montante = capital * Math.pow((1 + taxa / 100), tempo);
        juros = montante - capital;
        
        acumulado = (Math.pow((1 + taxa/100), tempo) - 1) * 100;
        
        //JOptionPane.showMessageDialog(null, "O Montante é: " + montante); //Aparece um de cada vez
        //JOptionPane.showMessageDialog(null, "O juros é: " + juros);
        
        JOptionPane.showMessageDialog(null,
                "************ POUPANÇA ************" +
                "\n\n" + "O Capital é: R$ " + String.format("%.2f", capital) +
                "\n" + "O tempo é: " + tempo + " meses" +
                "\n" + "Os juros são: R$ " + String.format("%.2f", juros) +
                "\n" + "O Montante é: R$ " + String.format("%.2f", montante) +    //Aparece tudo na mesma tela.
                "\n\n" + "A taxa de Juros Mensal é: 0,1733%" +
                "\n" + "A taxa acumulada é: " + String.format("%.2f", acumulado) + "%" +     
                "\n" + "A taxa de Juros Anual é: " + String.format("%.2f", (0.7 * taxaSelic)) + "%" +
                "\n" + "A taxa SELIC é: " + taxaSelic + "%"
        );
    }
    
}
