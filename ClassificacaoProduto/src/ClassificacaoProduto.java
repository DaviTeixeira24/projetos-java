import java.util.*;

public class ClassificacaoProduto {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        double preco = 0;
        boolean encontrado = false;

        // catalogo
        String[] produtos = { "Mouse", "Teclado", "Headset" };
        System.out.println("Catálogo: " + Arrays.toString(produtos)); // imprime os itens dentro do array

        System.out.println("Digite o nome de um produto");
        String opcaoProduto = scanner.nextLine();

        for (String produto : produtos) {
            if (produto.equalsIgnoreCase(opcaoProduto)) {
                encontrado = true;
                break; // parar o laço assim que o poduto for encontrado
            }

        }

        if (encontrado) {
            System.err.println("Produto existente! Deseja atualizar o preço? (Sim/Não)");
            String resposta = scanner.nextLine();

            if (resposta.equalsIgnoreCase("sim")) {
                System.out.println("Insira um novo preço:");
                preco = scanner.nextDouble();

            } else {
                System.out.println("Preço não atualizado!");
                scanner.close();
                return;
            }

        } else {
            System.out.println("Produto não catalogado! Insira o preço do novo produto:");
            preco = scanner.nextDouble();

        }

        if (preco < 50) {
            System.out.println("Classificação: barato");
        } else if (preco >= 50 && preco <= 100) {
            System.out.println("Classificação: moderado");
        } else {
            System.out.println("Classificação: Caro");
        }

        System.out.println("Produto: " + opcaoProduto + ". Preço: " + preco);

        scanner.close();
    }
}
