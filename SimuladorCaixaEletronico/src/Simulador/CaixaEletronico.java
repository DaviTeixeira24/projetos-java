package Simulador;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CaixaEletronico {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int opcao;
    double saldo = 0;
    double saque;

    do {

      System.out.println("Escola uma das opções do menu:");
      System.out.println("======Menu======");
      System.out.println("1: Ver saldo");
      System.out.println("2: Depositar valor");
      System.out.println("3: Sacar valor");
      System.out.println("4: Sair");

      System.out.println("Digite uma das Opções acima: ");
      opcao = scanner.nextInt();

      switch (opcao) {
        case 1: {
          System.out.println("Seu saldo atual é: " + saldo + "R$");
          break;
        }

        case 2: {
          boolean entradaValida;
          do {
            try {
              System.out.println("Digite o valor que deseja depositar: ");
              double novoSaldo = scanner.nextDouble();
              saldo += novoSaldo;
              entradaValida = true;
            } catch (InputMismatchException e) {
              System.out.println("Erro: Digite o valor de forma correta(ex: 240,50)");
              scanner.nextLine();
              entradaValida = false;
            }
          } while (!entradaValida);
          break;
        }

        case 3: {
          boolean entradaValida;

          do {

            try {
              System.out.println("Digite o valor à ser retirado: ");
              saque = scanner.nextDouble();

              transacao(saldo, saque);
              saldo -= saque;

              System.out.println("Saque realizado com sucesso!");
              entradaValida = true;

            } catch (SaldoInsuficienteException e) {
              System.out.println(e.getMessage());
              entradaValida = false;

            } catch (InputMismatchException e) {
              System.out.println("Erro: Digite o valor de forma correta(ex: 240,50)");
              scanner.nextLine();
              entradaValida = false;
            }

          } while (!entradaValida);

          break;
        }

        case 4: {
          System.out.println("Saindo do menu!");
          break;
        }

        default:
          break;
      }

    } while (opcao != 4);

    scanner.close();
  }

  static void transacao(double saldo, double saque) throws SaldoInsuficienteException {
    if (saque > saldo) {
      throw new SaldoInsuficienteException("Erro: Saldo Insuficiente!");
    }

  }
}
