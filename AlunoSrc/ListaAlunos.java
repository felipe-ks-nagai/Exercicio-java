import aluno.Aluno;
import java.util.LinkedList;
import java.util.Scanner;

public class ListaAlunos {
    
    public static void main(String[] args) {
        LinkedList<Aluno> alunos = new LinkedList<>();
        String siglaSelecionada = "";
        String[] dados;
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("Digite o RA, sigla, nota e falta: ");
            Aluno aluno = new Aluno("", "", 0.0f, 0);
            dados = scanner.nextLine().split(" ");
            aluno.setRA(dados[0]);
            if(aluno.getRA().toLowerCase().equals("xxx")) break;
            aluno.setSigla(dados[1]);
            aluno.setNota(Float.parseFloat(dados[2]));
            aluno.setFalta(Integer.parseInt(dados[3]));
            alunos.add(aluno);
        }
        System.out.println("Quantidade de alunos: " + alunos.size());
        System.out.println("Lista de alunos: ");
        System.out.println("--------------------------------");
        System.out.println("RA || Sigla || Nota || Falta ");
        for(Aluno a : alunos) {
            System.out.println(a.getRA() + " - " + a.getSigla() + " - " + a.getNota() + " - " + a.getFalta());
        }
        System.out.println("--------------------------------");
        System.out.println();
        System.out.println("Informe a sigla a ser deletada: ");
        siglaSelecionada = scanner.nextLine();
        for(Aluno a : alunos) {
            if(a.getSigla().equals(siglaSelecionada)) {
                alunos.remove(a);
            }
        }
        System.out.println("Quantidade de alunos: " + alunos.size());
        System.out.println("Lista de alunos: ");
        System.out.println("--------------------------------");
        System.out.println("RA || Sigla || Nota || Falta ");
        for(Aluno a : alunos) {
            System.out.println(a.getRA() + " - " + a.getSigla() + " - " + a.getNota() + " - " + a.getFalta());
        }
        System.out.println("--------------------------------");
        System.out.println();
        scanner.close();
    }
}
