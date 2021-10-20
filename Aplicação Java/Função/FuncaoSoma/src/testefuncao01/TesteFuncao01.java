package testefuncao01;


/*public class TesteFuncao01 {     //AQUI É UM MÉTODO.
    static void soma(int a, int b) {
        int s = a + b;
        System.out.println("A soma é: " + s);
    }
    
    public static void main(String[] args) {
        System.out.println("O Programa começa aqui!");
        soma(5, 2);
        
    }
    
}*/
public class TesteFuncao01 {     //AQUI É UMA FUNÇÃO.
    static int soma(int a, int b) {
        int s = a + b;
        return s;   
    }
    
    public static void main(String[] args) {
        System.out.println("O Programa começa aqui!");
        int sm = soma(5, 2);
        System.out.println("A soma vale " + sm);
        
    }
    
}
