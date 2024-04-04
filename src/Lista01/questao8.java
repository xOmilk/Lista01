package Lista01;

import java.util.Scanner;

//Faça um algoritmo utilizando a representação de fluxograma que calcule a área de uma circunferência e apresente a medida da área calculada
//        Sabe-se que para realizar o cálculo da área de uma circunferência é necessário utilizar a seguinte a seguinte fórmula:
//        A = Pi*r² .  O valor do Raio será informado pelo usuário.

public class questao8 {

    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        double PI=3.14;
        System.out.println("Informe o valor do raio da circunferência que deseja descobrir a area: ");
        double raio= teclado.nextDouble();

        double area= PI*(raio*raio);

        System.out.println("O valor da Area da circunferência é:"+area);


    }
}
