/*Exercicio 3: Escreve um código que receba a base e altura de um retângulo e exiba na tela, calcule sua área .
        °Formula: área = base x altura.

 */
import java.util.Scanner;

public class areaRetangulo {
    public static void main(String[] args) {
       var  Scanner  = new Scanner(System.in);
       System.out.println("Digite o valor da base do retângulo: ");
       double base = Scanner.nextDouble();
       System.out.println("Digite o valor da altura do retângulo: ");
       double altura = Scanner.nextDouble();
       var area = (base*altura);
       System.out.printf("O valor da área é %s\n ", area);


    }
}
