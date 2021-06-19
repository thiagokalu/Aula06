import java.util.Scanner;

public class exercicio_Aula_06_ex04 {
    // Considere a criação de um vetor de 50 posições chamado
// vetCarrinhoValores que servirá para armazenar os valores de
// produtos comprados por um cliente, e outro vetor de 50 posições
// chamado vetCarrinhoNomes que servirá para armazenar os nomes
// de produtos comprados por um cliente.
// Crie uma estrutura de menus para que o programa tenha as seguintes
// funcionalidades:
// • Digitar o nome de um produto e seu preço. (Quando não for  case 1
// mais possível inserir itens, deve ser exibida a mensagem: “Carrinho
// cheio”)
// • Remover um produto através de seu nome. (O nome do produto case 2
// deve ser substituído por “” e o preço por 00. A posição não poderá ser
// reutilizada para armazenar novos valores)
// • Calcular o valor total da compra case 3
// • Exibir a quantidade de produtos comprados case 4
// • Exibir o nome do produto de maior valor (Em caso de produtos case 5 
// de igual valor, escolher uma das ocorrências)
// • Exibir o nome de cada produto ao lado de seu preço case 6
    
    public static void main(String[] args)
    {
        Scanner leitor = new Scanner (System.in);
    
        int opcao=0, quantidadeVetores, comprado=0;
        boolean carrinhoCheio = false;
        double valorTotalCompra=0, maiorValor=0; 
        String nomeMaiorValor = "";
        String nomeRemover = "";

        System.out.println("Informe a quantidade de produtos que poderão ser inseridos no carrinho: ");

        quantidadeVetores = leitor.nextInt();

        leitor.nextLine();

        double vetCarrinhoValores [] = new double [quantidadeVetores];
        String vetCarrinhoNomes [] = new String [quantidadeVetores];
    
        while(opcao!= 7)
            {

        
        System.out.println("\n1 Digite 1 para inserir valores. \n2 Digite 2 para Remover um produto através do nome. \n3 Digite 3 para calcular o valor total da compra. \n4 Digite 4 para exibir a quantidade de produtos comprados. \n5 Digite 5 para exibir o nome do produto de maior valor. \n6 Digite 6 para exibir o nome de cada produto ao lado de seu preço. \n7 para encerrar o Sistema");
    
    
        opcao = leitor.nextInt(); 

        leitor.nextLine();

        switch(opcao){
            
            case 1:

                if (carrinhoCheio == false)
            {
            
                for (int i =0; 
                i < quantidadeVetores; 
                i++)
                {
                    System.out.println("Digite o nome do produto:");
                    vetCarrinhoNomes[i] = leitor.nextLine();

                    System.out.println("Digite o preço do produto:");
                    vetCarrinhoValores[i] = leitor.nextDouble();

                    leitor.nextLine();

                if (vetCarrinhoValores[i] > maiorValor )
                {
                    maiorValor = vetCarrinhoValores[i];
                    nomeMaiorValor = vetCarrinhoNomes[i];
                }

                valorTotalCompra = valorTotalCompra + vetCarrinhoValores[i];
                
                comprado++;
        
                if (i == quantidadeVetores -1)
                {
                    carrinhoCheio = true;    
                    System.out.println("Não é possível inserir mais itens. O carrinho está cheio com " + quantidadeVetores + " itens.");        
                }
                
            }
        }
            else
        {
            System.out.println("Não é possível inserir mais itens. O carrinho está cheio com " + quantidadeVetores + " itens.");
        }
                break; 

            case 2: 
                System.out.println("Digite o nome do produto a ser removido:");      
               
                nomeRemover = leitor.nextLine();

                leitor.nextLine();

                    for (int i = 0; 
                         i < quantidadeVetores; 
                         i++)
                    {
                        if (nomeRemover.equalsIgnoreCase(vetCarrinhoNomes[i]))
                        {
                            valorTotalCompra = valorTotalCompra- vetCarrinhoValores[i];

                            vetCarrinhoNomes[i] = "";
                            vetCarrinhoValores[i] = 0;

                            comprado--;
                        }
                    }         
                break;      
            case 3:
                System.out.println("O valor total da compra é R$ " + valorTotalCompra);
                break;
            case 4:
                System.out.println("O carrinho possui um total de " + comprado + " produtos");
                break;
            case 5:
                System.out.println("O produto de maior valor é " + nomeMaiorValor + " e  custa: " + maiorValor);
                break;
            case 6:
                   for (int i = 0; 
                   i < quantidadeVetores; 
                   i++)
            {
                System.out.println("Produto: " + vetCarrinhoNomes[i] + " --- Valor R$ " + vetCarrinhoValores[i]);
            }
                 break;
            case 7: 
                System.out.println("Encerrando o sistema...");
                break;
            default:                     
                System.out.println("Digite uma opção válida");
                break;         
            }
        }
        leitor.close();
       
    }
}
