package mdcentredoisnumeros;

public class MDCEntreDoisNumeros {  //Máximo Divisor Comum.
    
    public static int mdc(int a, int b) {
      int resto;

      while (b != 0) {
         resto = a % b;
         a = b;
         b = resto;
      }

      return a;
   }
    
    public static void main(String[] args) {
       System.out.println("Começou o programa!");
       int resultado = mdc(125, 50);
       System.out.println("O MDC é: " + resultado); 
    }
    
}
