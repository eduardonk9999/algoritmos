package org.example;

import java.util.Scanner;

public class idade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ano em que voce nasceu: ");
        int anoNascimento = scanner.nextInt();

        System.out.println("Ano atual: ");
        int anoAtual = scanner.nextInt();

        int suaIdade = anoNascimento - anoAtual;

        System.out.println("Sua idade é: " + suaIdade);
    }
}
