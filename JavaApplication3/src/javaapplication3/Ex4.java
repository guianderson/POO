/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

public class Ex4 {
    public static void main(String args[]){
        int num1;
        int num2;
        int calc;
        
        java.util.Scanner leitor = new java.util.Scanner(System.in);
        
        System.out.println("Insira o valor do primeiro número: ");
        num1 = leitor.nextInt();
        System.out.println("Insira o segundo valor:");
        num2 = leitor.nextInt();
        
        calc = num1 % num2;
        
        if (calc == 0){
            System.out.println("São multiplos");
        }
        else{
            System.out.println("Não são multiplos");
        }
    }
}
