import java.util.Scanner;
import java.util.Deque;
import java.util.ArrayDeque;


public class Expressao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean expressaoValida = true;

        while(true){
            Deque<Character> pilha = new ArrayDeque<>();
            System.out.println("Digite a expressão matemática (ou 'FIM' para encerrar): ");
            String expressao = scanner.nextLine();
            if(expressao.equalsIgnoreCase("FIM")) {
                System.out.println("Encerrando o programa.");
                break;
            }
            for(int i = 0; i < expressao.length(); i++) {
                char c = expressao.charAt(i);
                if(c == '(' || c == '[' || c == '{') {
                    pilha.offerFirst(c);
                }
                else if(c == ')' || c == ']' || c == '}') {
                    if(pilha.isEmpty()) {
                        System.out.println("Expressão inválida: " + expressao);
                        expressaoValida = false;
                        break;
                    }
                    else if(!isMatchingPair(pilha.pollFirst(), c)) {
                        System.out.println("Expressão inválida: " + expressao);
                        expressaoValida = false;
                        break;
                    }
                }
            }
            if(expressaoValida) {
                System.out.println("Expressão válida: " + expressao);
            }
        }
         scanner.close();
    }

    private static boolean isMatchingPair(char aberto, char fechado) {
        return (aberto == '(' && fechado == ')') ||
               (aberto == '[' && fechado == ']') ||
               (aberto == '{' && fechado == '}');
    }
}
