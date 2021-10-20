import java.util.Scanner;

public class Juros_Compostos {
   
    /*No juros compostos o juro do mês
     é somado ao capital, resultando em um novo capital
     a cada mês para o cálculo de novos juros.
     Esse sistema de juros é mais rentável 
     sendo este o mais utilidados no dia-a-dia
     para aplicações financeiras.
    */

   public static void main(String [] args){
       
       Scanner entrada = new Scanner(System.in);
       
       double Capital, Taxa, meses, Montante;
       
       System.out.println("Capital: ");
       Capital = entrada.nextDouble();
       
       System.out.println("Taxa mensal (em porcentagem): ");
       Taxa = entrada.nextDouble();
       
       System.out.println("Tempo (meses): ");
       meses = entrada.nextDouble();
       
       // Fórmula para calcular o montante
       Montante = Capital * Math.pow((1 + Taxa/100),meses);
       
       System.out.println("Montante: " + Montante);
   }   
}

