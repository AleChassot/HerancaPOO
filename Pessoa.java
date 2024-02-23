public class Pessoa {
    private String nome, sexo;
    private int idade;

    public Pessoa(String nome, String sexo, int idade) {
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void fazerAniver(){
        System.out.println("Nome: "+this.getNome());
        System.out.print("FELIZ ANIVERSÁRIOOOO");
        this.setIdade(this.getIdade()+1);
        System.out.println(" DE "+this.getIdade());
    }
    public void status(){
        System.out.println("Nome: "+getNome());
        System.out.println("Sexo: "+getSexo());
        System.out.println("Idade: "+getIdade());
    }
}
