package municipio;

public class Municipio {
    private String nome;
    private int populacao;
    private float area;
    private double idh;


    public Municipio(String nome, int populacao, float area, double idh) {
        this.nome = nome;
        this.idh = idh;
        this.populacao = populacao;
        this.area = area;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPopulacao() {
        return populacao;
    }

    public void setPopulacao(int populacao) {
        this.populacao = populacao;
    }

    public float getArea() {
        return area;
    }

    public void setArea(float area) {
        this.area = area;
    }
    public double getIdh() {
        return idh;
    }
    public void setIdh(double idh) {
        this.idh = idh;
    }
    
    public boolean equals(Object obj) {
        Municipio municipio = (Municipio) obj;
        return nome.equals(municipio.nome);
    }

}
