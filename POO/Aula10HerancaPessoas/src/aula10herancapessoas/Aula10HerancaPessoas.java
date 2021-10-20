package aula10herancapessoas;

public class Aula10HerancaPessoas {

    public static void main(String[] args) {
        //PROGRAMA PRINCIPAL
        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();
        
        p1.setNome("Pedro");
        p2.setNome("Maria");
        p3.setNome("Cláudio");
        p4.setNome("Fabiana");
        
        p1.setSexo("M");
        p4.setSexo("F");
        p2.setIdade(18);
        
        //p2.mudarTrabalho();          p2 Não pode mudar Trabalho.
        p3.receberAumento(550.20f);  //Só p3 pode receber aumento.
        p4.mudarTrabalho();          //Só p4 pode mudar trabalho.
        p2.cancelarMatr();           //Só p2 pode cancelar matrícula.
        
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
    }  
}
