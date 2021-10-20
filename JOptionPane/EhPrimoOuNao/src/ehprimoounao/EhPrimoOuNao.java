package ehprimoounao;

import javax.swing.*;

public class EhPrimoOuNao { 
    
    public static void main(String[] args) { 
          
        int a=0,i,n=0;
        
            n=Integer.parseInt(JOptionPane.showInputDialog(null,"Digite um Número!"));
        
            for(i=1; i<(n+1); i++){ 
                if(n % i == 0){ 
                    a++; 
                } 
            } 
                if(a != 2)
            { 
                JOptionPane.showMessageDialog(null,"Não é Primo");
            } else
                { 
                    JOptionPane.showMessageDialog(null,"É Primo");
            }
    } 
}
