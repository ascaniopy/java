package aula02;

public class Aula02 {

    public static void main(String[] args) {
        
        Caneta c1 = new Caneta();
        
        c1.modelo = "BIC Cristal";
        c1.cor = "Azul";
        //c1.ponta = 0.5f;      ERRO, pois é PRIVATE.
        c1.carga = 80;       // Não deu ERRO, apesar de ser PROTECTED, pois está na mesma classe.
        c1.tampada = true;
        c1.status();
    }    
}

