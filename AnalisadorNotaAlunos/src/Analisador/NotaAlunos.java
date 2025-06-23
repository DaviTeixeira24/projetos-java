package Analisador;

import java.util.Scanner;

public class NotaAlunos {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    boolean continuar = true;

    do {
      System.out.println("Digite o Nome do aluno");
      String aluno = scanner.nextLine();

      System.out.println("Digite quantas matérias o aluno tem(usar numeros inteiros): ");
      int quantidade = scanner.nextInt();
      double[] notas = new double[quantidade];

      double soma = 0;
      double maior = Double.MIN_VALUE; // menor valor positivo que um double pode ter
      double menor = Double.MAX_VALUE; // maior valor positivo que um double pode ter

      for (int i = 0; i < quantidade; i++) {
        System.out.println("Digite a nota " + (i + 1) + ":");
        notas[i] = scanner.nextDouble();

        soma += notas[i];

        if (notas[i] > maior)
          maior = notas[i];
        if (notas[i] < menor)
          menor = notas[i];
      }
      scanner.nextLine();

      double media = soma / quantidade;

      System.out.println("Aluno: " + aluno);
      System.out.println("Média do aluno: " + media);
      System.out.println("Sua maior nota foi: " + maior);
      System.out.println("Sua menor nota foi: " + menor);
      if (media >= 7) {
        System.out.println("Arpovado");
      } else {
        System.out.println("Reprovado");
      }

      System.out.println("Deseja analisar outro aluno? (S/N)");
      String opcao = scanner.nextLine();

      switch (opcao.toUpperCase()) {
        case "S": {
          continuar = true;
          break;
        }
        case "N": {
          continuar = false;
          break;
        }
        default: {
          System.out.println("Opção invalida, encerrando.");
          continuar = false;
        }
      }

    } while (continuar);

    scanner.close();
  }
}
