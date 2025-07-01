import java.util.*;

public class Aluno {

  String nome;
  String matricula;
  double[] notas;

  // construtor
  public Aluno(String nome, String matricula, double[] notas) {

    this.nome = nome;
    this.matricula = matricula;
    this.notas = notas;
  }

  public String getMatricula() {
    return this.matricula;
  }

  // Usar o Static apenas quando precisar criar variaveis "locais" no metodo
  // (aqui estamos usando atributos do objeto)
  public double calcularMedia() {
    double soma = 0;
    for (int i = 0; i < notas.length; i++) {
      soma += notas[i];
    }
    return soma / notas.length;
  }

  public String situacaoAluno() {
    double media = this.calcularMedia();

    if (media >= 7.0) {
      return "Aprovado";

    } else if (media >= 5.0) {
      return "Recuperação";

    } else {
      return "Reprovado";
    }

  }

  @Override
  public String toString() {
    return "Aluno" +
        " [nome: " + this.nome +
        ", Matricula: " + this.matricula +
        ", Notas: " + Arrays.toString(this.notas) +
        ", Media: " + String.format("%.2f", this.calcularMedia()) +
        ", Situação: " + this.situacaoAluno() + "]";
  }

}
