package principal;

import java.util.ArrayList;


public class ExemploUsoArgumentos {
	

	public static void main(String[] args) {
		ArrayList<String> items = new ArrayList<String>(); 
		
		items.add("vermelho");
		items.add(0,"amarelo");
		
		System.out.println("Mostre a lista com os itens: ");
		for(int i = 0; i< items.size(); i++) {
			System.out.printf("%s ",items.get(i));
		}
		
		System.out.println("\n");
		exibe(items, "Elementos atuais: ");
		
		System.out.println();
		System.out.println("Adicionando novos elementos: ");
		items.add("verde");
		items.add("amarelo");
		
		System.out.printf("Lista com novos elementos: ");
		exibe(items, "");
		
		System.out.println("\nRemover elemento: ");
		items.remove("amarelo");
		exibe(items, "Remove o primeiro elemento (amarelo):");
		
		items.remove(1);
		exibe(items, "Remove o segundo elemento (verde):");
		
		System.out.printf("\nVerifica cor vermelha esta na lista\n");
		System.out.printf("vermelho esta %s na lista \n",items.contains("vermelho")?"":"não");
		
		System.out.printf("\nExibe o tamanho da lista\n");
		System.out.printf("Tamanho: %s \n",items.size());
	}
	
	public static void exibe(ArrayList<String> items, String texto) {
		System.out.printf(texto);
		
		for(String item : items) {
			System.out.printf(" %s ",item);
		}
		System.out.println();
	}
}
