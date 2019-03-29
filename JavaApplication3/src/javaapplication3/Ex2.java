/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

public class Ex2 {
    public static void main(String args[]){
        int numero1 = 0;
        int numero2 = 0;
        int soma;
        int media;
        java.util.Scanner leitor = new java.util.Scanner(System.in);
        
        System.out.println("Insira o valor do primeiro número: ");
        numero1 = leitor.nextInt();
        System.out.println("Insira o segundo valor:");
        numero2 = leitor.nextInt();
        
        soma = numero1 + numero2;
        media = soma / 2;
        
        if (numero1 > numero2){
            System.out.printf("O maior número é: %d\n",(numero1));
            System.out.printf("O menor número é: %d\n",(numero2));
            System.out.printf("O valor da soma é: %d\n",(soma));
            System.out.printf("O valor da média é: %d\n",(media));
        }
        else{
            System.out.printf("O maior número é: %d\n",(numero2));
            System.out.printf("O menor número é: %d\n",(numero1));
            System.out.printf("O valor da soma é: %d\n",(soma));
            System.out.printf("O valor da média é: %d\n",(media));
        }
    } 
}
