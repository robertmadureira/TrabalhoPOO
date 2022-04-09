package entities;

public class Departamento extends Funcionario {
    private String depa_nome;

    public Departamento(int func_matricula, String func_nome, String func_email, double func_salario, String depa_nome) {
        super(func_matricula, func_nome, func_email, func_salario);
        this.depa_nome = depa_nome;
    }

    public String getDepa_nome() {
        return depa_nome;
    }

    public void setDepa_nome(String depa_nome) {
        this.depa_nome = depa_nome;
    }
}
