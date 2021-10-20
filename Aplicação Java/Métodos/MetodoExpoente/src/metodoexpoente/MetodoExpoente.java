package metodoexpoente;

public class MetodoExpoente {
    
    public static void expoente(double a, double b) {
        System.out.println(Math.pow(a, b));
    }
    
    public static void main(String[] args) {
        System.out.println("O resultado é: ");
        expoente(2, 10);
    }
    
}

