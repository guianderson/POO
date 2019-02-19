package baja;

public class Teste {
	public static void main(String[] args) {
		Telefone tel = new Telefone();
		tel.marca = "Motorola";
		Telefone tel2 = new Telefone();
		tel2.marca = "Sony";

		Telefone[] tels = new Telefone[2];
		tels[0] = tel;
		tels[1] = tel2;
		
		System.out.println(tels[1].marca);

		
		
		
		
		
		
		
		
		/*
		 * int[] numeros = { 2, 6, 8, 12, 45 }; int x = 10; int y = 30; Metodos m = new
		 * Metodos(); System.out.println(x);
		 */

	}
}