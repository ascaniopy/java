package mmcentredoisnumeros;

public class MMCEntreDoisNumeros {
    
    static int mmc(int n1, int n2) { //Função. Troca o void pelo int.
        int resto;
        int a = n1;
        int b = n2;
      
        while (b != 0) {
            resto = a % b;
            a = b;
            b = resto;
        }

        return (n1 * n2) / a;  
    }
   
    public static void main(String[] args) {
        System.out.println("Começou o programa!");
        int resultado = mmc(12, 40);
        System.out.println("O MMC é: " + resultado);
    }
}
