/*Faça um algoritmo utilizando a representação de fluxograma que solicite ao usuário 2 números diferentes e mostre o maior deles. */

import java.util.Scanner;
public class questao5 {
    public static void main(String[] args) {

        Scanner teclado= new Scanner(System.in);
        System.out.println("Informe um numero: ");
        int num1= teclado.nextInt();

        System.out.println("Informe um outro num: ");
        int num2= teclado.nextInt();

        int maior;
        if(num1>num2){
            maior  =num1;
            System.out.println("Maior num: "+maior);
        } else if (num1==num2) {
            System.out.println("Numero iguais");
        }else{
            maior=num2;
            System.out.println("Maior num: "+maior);
        }

    }
}
