package Lista01;

import java.util.Scanner;


/*Faça um algoritmo utilizando a representação de fluxograma que leia o peso e a altura do usuário e informa se o mesmo está obeso.
Lembre que para saber se uma pessoa está obesa deve-se utilizar a fórmula: imc = peso/altura2. Caso o resultado do imc seja maior que 30 o usuário está obeso. */

public class questao7 {
    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        System.out.println("Informe o seu Peso atual: ");
        double peso= teclado.nextFloat();
        System.out.println("Informe a sua altura atual: ");
        double altura= teclado.nextFloat();

        double imc = peso / (altura * altura);


        if(imc>30){
            System.out.println("VOCE ESTA OBESO");
        }else{
            System.out.println("Voce não é considerado obeso.");
        }


    }


}
