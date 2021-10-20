package mmcemdc;

public class MDC {
    
    static int mdc(int a, int b) {
      
      int resto;

      while (b != 0) {
         resto = a % b;
         a = b;
         b = resto;
      }
      return a;
   }
}
