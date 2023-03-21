package principal;

import entidades.Cubo;

public class Principal {

	public static void main(String[] args) {
		Cubo cuboObj1, cuboObj2, cuboObj3;
		
		//instância de objeto sem com construtor padrão
		cuboObj1 = new Cubo();
		
		//instância de objeto sem com construtor com 2 parâmetros
		cuboObj2 = new Cubo(10, 20); 
		
		//instância de objeto sem com construtor com 3 parâmetros
		cuboObj3 = new Cubo(10, 20, 30); 

		System.out.println("Volume do cubo1: "+cuboObj1.calculoDoVolume());
		System.out.println("Volume do cubo2: "+cuboObj2.calculoDoVolume());
		System.out.println("Volume do cubo3: "+cuboObj3.calculoDoVolume());
	}

}
