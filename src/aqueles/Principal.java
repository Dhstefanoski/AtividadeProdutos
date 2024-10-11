package aqueles;
import java.util.Scanner;
public class Principal {
	public static Scanner scan = new Scanner(System.in);
	public static CadastroDeProduto cadastro = new CadastroDeProduto();
	
	public static void main (String args[]) {
		System.out.println("Seja bem vindo ao sistema de cadastro de produtos!");
		int op = 0;
		do {
			menu();
			op = scan.nextInt();
			scan.nextLine();
			if(op == 1) {
				System.out.println("Digite o nome do produto");
				String nome = scan.nextLine();
				System.out.println("Digite o preço do produto");
				double preco = scan.nextDouble();
				System.out.println("Digite a quantidade do produto");
				int quant = scan.nextInt();
				Produto novoProduto = new Produto(nome, preco, quant);
				cadastro.adicionarTarefa(novoProduto);
			}
			else if(op == 2) {
	    	   cadastro.listarTarefas();
	       }
	       else if (op == 3){
	    	   System.out.println("Saindo...");
	       }
	       else {
	    	   System.out.println("Opção Invalida");
	       }
			
		}while(op != 3);
		System.out.println("Sistema encerrado, até breve.");
	}
	public static void menu() {
		System.out.println("----------------------");
	    System.out.println("1 - Cadastrar novo produto");
	    System.out.println("2 - Exibir lista de produtos");
	    System.out.println("3 - Sair do sistema");
	    System.out.println("----------------------");
	    System.out.println("Digite o número da opção desejada.");
	}
}