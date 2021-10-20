package areatriangulos;

import javax.swing.JOptionPane;

public class AreaTriangulos {

    public static void main(String[] args) {
        //variaveis
        double base, altura, lado, resultado, ladoa, ladob, ladoc, sp;
        int numero; 
        
        //entrada dos dados
        numero = Integer.parseInt(JOptionPane.showInputDialog("Informe o número que deseja!"
             + "\n1 - Área do Triângulo com Base e Altura"
             + "\n2 - Área do Triângulo Equilátero"  
             + "\n3 - Área do Triângulo conhecendo os lados")
        );
        
        //Processo de escolha
        switch (numero) {
            case 1:
                base = Double.parseDouble(JOptionPane.showInputDialog("Digite a Base!"));
                altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a Altura!"));
                
                resultado = (base * altura) / 2;
                
                JOptionPane.showMessageDialog(null,
                "************ ÁREA DO TRIÂNGULO COM BASE E ALTURA ************" 
                + "\n\n" + "Medida da Base: " + String.format("%.2f", base)
                + "\n" + "Medida da Altura: " + String.format("%.2f", altura)
                + "\n\n" + "A Área em (Unidade²) é: " + String.format("%.2f", resultado)
                );
                break;
                
            case 2:
                lado = Double.parseDouble(JOptionPane.showInputDialog("Digite o lado!"));
                
                resultado = (lado * lado * 1.7320508) / 4;
                
                JOptionPane.showMessageDialog(null,
                "************ ÁREA DO TRIÂNGULO EQUILÁTERO ************" 
                + "\n\n" + "Medida do lado: " + String.format("%.2f", lado)
                + "\n\n" + "A Área em (Unidade²) é: " + String.format("%.2f", resultado)
                );
                break;
                
            case 3:
                ladoa = Double.parseDouble(JOptionPane.showInputDialog("Digite o lado A!"));
                ladob = Double.parseDouble(JOptionPane.showInputDialog("Digite o lado B!"));
                ladoc = Double.parseDouble(JOptionPane.showInputDialog("Digite o lado C!"));
                
                sp = (ladoa + ladob + ladoc) / 2;
                resultado = Math.sqrt(sp * (sp - ladoa) * (sp - ladob)* (sp - ladoc));
                
                JOptionPane.showMessageDialog(null,
                "************ ÁREA DO TRIÂNGULO CONHECENDO OS LADOS ************" 
                + "\n\n" + "Medida do lado A: " + String.format("%.2f", ladoa)
                + "\n" + "Medida do lado B: " + String.format("%.2f", ladob)
                + "\n" + "Medida do lado C: " + String.format("%.2f", ladoc)
                + "\n\n" + "A Área em (Unidade²) é: " + String.format("%.2f"  ,resultado)
                );
                break;
               
            default:
                JOptionPane.showMessageDialog(null, "O Número informado é inválido.");
                break;
        } //fim do switch
    }
    
}
