package aula13poliformismosobrecarga;

public class Aula13PoliformismoSobrecarga {

    public static void main(String[] args) {
        
        Cachorro c = new Cachorro();
        
        c.reagir("Olá!");           //Frase(String).
        c.reagir("Vai apanhar!");   //Frase(String).
        c.reagir(11, 45);           //Hora e minuto(int e int).
        c.reagir(true);             //Dono(boolean).
        c.reagir(false);            //Dono(boolean).
        c.reagir(17, 4.5f);         //Idade e Peso(int e float).
    }  
}
