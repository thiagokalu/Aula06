import java.util.Scanner;

public class Vetores {

	public static void main(String[] args) {
		
		//Para criar um vetor, tipo nome[]= new tipo[tamanho];
        double alunos[] = new double[10];
        double total=0;
        Scanner leitor = new Scanner(System.in);
        for(int i=0; i<10;i++) {
            System.out.println("Digite o consumo do " + (i+1) + "º aluno");
            alunos[i] = leitor.nextDouble();
            total = total + alunos[i];
        }
        for(int i=0;i<10;i++) {
            System.out.println("O aluno " + (i+1) + " consumiu R$" + alunos[i]);
        }
        System.out.println("O total de consumo foi de R$" + total);
        leitor.close();
}
}