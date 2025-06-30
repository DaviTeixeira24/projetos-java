import java.util.*;

public class SistemaAluno {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    ArrayList<Aluno> listaAlunos = new ArrayList<>();
    int opcao;

    do {

      System.out.println("======Menu======");
      System.out.println("1: Cadastrar aluno");
      System.out.println("2: Listar alunos");
      System.out.println("3: Buscar aluno por mátricula");
      System.out.println("4: Sair do menu");

      System.out.println("Escolha uma das opções do menu acima");
      opcao = scanner.nextInt();

      switch (opcao) {
        case 1: {
          break;
        }
        case 2: {
          break;
        }
        case 3: {
          break;
        }
        case 4: {
          break;
        }

        default:

          break;
      }

    } while (opcao != 4);

    scanner.close();

  }

}
