public class Aluno extends Pessoa{
    private int matricula;
    private String curso;

    public Aluno(String nome, String sexo, int idade, int m, String c){
        super(nome, sexo, idade);
        setMatricula(m);
        setCurso(c);
    }
    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void cancelarMatricula(){
        System.out.println(getNome()+", sua matrícula está cancelada, você tem até 3(TRÊS) dias úteis para mudar de ideia!!!");
        this.setMatricula(0);
    }
}
