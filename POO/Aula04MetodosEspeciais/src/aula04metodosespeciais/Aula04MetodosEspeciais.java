package aula04metodosespeciais;

public class Aula04MetodosEspeciais {

    public static void main(String[] args) {
        Caneta c1 = new Caneta("Compactor", "Amarela", 0.4f);  //Objeto caneta.
        c1.status();
        
        System.out.println();
        
        Caneta c2 = new Caneta("BIC", "Vermelha", 1.5f);  //Objeto caneta.
        c2.status();
    }    
    
}
