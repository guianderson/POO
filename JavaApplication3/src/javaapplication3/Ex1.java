/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

public class Ex1 {
    public static void main(String args[]){
        int numero1 = 0;
        int numero2 = 0;
        int soma;
        int sub;
        int div;
        int mult;
        
        java.util.Scanner leitor = new java.util.Scanner(System.in);
        System.out.println("Bem-vindo a calculadora JAVA");
        System.out.println("Insira o valor do primeiro número: ");
        numero1 = leitor.nextInt();
        System.out.println("Insira o segundo valor:");
        numero2 = leitor.nextInt();
        
        soma = numero1 + numero2;
        sub = numero2 - numero1;
        mult = numero1 * numero2;
        
        if (numero1 > numero2){
            div = numero1 / numero2;
        }
        else{
            div = numero2 / numero1;
        }
        
        System.out.printf("O valor da soma é: %d\n",(soma));
        System.out.printf("O valor da subtração é: %d\n",(sub));
        System.out.printf("O valor da multiplicação é: %d\n",(mult));
        System.out.printf("O valor da divisão é: %d\n",(div));
    }
    
}
