package comparacaostring;


public class ComparacaoString {

    
    public static void main(String[] args) {
        /*String nome1 = "Ascanio";
        String nome2 = "Ascanio";
        String nome3 = new String("Ascanio");
        String res;
        res = (nome1 == nome3) ? "Igual" : "Diferente";  //DIFERENTE
        System.out.println(res); 
        */
        
        String nome1 = "Ascanio";
        String nome2 = "Ascanio";
        String nome3 = new String("Ascanio");
        String res;
        res = (nome1.equals(nome3)) ? "Igual" : "Diferente"; //iGUAL
        System.out.println(res); 
                   
    }   
}
