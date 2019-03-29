/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

public class Ex3 {
    public static void main(String args[]){
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        int num4 = 0;
        int num5 = 0;
        java.util.Scanner leitor = new java.util.Scanner(System.in);
        
        System.out.println("Insira o valor do primeiro número: ");
        num1 = leitor.nextInt();
        System.out.println("Insira o segundo valor:");
        num2 = leitor.nextInt();
        System.out.println("Insira o terceiro valor:");
        num3 = leitor.nextInt();
        System.out.println("Insira o quarto valor:");
        num4 = leitor.nextInt();
        System.out.println("Insira o quinto valor:");
        num5 = leitor.nextInt();
        
        //Se o maior for num1 e o menor x
        if (num1 > num2 && num3 >= num2 && num4 >= num2 && num5 >= num2){
            System.out.printf("O maior é: %d, e o menor é: %d: ", (num1), (num2));
        }
        else if (num1 > num3 && num2 >= num3 && num4 >= num3 && num5 >= num3){
            System.out.printf("O maior é: %d, e o menor é: %d: ", (num1), (num3));
        }
        else if (num1 > num4 && num2>=num4 && num3 >= num4 && num5 >= num4){
            System.out.printf("O maior é: %d, e o menor é: %d: ", (num1), (num4));
        }
        else if (num1 > num5 && num2 >= num5 && num3 >= num5 && num4 >= num5){
            System.out.printf("O maior é: %d, e o menor é: %d: ", (num1), (num5));
        }
        
        //Se o maior for num2 e o menor x
        else if (num2 > num1 && num3 >= num1 && num4 >= num1 && num5 >= num1){
            System.out.printf("O maior é: %d, e o menor é: %d: ", (num2), (num1));
        }
        else if (num2 > num3 && num1 >= num3 && num4 >= num3 && num5 >= num3){
            System.out.printf("O maior é: %d, e o menor é: %d: ", (num2), (num3));
        }
        else if (num2 > num4 && num1 >= num4 && num3 >= num4 && num5 >= num4){
            System.out.printf("O maior é: %d, e o menor é: %d: ", (num2), (num4));
        }
        else if (num2 > num5 && num1 >= num5 && num3 >= num5 && num4 >= num5){
            System.out.printf("O maior é: %d, e o menor é: %d: ", (num2), (num5));
        }
        
         //Se o maior for num3 e o menor x
        else if (num3 > num1 && num2 >= num1 && num4 >= num1 && num5 >= num1){
            System.out.printf("O maior é: %d, e o menor é: %d: ", (num3), (num1));
        }
        else if (num3 > num2 && num1 >= num2 && num4 >= num2 && num5 >= num2){
            System.out.printf("O maior é: %d, e o menor é: %d: ", (num3), (num2));
        }
        else if (num3 > num4 && num1 >= num4 && num2 >= num4 && num5 >= num4){
            System.out.printf("O maior é: %d, e o menor é: %d: ", (num3), (num4));
        }
        else if (num3 > num5 && num1 >= num5 && num2 >= num5 && num4 >= num5){
            System.out.printf("O maior é: %d, e o menor é: %d: ", (num3), (num5));
        }
        
         //Se o maior for num4 e o menor x
        else if (num4 > num1 && num2 >= num1 && num3 >= num1 && num5 >= num1){
            System.out.printf("O maior é: %d, e o menor é: %d: ", (num4), (num1));
        }
        else if (num4 > num2 && num1 >= num2 && num3 >= num2 && num5 >= num2){
            System.out.printf("O maior é: %d, e o menor é: %d: ", (num4), (num2));
        }
        else if (num4 > num3 && num1 >= num3 && num2 >= num3 && num5 >= num3){
            System.out.printf("O maior é: %d, e o menor é: %d: ", (num4), (num3));
        }
        else if (num4 > num5 && num1 >= num5 && num2 >= num5 && num3 >= num5){
            System.out.printf("O maior é: %d, e o menor é: %d: ", (num4), (num5));
        }
        
         //Se o maior for num5 e o menor x
        else if (num5 > num1 && num2 >= num1 && num3 >= num1 && num4 >= num1){
            System.out.printf("O maior é: %d, e o menor é: %d: ", (num5), (num1));
        }
        else if (num5 > num2 && num1 >= num2 && num3 >= num2 && num4 >= num2){
            System.out.printf("O maior é: %d, e o menor é: %d: ", (num5), (num2));
        }
        else if (num5 > num3 && num1 >= num3 && num2 >= num3 && num4 >= num3){
            System.out.printf("O maior é: %d, e o menor é: %d: ", (num5), (num3));
        }
        else if (num5 > num4 && num1 >= num4 && num2 >= num4 && num3 >= num4){
            System.out.printf("O maior é: %d, e o menor é: %d: ", (num5), (num4));
        }
        else{
            System.out.printf("São todos iguais\n");
        }
    }
    
}
