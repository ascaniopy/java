package raizquadradaecubica;

import javax.swing.JOptionPane;

public class RaizQuadradaECubica {
  
  public static void main(String[] args){    
     String numero, opcao;
     int a;
	 
     opcao = JOptionPane.showInputDialog("Olá, o que gostaria de saber:"
             + "\n1 - Raiz quadrada de um número"
             + "\n2 - Raiz cúbica de um número");   
     a = Integer.parseInt(opcao);
	 
     switch (a) {
	 
        case 1:    
            String n;    
            n = JOptionPane.showInputDialog("Digite um número para saber sua raiz quadrada: ");    
            double n1 = Double.parseDouble(n);    
            JOptionPane.showMessageDialog(null, "A raiz quadrada de " + n + " é " + Math.sqrt(n1));    
    
            System.exit(0);    
            break; 
	 
        case 2:    
            String n2;    
            n2 = JOptionPane.showInputDialog("Digite um número para saber sua raiz cúbica: ");    
            double n3 = Double.parseDouble(n2);    
            JOptionPane.showMessageDialog(null, "A raiz cúbica de " + n2 + " é " + Math.cbrt(n3));    
    
            System.exit(0);
            break;  
     }  
  } 
} 

