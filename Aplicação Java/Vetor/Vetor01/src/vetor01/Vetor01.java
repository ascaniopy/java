package vetor01;


public class Vetor01 {

    
    public static void main(String[] args) {
        /*int n[] = {3, 2, 8, 7, 5, 4};
        
        for (int c=0; c<=5; c++) {
            System.out.print(n[c] + " ");
        }
        */
        
        int n[] = {3, 2, 8, 7, 5, 4};
        System.out.println("Total de casas de N: " + n.length + "\n");
        
        for (int c=0; c<=5; c++) {
            System.out.println("Na posição " + c + " temos o valor " +n[c]);
        }
        
        
        /*int n[] = {3, 2, 8, 7, 5, 4};
    
        for (int c=0; c<=n.length-1; c++) {
            System.out.println("Na posição " + c + " temos o valor " +n[c]);
        }
        */
    }
    
}
