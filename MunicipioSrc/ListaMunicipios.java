import municipio.Municipio;
import java.util.ArrayList;
import java.util.Scanner;

public class ListaMunicipios {    
    public static void main(String[] args) {
        double idhSelecionado;
        Scanner scanner = new Scanner(System.in);
        String[] dados;

        ArrayList<Municipio> municipios = new ArrayList<>();
        while (true) {
            Municipio municipio = new Municipio("", 0, 0.0f, 0.0);
            System.out.println("Digite o nome do municipio, população, área e idh: ");
            dados = scanner.nextLine().split(" ");
            municipio.setNome(dados[0]);
            if(municipio.getNome().toLowerCase().equals("xxx")) break;
            municipio.setPopulacao(Integer.parseInt(dados[1]));
            municipio.setArea(Float.parseFloat(dados[2]));
            municipio.setIdh(Double.parseDouble(dados[3]));
  
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
