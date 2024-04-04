package Lista01;/*Faça um algoritmo utilizando a representação de fluxograma que solicite ao usuário sua idade e informe se o mesmo já pode tirar carteira de motorista.
  O usuário somente poderá tirar a carteira de motorista se a idade for maior que 18 anos. */

import java.util.Scanner;

public class questao3 {
    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        System.out.println("Informe a sua idade: ");
        int idade=teclado.nextInt();

        if(idade>=18){
            System.out.println("Voce já pode tirar a carteira de motorista!");
        }
        else {
            System.out.println("Voce não pode tirar a carteira de motorista!");
        }


    }


}
