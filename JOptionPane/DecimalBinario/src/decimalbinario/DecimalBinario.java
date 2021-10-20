package decimalbinario;

import javax.swing.JOptionPane;

public class DecimalBinario {
     public static void main(String[] args) {  //inicio do método main
        //declaração de variaveis
        int num[] = new int[100];  //BD criação do vetor tipo inteiro
        int resultado = 0, bin = 0, ver = 0; 
        String binario;  
       
        float numero; 
        int resto; 
        int q[] = new int[100]; //DB vetor quociente
        String sequencia = "", seqBinaria = ""; //DB Strings inicializadas
            
        int menu; //variavel do menu
       
        do{       
       
        menu = Integer.parseInt(JOptionPane.showInputDialog(" BINÁRIO E DECIMAL\n\nMENU DE OPÇÕES"
                + "\n1 - Converte de Binário para Decimal"
                + "\n2 - Converte de Decimal para Binário\n3 - Sair"));
       
        //Escolha do menu
        switch(menu){
            case 1:          
        //INICIO - CONVERTE DE BINÁRIOS PARA DECIMAL
        //entrada de dados - saida dos dados - Usando uma Janela grafica JOptionPane
        binario = JOptionPane.showInputDialog("Informe o numero binário:");

        //Validação
        for (int i = 0; i < binario.length(); i++) {
            //verifica se o numero é binario
            if (binario.charAt(i) < 48 || binario.charAt(i) > 49) {
                //saida dos dados - Usando uma Janela grafica JOptionPane
                JOptionPane.showMessageDialog(null, "Operação Inválida!");
                ver = 1; // variavel verificadora
                break;
            }
        } //fim da validação
        if (ver == 0) {
            for (int i = 0; i < binario.length(); i++) {
                //recebe o caracter 0 ou 1, mas entende que o correspondente inteiro é 48 ou 49
                bin = binario.charAt(i);

                //se o valor for 48 atribui ao vetor 0
                if (bin == 48) {
                    num[i] = 0;
                }

                //se o valor for 48 atribui ao vetor 1
                if (bin == 49) {
                    num[i] = 1;
                }

                //formula que
                resultado = num[i] + 2 * resultado;
               
            } //fim do for
            //saida dos dados - Usando uma Janela grafica JOptionPane
            JOptionPane.showMessageDialog(null, "O número decimal correspondente é: " + resultado);
             resultado =0; // Zera a variavel para o proximo uso
        } //fim do If
        //FIM - CONVERTE DE BINÁRIOS PARA DECIMAL
        break;
            case 2:          
        //INICIO - CONVERTE DE DECIMAL PARA BINÁRIOS
        //Entrada de dados - var recebento a String convertida em Float
        numero = Float.parseFloat(JOptionPane.showInputDialog("Informe o numero decimal:"));
        
        //processamento: convertendo decimal
        while (numero > 0) {  //faça enquanto o numero for maior que zero
            int i = 0;  //inicializando a var local
            resto = (int) numero % 2;  //var assumindo o resto da divisão
            q[i] = (int) (numero / 2);  //O vetor recebe a parte inteira da divisão
            numero = q[i];  //a var assumindo novo numero = quociente da divisão
            sequencia += resto;  //var sequencia concatenando o resto das divisões
            i++;  //incrementando a var local
        }
        //Loop para inverter os caracteres da String sequencia
        for (int j = sequencia.length() - 1; j >= 0; j--) {
            seqBinaria = seqBinaria + sequencia.charAt(j); //var que concatena o resultado
        } // fim do FOR
        //janela que mostra a sequencia binaria correspondente
        JOptionPane.showMessageDialog(null,"O correspondente binário é "+seqBinaria);
       

        //Esses 2 comandos abaixos vão zerar as variaveis e deixa-los prontos para novo uso
        seqBinaria = "";
        sequencia = "";

        //FIM - CONVERTE DE DECIMAL PARA BINÁRIOS
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "Saindo do programa.");
                break;
            default: //Retorno da opção invalida
                JOptionPane.showMessageDialog(null, "Opção Inválida!");
        } //fim do Switch
        }while(menu != 3); //Condição para sair do programa
    } //fim da Main
}  //fim da Classe
