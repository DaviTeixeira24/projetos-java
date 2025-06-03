package Contador;

import java.util.Scanner;

public class Contador {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite o primeiro parâmatro");
    int parametro1 = scanner.nextInt();

    System.out.println("Digite o segundo parâmetro");
    int parametro2 = scanner.nextInt();

    try {

      contar(parametro1, parametro2);

    } catch (ParametrosInvalidosException e) {
      System.out.println(e.getMessage());
    }
    scanner.close();
  }

  static void contar(int parametro1, int parametro2) throws ParametrosInvalidosException {

    if (parametro1 > parametro2) {
      throw new ParametrosInvalidosException("Erro: O segundo parâmetro deve ser maior que o primeiro");
    }

    for (int contagem = parametro1; contagem <= parametro2; contagem++) {
      System.out.println(contagem);
    }
  }
}
