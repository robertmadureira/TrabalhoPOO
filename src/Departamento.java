public class Departamento extends Funcionario{
    private int depa_id;
    private String depa_nome;

    public Departamento(int func_id, String func_nome, String func_email, double func_salario, int depa_id, String depa_nome) {
        super(func_id, func_nome, func_email, func_salario);
        this.depa_id = depa_id;
        this.depa_nome = depa_nome;
    }

    public int getDepa_id() {
        return depa_id;
    }

    public void setDepa_id(int depa_id) {
        this.depa_id = depa_id;
    }

    public String getDepa_nome() {
        return depa_nome;
    }

    public void setDepa_nome(String depa_nome) {
        this.depa_nome = depa_nome;
    }
}
