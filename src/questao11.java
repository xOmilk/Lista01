import java.util.Scanner;

/*Faça um algoritmo utilizando a representação de fluxograma que solicite ao usuário dois valores numéricos.
Em seguida o algoritmo deverá efetuar a soma dos dois valores e caso o resultado seja maior ou igual a 10,
 deve-se ser somado a 5 caso contrário o valor do resultado deverá ser subtraído de 7. Após a obtenção do resultado apresente essa informação para o usuário. */

public class questao11 {


    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("SOMA DE NUMEROS\nDigite o primeiro numero: ");
        double num1 = teclado.nextDouble();

        System.out.println("Digite o seu segundo numero: ");
        double num2 = teclado.nextDouble();

        double result = num1 + num2;

        if (result >= 10) {
            result += 5;
            System.out.println("Resultado somado com 5: " + result);

        } else {
            result -= 7;
            System.out.println("Resultado subtraído com 7: " + result);

        }
    }
}
