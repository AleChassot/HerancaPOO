import java.util.Scanner;

public class Funcionario extends Pessoa{
    private String setor;
    private boolean trabalhando;

    public Funcionario(String nome, String sexo, int idade, String setor, boolean trabalhando){
        super(nome,sexo,idade);
        setSetor(setor);
        setTrabalhando(trabalhando);
    }
    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public boolean isTrabalhando() {
        return trabalhando;
    }

    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }

    public void mudarSetor(){
        Scanner tec = new Scanner(System.in);
        System.out.println("Nome do funcionário: "+this.getNome());
        System.out.println("Setor atual: "+this.getSetor());
        System.out.println("--------------------------------------");
        System.out.println("Digite o novo setor: ");
        this.setSetor(tec.nextLine());
    }
}
