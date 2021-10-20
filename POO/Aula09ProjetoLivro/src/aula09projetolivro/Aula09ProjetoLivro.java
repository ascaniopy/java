package aula09projetolivro;

public class Aula09ProjetoLivro {

    public static void main(String[] args) {
        
        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro[3];
        
        p[0] = new Pessoa("Pedro", 22, "M");
        p[1] = new Pessoa("Maria", 25, "F");
        
        l[0] = new Livro("Java", "Bruno", 300, p[0]);
        l[1] = new Livro("POO", "Py", 500, p[1]);
        l[2] = new Livro("Java Avançado", "Breno", 800, p[0]);
        
        l[0].abrir();
        l[0].folhear(100); 
        l[0].avancarPag();
        
        System.out.println("======= livro 1 =======");
        System.out.println(l[0].detalhes());
        System.out.println("");
        System.out.println("======= livro 2 =======");  
        System.out.println(l[1].detalhes()); 
    }   
}
