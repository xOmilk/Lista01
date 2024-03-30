import java.util.Scanner;

/*Construa um algoritmo utilizando a representação de fluxograma que calcule e informe a quantidade de gasolina que será preciso colocar no carro e
quanto irá custar para o seu dono ir até a sua fazenda.
 O usuário deverá informar a distância que será percorrida e o preço do litro da gasolina. Para o cálculo, sabe-se que o carro faz em média 12 km/litro. */


public class questao2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe a distância que será percorrida (em km): ");
        double distancia = teclado.nextDouble();

        System.out.println("Informe o preço do litro da gasolina: ");
        double precoGasolina = teclado.nextDouble();

        final double consumoCarro = 12;


        double quantidadeGasolina = distancia / consumoCarro;


        double custoViagem = quantidadeGasolina * precoGasolina;

        System.out.println("Serão necessários " + quantidadeGasolina + " litros de gasolina.");
        System.out.println("O custo total da viagem será de R$" + custoViagem);

    }

}
