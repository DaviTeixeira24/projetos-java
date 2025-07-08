# Sistema de Gerenciamento de Alunos

Projeto desenvolvido com o objetivo de praticar conceitos fundamentais de programação orientada a objetos (POO) em Java, utilizando entrada de dados via terminal e manipulação de listas dinâmicas com `ArrayList`.

## Funcionalidades

- Cadastro de alunos com nome, matrícula gerada automaticamente e múltiplas notas
- Listagem de todos os alunos cadastrados
- Busca de aluno por matrícula
- Cálculo automático da média de notas
- Exibição da situação do aluno (Aprovado, Recuperação ou Reprovado)
- Validação de entradas básicas

## Tecnologias e recursos utilizados

- Linguagem: Java 17+
- Terminal (CLI)
- IDEs recomendadas: Visual Studio Code, Eclipse ou IntelliJ IDEA
- Conceitos aplicados:
- Programação orientada a objetos
- Estrutura de repetição e decisão
- Tratamento de exceções (`try-catch`)
- Vetores e listas (`Array` e `ArrayList`)
- Modularização com métodos
- Boas práticas de organização de código

## Estrutura do projeto

SistemaGerenciamentoAlunos/  
├── Aluno.java  
├── SistemaAluno.java

## Como executar

1. Clone o repositório:

```bash
git clone https://github.com/DaviTeixeira24/projetos-java.git
```

2. Navegue até o diretório do projeto

```bash
   cd projetos-java/SistemaGerenciamentoAlunos
```

3. Compile os arquivos

```bash
javac SistemaAluno.java Aluno.java
```

4. Execute a aplicação

```bash
java SistemaAluno
```

## Exemplo de uso no Terminal

```bash
======Menu======
1: Cadastrar aluno
2: Listar alunos
3: Buscar aluno por matrícula
4: Sair do menu
Escolha uma das opções do menu acima:

```

## Considerações

- A matricula é gerada automaticamente com oito digitos numéricos.
- O múmero de notas cadastradas é definido pelo usuário no momento do registro.
- O sistema pode ser expandido com funcionalidades adicionais, como edição remoção de alunos ou integração com banco de dades e interface gráfica

### Autor

Davi Teixeira  
[GitHub: DaviTeixeira24](https://github.com/DaviTeixeira24)

### Observações

Este é um projeto básico com foco no desenvolvimento da lógica de programação e nos fundamentos da linguagem Java.
