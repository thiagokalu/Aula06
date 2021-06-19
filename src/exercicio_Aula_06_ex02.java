import java.util.Scanner;

public class exercicio_Aula_06_ex02 {

//     2. O professor Wuni Jim Yensonal precisa de um programa para
// ajudar com um problema simples: para uma turma com 50 alunos
// precisa calcular a média da sala e descobrir quais são os alunos que
// precisarão de um atendimento personalizado. O fluxo do programa
// deve ser o seguinte:
// A. Digitar as 50 notas em um vetor e, para cada nota digitada,
// digitar o nome do aluno correspondente em outro vetor
// B. Calcular a média das notas digitadas
// C. Para cada uma das notas que foi digitada e ficou abaixo da
// média, exibir uma mensagem que diga “Chamar o aluno para
// conversar”

   
public static void main(String[] args){
    Scanner leitor = new Scanner (System.in);
    
    System.out.println("Por favor, digite a quantidade de alunos que serão listados:");
    
    int quantidadeAlunos;
    
    quantidadeAlunos = leitor.nextInt();
    leitor.nextLine();
    
    double notas[] = new double [quantidadeAlunos];
    String nomes[] = new String [quantidadeAlunos];
    double media=0;
// A. Digitar as 50 notas em um vetor e, para cada nota digitada,
// digitar o nome do aluno correspondente em outro vetor

    for (int i=0;
        i<quantidadeAlunos;
        i++){
            System.out.println("Digite o nome do Aluno " + (i+1));
            nomes[i] = leitor.nextLine();
            System.out.println("Digite a nota do Aluno " + (i+1));
            notas[i] = leitor.nextDouble();
            media = media + notas[i];
            leitor.nextLine();
        }
          // B. Calcular a média das notas digitadas
        //para calcular a média, sugiro fazer um loop para ir somando as notas e fora do loop dividir pela quantidade de notas;)
        //para essa etapa, sugiro percorrer o vetor, olhando cada uma das posições e comparando com a média, se for menor exibir
        //a mensagem.
        media = media / quantidadeAlunos;
        System.out.println("A média é " + media);
        //C. Para cada uma das notas que foi digitada e ficou abaixo da
        // média, exibir uma mensagem que diga “Chamar o aluno para
        // conversar”      
        for (int i=0;
            i<quantidadeAlunos;
            i++){
                if (notas[i]<media){
                    System.out.println("Chamar o aluno " + nomes[i] + " para conversar pois a nota foi " + notas[i]);
                }

            }
        
     } 
    }


