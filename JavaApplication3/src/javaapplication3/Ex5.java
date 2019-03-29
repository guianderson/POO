/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

public class Ex5 {
    public static void main(String args[]){
       double sal_p_semana = 200.00;
		double porcent = 0.09;
		double comis;
		double total;
		java.util.Scanner leitor = new java.util.Scanner(System.in);
                
                System.out.println("Insira o valor total de vendas na semana: ");
		double vendas = leitor.nextInt();
		
		comis = vendas * porcent;
		
		total = comis + sal_p_semana;
		
                System.out.printf("Valor das Vendas: %.1f\n Valor da comissão: %.1f\n Total a receber: %.1f\n", (vendas), (comis), (total));
		
	}
}
