package org.example;

import java.util.Scanner;

public class Funcionario {
    public static void main(String[] args) {
    //Crie um programa que leia o nome e o salário de um funcionário, mostrando no final uma mensagem.

       Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Digite seu salario: ");
        int salario = scanner.nextInt();

        System.out.println("Seu nome: " + nome + " seu salario: " + salario);

        scanner.close();

    }
}
