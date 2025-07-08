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
      scanner.nextLine();

      switch (opcao) {
        case 1: {
          cadastrarAluno(scanner, listaAlunos);
          break;
        }
        case 2: {
          listarAlunos(listaAlunos);
          break;
        }
        case 3: {
          buscarAluno(scanner, listaAlunos);
          break;
        }
        case 4: {

          System.out.println("Encerrando Operação ...");
          break;
        }

        default:
          System.out.println("Erro: Escolha uma opção valida!");
          break;
      }

    } while (opcao != 4);

    scanner.close();

  }

  /**
   * 
   * @param scanner     Scanner para entrada de dados
   * @param listaAlunos Lista onde o aluno será adicionado
   * @return O aluno criado
   */
  public static Aluno cadastrarAluno(Scanner scanner, ArrayList<Aluno> listaAlunos) {
    // criando nome
    String nome = "";
    do {
      System.out.println("Digite o nome do aluno:");
      nome = scanner.nextLine();
      if (nome.trim().isEmpty()) {
        System.out.println("Preencha o campo vazio!");
      }
    } while (nome.trim().isEmpty());

    // criando matricula
    String matricula = "";
    matricula = gerarMatricula();
    System.out.println("Matricula gerada com sucesso!");

    // criando notas
    boolean entradaValida;
    int quantidade = 0;
    // verificando quantidade de notas
    do {
      try {
        System.out.println("Digite a quantidade de notas a serem registradas:");
        quantidade = scanner.nextInt();
        scanner.nextLine();
        entradaValida = true;
      } catch (InputMismatchException e) {
        System.out.println("Erro: Não digite (,) ou (.) os numeros são inteiros!");
        scanner.nextLine();
        entradaValida = false;
      }
    } while (!entradaValida);

    // verificando as notas
    double[] notas = new double[quantidade];
    for (int i = 0; i < quantidade; i++) {
      do {
        System.out.println("Digite a nota " + (i + 1) + ":");
        entradaValida = true;
        try {
          notas[i] = scanner.nextDouble();
          if (notas < 0 || notas > 10) {
            System.out.println("Erro: A nota deve estar entre 0 e 10.");
            entradaValida = false;
            continue;
          }
          entradaValida = true;
        } catch (InputMismatchException e) {
          System.out.println("Erro: Não utilize (.), para pular de casa decimal utilize (,) ");
          scanner.nextLine();
          entradaValida = false;
        }
      } while (!entradaValida);

    }

    // criando aluno e adicionando a lista
    System.out.println("Aluno cadastrado com sucesso!");
    Aluno novoAluno = new Aluno(nome, matricula, notas);

    System.out.println("Adicionando à lista!");
    listaAlunos.add(novoAluno);

    return novoAluno;
  }

  /**
   * 
   * @return Gera uma matrícula(ID) para cada aluno criado
   */
  public static String gerarMatricula() {
    Random random = new Random();
    StringBuilder matricula = new StringBuilder();

    for (int i = 0; i < 8; i++) {
      int digito = random.nextInt(10); // numerod de 0 a 9
      matricula.append(digito);
    }

    return matricula.toString();
  }

  /**
   * 
   * @param listaAlunos Lista onde os alunos estão adicionados
   * 
   */
  public static void listarAlunos(ArrayList<Aluno> listaAlunos) {

    if (listaAlunos.isEmpty()) {
      System.out.println("Nenhum aluno cadastrado.");
    } else {
      for (Aluno aluno : listaAlunos) {
        System.out.println(aluno);
      }
    }
  }

  /**
   * 
   * @param scanner     Scanner para entrada de dados
   * @param listaAlunos Lista onde os alunos estão adicionados
   * 
   * 
   */
  public static void buscarAluno(Scanner scanner, ArrayList<Aluno> listaAlunos) {
    boolean matriculaValida;
    String matriculaDigitada = "";
    if (listaAlunos.isEmpty()) {
      System.out.println("Nenhum aluno Registrado!");
    } else {
      do {
        System.out.println("Digite a matrícula do aluno: ");
        matriculaDigitada = scanner.nextLine();
        if (matriculaDigitada.length() == 8) {
          exbirAlunoPorMatricula(matriculaDigitada, listaAlunos);
          matriculaValida = true;

        } else {
          System.out.println("Erro: Digite um numero inteiro de 8 digitos");
          matriculaValida = false;

        }
      } while (!matriculaValida);
    }

  }

  /**
   * @param matriculaDigitada Matricula passada como dados no Scanner
   * @param listaAlunos       Lista onde os alunos foram adicionados
   * 
   * 
   */
  static void exbirAlunoPorMatricula(String matriculaDigitada, ArrayList<Aluno> listaAlunos) {
    boolean alunoEncontrado = false;
    for (Aluno aluno : listaAlunos) {
      if (matriculaDigitada.equals(aluno.getMatricula())) {
        System.out.println(aluno);
        alunoEncontrado = true;
        break;
      }
    }
    if (!alunoEncontrado) {
      System.out.println("Matricula nao encontrada!");
    }

  }
}
