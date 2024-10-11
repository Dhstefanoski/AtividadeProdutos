package aqueles;
import java.util.ArrayList;
import java.util.Scanner;

import java.util.List;


public class CadastroDeProduto {
	public static Scanner scan = new Scanner(System.in);
	public static List<Produto> lista = new ArrayList<Produto>();
	public void listarTarefas() {
		if (lista.isEmpty()) {
			System.out.println("A lista está vazia.");
		}
		else {
			for(int i=0;i<lista.size(); i++) {
				int j = i + 1;
				System.out.println("------------------------------");
	    		System.out.println(""+ j + "° Produto");
	    		System.out.println(lista.get(i));
			}
		}
	}
	
	public void adicionarTarefa(Produto produto) { 
		lista.add(produto);
	}
	
}
