package org.example;

import java.util.Scanner;

public class BemVindo {
//    Faça um programa que leia o nome de uma pessoa e mostre uma mensagem de boas-vindas para ela.

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nome;

        System.out.println("Digite seu nome:");

        nome = teclado.nextLine();
        teclado.close();

        System.out.println("Bem vindo " + nome);


    }

}
