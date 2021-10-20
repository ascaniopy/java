import java.util.Scanner;

public class ResolverEquacao2Grau {
    
    // Autor: João Matheus Santos Assis
    
    /*Esse programa em Java, resolve o valor 
      de delta e das raízes de uma equação
      do 2° grau. O usuário entra com os 
      valores das variáveis a,b,c.*/
    
    public static void main(String [] args) {
        
        Scanner ent = new Scanner(System.in);
        
        int a,b,c;     
        
        System.out.print("Digite a: ");
        a = ent.nextInt();
        
        if (a==0) 
            System.out.println("Equação do 1° grau");
        else {
            
             double delta,x1,x2;
             
            System.out.print("Digite b: ");
            b= ent.nextInt();
            System.out.print("Digite c: ");
            c= ent.nextInt();
        
            System.out.printf("\n%dx²+%dx+%d\n",a,b,c);
            
        delta=(b*b-4*a*c);
        System.out.println("Valor de Delta: " +delta);
        
        x1=(-b+  Math.sqrt(delta)) /(2*a);
        x2=(-b-  Math.sqrt(delta)) /(2*a);
        
        System.out.println("x1: "+x1);
        System.out.println("x2: "+x2);
        
        }
    }    
}
