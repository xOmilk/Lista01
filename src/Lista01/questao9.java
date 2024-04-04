package Lista01;

import java.util.Scanner;

/*Faça um algoritmo utilizando a representação de fluxograma que calcule o salário líquido de um professor.
Para elaborar o programa, é necessário solicitar do usuário alguns dados, tais como valor da hora aula, número de horas trabalhadas no mês,
 percentual de desconto do INSS.  Em primeiro, deve-se estabelecer o seu salário bruto para fazer o desconto e ter o valor do salário líquido. */

public class questao9 {
    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        double sal_bruto=0, sal_liquido=0;

        System.out.println("Olá professor\nInforme o valor da hora aula: ");
        double hora_aula= teclado.nextDouble();

        System.out.println("Informe a quantidade de horas trabalhadas no mês: ");
        int horas_trabalhadas= teclado.nextInt();

        System.out.println("Qual o percentual de desconto do INSS? ");
        double per_desconto= teclado.nextDouble();

        sal_bruto=(horas_trabalhadas*hora_aula);
        double descontoINSS = sal_bruto * (per_desconto / 100.0);
        sal_liquido = sal_bruto - descontoINSS;


        System.out.println("O salario bruto é: "+sal_bruto +"\t O liquido é:"+sal_liquido);

    }
}
