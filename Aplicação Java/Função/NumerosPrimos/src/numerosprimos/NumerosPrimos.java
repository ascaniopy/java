package numerosprimos;

public class NumerosPrimos {

     public static void main(String[] args) {
       for (int i = 2; i <= 100; i++) {
            if(Primo.ehPrimo(i))
            System.out.println(i);    
       } 
    }
}
