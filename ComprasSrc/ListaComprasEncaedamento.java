import java.util.Scanner;
import comprasEncadeamento.ComprasEncadeamento;
import java.util.LinkedList;

public class ListaComprasEncaedamento {
    public static void main(String[] args) {
        LinkedList<ComprasEncadeamento> compras = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        String[] dados;
        while(true){
            ComprasEncadeamento compra = new ComprasEncadeamento("", 0, false);
            System.out.println("Digite o comando (I para incluir, A para atualizar, X para excluir: ");
            dados = scanner.nextLine().split(" ");
            if(dados[0].toUpperCase().equals("FIM")){
                System.out.println("Fim do programa | " + compras.stream().filter(ComprasEncadeamento::isComprado).count() + " itens comprados");
                break;
            } 
            switch(dados[0].toUpperCase()) {
                case "I": // Inclusão
                    compra.setNome(dados[1]);
                    compra.setQuantidade(Integer.parseInt(dados[2]));
                    compra.setComprado(false);
                    compras.addLast(compra);
                    break;
                case "A": // Atualização
                    boolean itemAtualizado = false;
                    for (ComprasEncadeamento c : compras) {
                        if(c.getNome().equals(dados[1]) && !c.isComprado()) {
                            c.setComprado(true);
                            itemAtualizado = true;
                            break;
                        }
                    }
                    if(itemAtualizado) {
                        System.out.println("Atualizou  " + dados[1]);
                    } else {
                        System.out.println("Item " + dados[1] + " não encontrado ou já comprado!");
                    }
                    break;
                case "X": // Exclusão
                    for(ComprasEncadeamento c : compras) {
                        if(c.getNome().equals(dados[1])) {
                            compras.remove(c);
                            break;
                        }
                    }
                    System.out.println("Removeu " + dados[1]);
                    break;
                case "P": // Lista
                    if(dados[1].toUpperCase().equals("F")) {
                        compras.sort((c1, c2) -> c1.getNome().compareTo(c2.getNome()));
                        System.out.println("Lista de itens do início");
                    } // Ordem alfabetica crescente
                    else if(dados[1].toUpperCase().equals("R")){
                        compras.sort((c1, c2) -> c2.getNome().compareTo(c1.getNome())); 
                        System.out.println("Lista de itens do fim");
                    } // Ordem alfabetica decrescente
                    System.out.println("--------------------------------");
                    System.out.println("Nome || Quantidade || Comprado ");
                    System.out.println("--------------------------------");
                    for(ComprasEncadeamento c : compras) {
                        System.out.println(c.getNome() + " - " + c.getQuantidade() + " - " + c.isComprado());
                    }
                    System.out.println("--------------------------------");
                    System.out.println("Total de itens: " + compras.size() + " | Total de itens comprados: " + compras.stream().filter(ComprasEncadeamento::isComprado).count());
                    break;
            }
        }
    }
}
