import java.util.Scanner;

public class Professor extends Pessoa {
    private String especialidade;
    private float salario;

    public String getEspecialidade() {
        return especialidade;
    }

    public Professor(String nome, String sexo, int idade, String especialidade, float salario) {
        super(nome, sexo, idade);
        this.especialidade = especialidade;
        this.salario = salario;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public void aumentoSalario(){
        Scanner tec = new Scanner(System.in);
        float aumento;
        System.out.println("Qual o valor do aumento:");
        aumento = tec.nextFloat();
        this.setSalario(this.getSalario()+aumento);
        System.out.println("Salário atualizado: R$"+this.getSalario());
    }
}

