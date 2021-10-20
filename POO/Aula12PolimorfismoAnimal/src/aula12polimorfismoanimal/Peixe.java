package aula12polimorfismoanimal;

public class Peixe extends Animal {
    //ATRIBUTO.
    private String corEscama;
    
    //MÉTODOS SOBREPOR.
    @Override
    public void locomover() {
        System.out.println("Nadando.");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo substâncias.");
    }

    @Override
    public void emitirSom() {
        System.out.println("Peixe não faz som.");
    }
    
    //MÉTODO.
    public void soltarBolha() {
        System.out.println("Soltando bolha.");
    }
    
    //MÉTODOS GETTERS e SETTERS.

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }   
} 


