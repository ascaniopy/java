package divisoresdeumnumero;


public class DivisoresDeUmNumero {

    
    public static void divisores(int numero) {

      for (int i = 1; i <= numero; i++) {
         
          if ((numero % i) == 0) {
            System.out.print(i + " ");
          }
      }

   }
    
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Os divisores são:");
        divisores(100);
    }
    
}
