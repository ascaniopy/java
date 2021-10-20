package exerciciorepita2;

import javax.swing.JOptionPane;

public class ExercicioRepita2 {

    
    public static void main(String[] args) {
        
        int n, s = 0;
        
        do {
            n = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "<html>Informe um número: <br><em>Valor 0 Interronpe!</em> </html>"));
            
            s += n;
        } while(n != 0);
        
        JOptionPane.showMessageDialog(null, "<html>Resultado final<hr>" + 
                "<br>Somatório vale: " + s + "</html>");
        
    }
    
}
