import java.util.Scanner;

public class MDC {
    
    public static void main(String [] args){
    
        /*Este programa fornece o MDC de dois números
          A e B digitados pelo usuário*/
        
        Scanner entrada = new Scanner(System.in);
        int A,B,mdc,maior;
        
        mdc=1;
        
        System.out.printf("MAXIMO DIVISOR COMUM DE A e B\n\n");
        
          System.out.printf(" A: ");
          A = entrada.nextInt();
     
          System.out.printf(" B: ");
          B = entrada.nextInt();
     
          System.out.printf("\n\n");
          
          /*A variável maior é inicializada com
            A considerando que A possa ser igual
            a B, caso contrário os if's indicaram
            o maior*/
          maior=A;
           if (A>B) maior=A;
           if (B>A) maior=B;
          
          System.out.printf(" MDC (%d,%d): ",A,B);
          
            for(int i=2; i<=maior; ++i){
              /* Enquanto o resto da divisão for igual a zero
                 a variável mdc irá ser multiplicada por i*/
                while ((A % i==0)&&(B % i==0)){
                    A=A/i;
                    B=B/i;
                    mdc=mdc*i;
                }
            }
          
          // Exibindo o MDC
          System.out.printf("%d\n",mdc);
    }   
}
