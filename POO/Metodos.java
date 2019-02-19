package baja;
public class Metodos {
	/*public void alterar(Telefone x) {
		x.marca = "LG";
	}*/
	
	public double menor(int[] vetor) {
		double x = vetor[0];
		for (int i = 0; i < vetor.length; i++) {
			if(vetor[i] < x) {
				x = vetor[i]; 
			}
		}
		return x;
	}
	
	public double soma(double x, double y) {
		return x + y;
	}
	
	public double multiplicacao(double x, double y) {
		return x * y;
	}
	
	
}