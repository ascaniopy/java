package funcaofatorial;

public class FuncaoFatorial {
    
    public static int fatorial(int num) {
        int fat = 1;
        for (int i = 1; i <= num; i++) {
            fat = fat * i;
            System.out.println(fat);
        }
        return fat;
    }
    
    public static void main(String[] args) {
        System.out.println("O Programa começa aqui!");
        int resultado = fatorial(7);
        System.out.println("O fatorial é: " + resultado);
    }
    
}
