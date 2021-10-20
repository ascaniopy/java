package aula14projetofinalvideo;

public class Gafanhoto extends Pessoa {
    private String login;
    private int totAssistido;

    //MÉTODO CONSTRUTOR.
    public Gafanhoto(String nome, int idade, String sexo, String login) {
        super(nome, idade, sexo);
        this.login = login;
        this.totAssistido = 0;
    }
    
    //MÉTODOS GETTERS e SETTERS. 
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotAssitido() {
        return totAssistido;
    }

    public void setTotAssitido(int totAssistido) {
        this.totAssistido = totAssistido;
    }

    @Override
    public String toString() {
        return "Gafanhoto{" + super.toString() + "\nlogin=" + login + ", totAssistido=" + totAssistido + '}';
    }
}
