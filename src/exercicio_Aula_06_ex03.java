import java.util.Random;
import java.util.Scanner;

public class exercicio_Aula_06_ex03 {


//     Faça um algoritmo que gere aleatoriamente através de um laço
// de repetição PARA um vetor de 50 elementos inteiros (entre 0 - 9),
// calcule e exiba:
// • A quantidade de números entre 3 e 7;
// • Quantidade de números pares;
// • A quantidade de números menores que 3;
// • Quantidade de números ímpares.
// Obs.: O vetor com os 50 elementos deve ser impresso na tela
// também. 
    
    public static void main(String[] args){
       
        Scanner leitor = new Scanner (System.in);
    
        System.out.println("Por favor, digite a quantidade de elementos que serão criados no vetor:");

        int quantidadeVetores = leitor.nextInt();
        
        int vetores [] = new int [quantidadeVetores];

        int entre=0, menor=0, pares=0, impares=0;
        
        Random geradorVetores = new Random();

        for (int i=0;
        i<quantidadeVetores;
        i++){
            vetores[i] = geradorVetores.nextInt(9); 

            System.out.println(vetores[i]);   

       if (vetores[i] > 3 && vetores[i]<7 )
       {
         entre++;
        }
       if (vetores[i] <3 ) {
           menor++;
       }
       if (vetores[i] % 2 ==0){
           pares++;
       }
       else
       {
           impares++;
       }
       
    }
    System.out.println("O total de numeros entre 3 e 7 é de " + entre);

    System.out.println("Existem " + menor + " numeros menores que 3");

    System.out.println("Existem " + pares + " numeros pares e " + impares + " numeros impares");
 
    leitor.close();
    }
}