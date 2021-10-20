package quatrooperacoes;

public class QuatroOperacoes {

    public static void main(String[] args) {
        System.out.println("O programa começa aqui");
        
        System.out.print("A soma é: ");
        System.out.println(Soma.somar(3, 6));
        
        System.out.print("A subtração é: ");
        System.out.println(Subtrair.sub(4, 7));
        
        System.out.print("A multiplicação é: ");
        System.out.println(Multiplicar.mult(5, 4));
        
        System.out.print("A divisão é: ");
        System.out.println(Dividir.div(12, 3));
    }
    
}
