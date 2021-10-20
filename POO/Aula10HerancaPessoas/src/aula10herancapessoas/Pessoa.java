package aula10herancapessoas;

public class Pessoa {
    private String nome;
    private int idade;
    private String sexo;
    
    public void fazerAniversario() {
        this.idade++;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    //MÉTODO toString()
    @Override
    public String toString() {
        return "Pessoa{" + "Nome = " + nome + ", Idade = " + idade + ", Sexo = " + sexo + '}';
    }  
}
