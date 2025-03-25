package org.example;

import java.util.Scanner;

public class MediaAluno {
    public static void main(String[] args) {
        // NOTA1 + NOTA2, SOMADASNOTAS / 2 = MÉDIA

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a nota do aluno 1: ");
        int notaUm = scanner.nextInt();

        System.out.println("Digite a nota do aluno 2: ");
        int notaDois = scanner.nextInt();

        int somaNotas = notaUm + notaDois;
        double mediaNotas = somaNotas / 2;

        System.out.println("A media dos dois alunos é: " + mediaNotas);
    }
}
