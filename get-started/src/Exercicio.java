/*
 1. Escreva um código que receba o nome e o ano de nascimento de alguém e imprima na tela a seguinte mensagem:
  Olá' Fulano ' você tem "x" Anos.
 */

import java.time.OffsetDateTime;
import java.util.Scanner;

public class Exercicio {

    public final static String  NEW_MESSAGE = "Olá, informe seu nome";

    public static void main(String[] args) {
    var baseYear = OffsetDateTime.now().getYear();
    var scanner = new Scanner(System.in);
    System.out.println(NEW_MESSAGE);
    String name= scanner.next();
    System.out.println("Agora informe o ano que você nasceu!");
    var year = scanner.nextInt();
    var age = baseYear-year;

    System.out.printf("Olá %s, sua idade é %s anos! \n", name , age);

    }
}
