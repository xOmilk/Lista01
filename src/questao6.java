import java.util.Scanner;


/*Faça um algoritmo utilizando a representação de fluxograma que solicite ao usuário as notas de 2 provas e um trabalho e que seja capaz de calcular a média aritmética.
Caso a média final seja maior ou igual a 7 mostre a mensagem “aprovado”, caso contrario, imprimir a mensagem reprovado”. */


public class questao6 {
    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        int soma=0, media=0;

        for(int i=1;i<=3;i++){
            System.out.println("Digite a nota da "+i+" Forma avaliativa: ");
            soma+= teclado.nextInt();
            if(i==3){
                media=soma/i;
            }
        }
        System.out.println("A media aritmetica é:"+media);


    }

}
