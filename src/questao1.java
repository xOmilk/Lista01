import java.util.Scanner;

public class questao1 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner (System.in);
        double entrada, salario;
        int horas;

        System.out.println("A quantidade de horas trabalhadas no mes");
        horas= teclado.nextInt();

        salario=(horas*20);

        System.out.println("O salario do operador : " +salario);





    }

}
