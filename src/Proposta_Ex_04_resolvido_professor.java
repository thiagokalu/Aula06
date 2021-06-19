import java.util.Scanner;

public class Proposta_Ex_04_resolvido_professor {/*
													 * Considere a cria��o de um vetor de 50 posi��es chamado
													 * vetCarrinhoValores que servir� para armazenar os valores de
													 * produtos comprados por um cliente, e outro vetor de 50 posi��es
													 * chamado vetCarrinhoNomes que servir� para armazenar os nomes de
													 * produtos comprados por um cliente.
													 */
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		double vetCarrinhoValores[] = new double[50];
		String vetCarrinhoNomes[] = new String[50];
		int opcao=0;
		int posicao=0;//vari�vel para guardar a posi��o do carrinho
		//Crie uma estrutura de menus para que o programa tenha as seguintes funcionalidades:
		while(opcao!=7) {
		System.out.println("\n\n\n\nSUPER LOJA MASSA SUPIMPA\n");
		System.out.println("1 - Inserir produto no carrinho");
		System.out.println("2 - Remover produto do carrinho");
		System.out.println("3 - Calcular total da compra");
		System.out.println("4 - Exibir quantidade de itens");
		System.out.println("5 - Exibir produto mais caro");
		System.out.println("6 - Exibir carrinho completo");
		System.out.println("7 - Sair do sistema");
		opcao = leitor.nextInt();
		leitor.nextLine();//Gambiarra para trabalharmos com o nextLine depois

		switch(opcao) {
		case 1:
		//� Digitar o nome de um produto e seu pre�o. (Quando n�o for mais poss�vel inserir itens, deve ser exibida a mensagem: �Carrinho cheio�)
		if (posicao < vetCarrinhoNomes.length) {
		System.out.println("Por favor, informe o nome do produto");
		vetCarrinhoNomes[posicao] = leitor.nextLine();
		System.out.println("Por favor, informe o pre�o do produto");
		vetCarrinhoValores[posicao] = leitor.nextDouble();
		leitor.nextLine(); //Gambiarra
		posicao = posicao + 1; //Atualizamos a posi��o do carrinho
		}else {
		System.out.println("O carrinho est� cheio");
		}
		break;
		case 2:
		//� Remover um produto atrav�s de seu nome. (O nome do produto deve ser substitu�do por �� e o pre�o por 00. A posi��o n�o poder� ser reutilizada para armazenar novos valores)
		String nome;
		System.out.println("Qual o nome do produto que ser� removido?");
		nome = leitor.nextLine();
		for(int i=0;i<posicao;i++) {
		if (vetCarrinhoNomes[i].equalsIgnoreCase(nome)) {
		vetCarrinhoNomes[i] = "";
		vetCarrinhoValores[i] = 0;
		}
		}
		break;
		case 3:
		//� Calcular o valor total da compra
		double total=0.0;
		for(int i=0; i<posicao;i++) {
		total = total + vetCarrinhoValores[i];
		}
		System.out.println("O valor total do carrinho � R$" + total);
		break;
		case 4:
		//� Exibir a quantidade de produtos comprados
		int qtde = 0;
		for(int i=0;i<posicao;i++) {
		if (!vetCarrinhoNomes[i].equals("")) {
		qtde = qtde + 1;
		}
		}
		System.out.println("O carrinho tem " + qtde + " produtos inseridos");
		break;
		case 5:
		//� Exibir o nome do produto de maior valor (Em caso de produtos de igual valor, escolher uma das ocorr�ncias)
		int posicaoDoMaior = 0; //Vamos usar para guardar a posi��o onde est� o produto mais caro

		for(int i=0;i<posicao;i++) {
		if (vetCarrinhoValores[i]>vetCarrinhoValores[posicaoDoMaior]) {
		posicaoDoMaior = i;
		}
		}
		System.out.println("O produto mais caro � o " + vetCarrinhoNomes[posicaoDoMaior] + " com um pre�o de R$" + vetCarrinhoValores[posicaoDoMaior]);

		break;
		case 6:
		//� Exibir o nome de cada produto ao lado de seu pre�o
		System.out.println("ITEM -- NOME -- PRE�O");
		for(int i=0;i<posicao;i++) {
		if(!vetCarrinhoNomes[i].equals("")) {
		System.out.println((i+1) + " -- " + vetCarrinhoNomes[i] + " -- R$" + vetCarrinhoValores[i]);
		}
		}

		break;
		case 7:
		System.out.println("Encerrando sistema");
		break;
		default:
		System.out.println("Op��o inv�lida!");
		break;



		}
		}



		}
	