import java.util.Scanner;

public class Exercicio_Aula_06_ex_01 {

// // //     /*Faça um programa que permita ao usuário digitar 30 atividades
// // //     que ele realizou no dia. Ao final, o programa deve possibilitar que o
// // //     usuário escolha se quer exibir as atividades na ordem em que digitou
// // //     ou em ordem reversa.*/ 

public static void main(String[] args){


		String atividades[] = new String[3];
        Scanner leitor = new Scanner(System.in);
        int ordem;
        //Para digitar as atividades, vamos usar um for
        for(int i=0; i<atividades.length;i++) {
            System.out.println("Por favor, insira a " + (i+1) + "ª atividade realizada hoje");
            atividades[i] = leitor.nextLine();
        }
        System.out.println("Você deseja exibir as atividades na ordem de digitação ou em ordem reversa?\n1-ORDEM 2-ORDEM INVERSA");
        ordem = leitor.nextInt();
        switch(ordem) {
        case 1:
            //Em ordem
            for(int i=0;i<atividades.length;i++) {
                System.out.println(atividades[i]);
            }
            break;
        case 2:
            //Inversa
            for(int i=atividades.length-1; i>=0;i--) {
                System.out.println(atividades[i]);
            }
            break;
        default:
            System.out.println("Opção inválida");
            break;
        }
    }
}










// // // import java.util.Scanner;

// // // public class exercicio_Aula_06_ex01 {

// // //     /*Faça um programa que permita ao usuário digitar 30 atividades
// // //     que ele realizou no dia. Ao final, o programa deve possibilitar que o
// // //     usuário escolha se quer exibir as atividades na ordem em que digitou
// // //     ou em ordem reversa.*/ 

// // // 	public static void main(String[] args){

// // //         String atividade[] = new String [5];
// // //         int escolha;
// // //         System.out.println("Este programa irá armazenar 5 atividades e depois exibi-las na ordem digitada ou inversa");
        
// // //         Scanner leitor = new Scanner (System.in);
        
// // //         for (int i=0; 
// // //                  i<5; 
// // //                  i++){
// // //                     System.out.println("Digite a atividade: " + (i+1) + "atividade realizada");
// // //                     atividade[i] = leitor.next();
// // //             }

// // //         System.out.println("Digite 1 para ordem normal ou 2 para exibir em ordem reversa");
// // //         escolha = leitor.nextInt();

        
// // //         if  (escolha == 1){
            
// // //             for (int i=0;
// // //              i>atividade.length;
// // //              i--){
// // //                 System.out.println("Atividade " + i + " foi " + atividade[i]);
// // //              }
// // //             }
// // //             else if (escolha ==2)
// // //             {
// // //                 for (int i=5;
// // //                      i>5;
// // //                      i--)
// // //                      {
// // //                 System.out.println("Atividade " + i + " foi " + atividade[i]);
// // //             }
// // //         }else{
// // //             System.out.println("Opção inválida");

// // //         }
// // //     }
// // // }