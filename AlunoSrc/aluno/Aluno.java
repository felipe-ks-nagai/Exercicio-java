package aluno;

public class Aluno {
    private String RA;
    private String sigla;
    private float nota;
    private int falta;


    public Aluno(String RA, String sigla, float nota, int falta) {
        this.RA = RA;
        this.sigla = sigla;
        this.nota = nota;
        this.falta = falta;
    }


    public String getRA() {
        return RA;
    }
    public void setRA(String rA) {
        RA = rA;
    }
    public String getSigla() {
        return sigla;
    }
    public void setSigla(String sigla) {
        this.sigla = sigla;
    }
    public float getNota() {
        return nota;
    }
    public void setNota(float nota) {
        this.nota = nota;
    }
    public int getFalta() {
        return falta;
    }
    public void setFalta(int falta) {
        this.falta = falta;
    }

    public boolean equals(Object obj) {
        Aluno aluno = (Aluno) obj;
        return RA.equals(aluno.RA);
    }
    
}
