import aluno.Aluno;
import java.util.LinkedList;
import java.util.Scanner;

public class ListaAlunos {
    
    public static void main(String[] args) {
        LinkedList<Aluno> alunos = new LinkedList<>();
        String siglaSelecionada = "";
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("Digite o RA, sigla, nota e falta: ");
            Aluno aluno = new Aluno("", "", 0.0f, 0);
            aluno.setRA(scanner.nextLine());
            if(aluno.getRA().toLowerCase().equals("xxx")) break;
            aluno.setSigla(scanner.nextLine());
            while(true){
                aluno.setNota(scanner.nextFloat());
                if(aluno.getNota() < 0 || aluno.getNota() > 10) {
                    System.out.println("Nota inválida, tem que ser mais que 0 e menos que 10");
                    scanner.nextLine();
                }else{
                    break;
                }
            }
            while(true){
                aluno.setFalta(scanner.nextInt());
                if(aluno.getFalta() < 0) {
                    System.out.println("Falta inválida");
                    scanner.nextLine();
                }else{
                    break;
                }
            }
            scanner.nextLine();
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
