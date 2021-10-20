package aula12polimorfismoanimal;

public class Mamifero extends Animal {
    //ATRIBUTO.
    private String corPelo;
    
    //MÉTODOS ABSTRATOS.
    @Override
    public void locomover() {
        System.out.println("Correndo.");
    }

    @Override
    public void alimentar() {
        System.out.println("Mamando.");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de mamífero.");
    } 
    
    //MÉTODOS GETTERS e SETTERS.
    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }  
}
