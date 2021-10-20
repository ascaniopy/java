package areatrapezio;

import javax.swing.JOptionPane;


public class AreaTrapezio {

    public static void main(String[] args) {
        
        double bmaior, bmenor, altura, resultado;
        
        bmaior = Double.parseDouble(JOptionPane.showInputDialog("Digite a Base Maior!"));
        bmenor = Double.parseDouble(JOptionPane.showInputDialog("Digite a Base Menor!!"));
        altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a Altura!"));
        
        resultado = ((bmaior + bmenor) * altura) / 2;
        
        JOptionPane.showMessageDialog(null,
                "************ ÁREA DO TRAPÉZIO ************" +
                "\n\n" + "A área em (M²) é: " + String.format("%.2f"  ,resultado)
        );  
    }    
}


