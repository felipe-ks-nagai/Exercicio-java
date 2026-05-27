import municipio.Municipio;
import java.util.ArrayList;
import java.util.Scanner;

public class ListaMunicipios {    
    public static void main(String[] args) {
        double idhSelecionado;
        Scanner scanner = new Scanner(System.in);

        ArrayList<Municipio> municipios = new ArrayList<>();
        while (true) {
            Municipio municipio = new Municipio("", 0, 0.0f, 0.0);
            System.out.println("Digite o nome do municipio, população, área e idh: ");
            municipio.setNome(scanner.nextLine());
            if(municipio.getNome().toLowerCase().equals("xxx")) break;
            municipio.setPopulacao(scanner.nextInt());
            municipio.setArea(scanner.nextFloat());
            municipio.setIdh(scanner.nextDouble());
            scanner.nextLine();
            municipios.add(municipio);
            System.out.println("Quantidade de municipios: " + municipios.size());
           
        }
        System.out.println("Informe o IDH a ser filtrado:");
        idhSelecionado = scanner.nextDouble();
        System.out.println();
        System.out.println("Lista de municipios: ");
        System.out.println("--------------------------------");
        System.out.println("Nome || População || Area || IDH ");
        for(Municipio m : municipios) {
            
            System.out.println(m.getNome() + " - " + m.getPopulacao() + " - " + m.getArea() + " - " + m.getIdh());
        }
        System.out.println("");
        System.out.println("IDH <= " + idhSelecionado);
        System.out.println("--------------------------------");
        for(Municipio m : municipios){
            if(m.getIdh() <= idhSelecionado){
                System.out.println(m.getNome() + " - " + m.getPopulacao() + " - " + m.getArea() + " - " + m.getIdh());
            }
        }
        System.out.println();
        scanner.close();
    }
}
