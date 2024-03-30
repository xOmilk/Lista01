/*Faça um algoritmo utilizando a representação de fluxograma  para ler a temperatura do corpo medida com um termômetro.
 Caso a temperatura seja maior que 37 graus o paciente está com febre, caso contrário, sua temperatura está normal.
  Após ler a temperatura mostre a mensagem apropriada. */


import java.util.Scanner;


public class questao4 {
    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        System.out.println("Informe a sua temperatura: ");
        double temp= teclado.nextDouble();
        if(temp>37){
            System.out.println("VOCE ESTA COM FEBRE");
        }
        else{
            System.out.println("Temperatura Esta normal");
        }
    }

}
