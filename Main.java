public class Main {
    public static void main(String[] args) {

        Pessoa p1 = new Pessoa("João","Masculino",56);
        Professor pr1 = new Professor("José","Masculino",36,"Engenhiero de produção",7822.67f);
        Aluno a1 = new Aluno("Gerisvaldo", "Masculino", 24,00234,"Enfermagem");
        a1.cancelarMatricula();

    }
}