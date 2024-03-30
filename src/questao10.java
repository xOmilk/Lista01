import java.util.Scanner;

/*Faça um algoritmo utilizando a representação de fluxograma que solicite ao usuário dois valores numéricos.
  Em seguida o algoritmo deverá efetuar a soma dos dois valores e apresentar o resultado caso seja maior que 10. */

public class questao10 {
    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        System.out.println("Digite o primeiro numero: ");
        double num1= teclado.nextDouble();

        System.out.println("Digite o seu segundo numero: ");
        double num2= teclado.nextDouble();

        double result=num1+num2;

        if(result>10){
            System.out.println("Resultado: "+result);
        }
        else{
            System.out.println("O resultado da soma é muito baixo.");
        }
    }
}
