/*
Exercicio 4 : Escreva um código que receba o nome e a idade de 2 pessoas e imprima a diferença de idade entre elas.
 */

import java.util.Scanner;

public class diferencaIdade {
    public static void main(String[] args) {
     var scanner = new Scanner(System.in);
     System.out.println("Digite o nome da primeira pessoa: ");
     var name1 = scanner.nextLine();
     System.out.println("Digite a idade da primeira pessoa: ");
     var age1 = scanner.nextInt();
     System.out.println("Digite o nome da Segunda pessoa: ");
     scanner =  new Scanner(System.in);
     var name2 = scanner.nextLine();
     System.out.println("Digite a idade da Segunda pessoa: ");
     var age2 = scanner.nextInt();
     var dif = age1-age2;
     System.out.printf("A diferença de idade de %s para %s é de: %s anos!\n", name1, name2, dif);

    }
}
