package exerciciorepita;

import javax.swing.JOptionPane;

public class ExercicioRepita {

    
    public static void main(String[] args) {
        
        //JOptionPane.showMessageDialog(null, "Olá Mundo!", "Boas Vindas!", JOptionPane.ERROR_MESSAGE);
        
        /*int n = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe um número!"));
        JOptionPane.showMessageDialog(null, "Você digitou o valor: " + n);
        */
        
        int n;
        
        do {    
            n = Integer.parseInt(JOptionPane.showInputDialog(null, 
                    "<html>Informe um número: <br><em>Valor 0 Interronpe!</em></html>"));
        } while(n != 0);
    }
    
}
