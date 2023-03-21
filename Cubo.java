package entidades;

public class Cubo {
	private int largura;
	private int altura;
	private int profundidade;

	
	//Construtores
	public Cubo() {
	}

	public Cubo(int largura, int altura){
		this.largura = largura;
		this.altura = altura;
		profundidade = 10;
	}

	public Cubo(int largura, int altura, int profundidade) {
		this.largura = largura;
		this.altura = altura;
		this.profundidade = profundidade;
	}
	
	//Calculo do Volume
	public int calculoDoVolume(){
		return (largura * altura * profundidade);
	}
	
	//Getters and Setters
	public int getLargura() {
		return largura;
	}

	public void setLargura(int largura) {
		this.largura = largura;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public int getProfundidade() {
		return profundidade;
	}

	public void setProfundidade(int profundidade) {
		this.profundidade = profundidade;
	}
}
