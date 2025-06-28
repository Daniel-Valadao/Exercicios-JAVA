import java.util.Scanner;

/*
Exercicio 2: Receba o tamanho do lado de um quadrado, calcule sua área em metros e exiba na tela
 °formula: área = lado x lado
 */
public class Quadrado {
   public static void main(String[] args) {
   var scanner = new Scanner(System.in);
   System.out.println("Informe o valor um número: ");
   var n =scanner.nextInt();
   var r = (n*n);
   System.out.printf("O valor da área é %s métros\n", r );

   }
}
