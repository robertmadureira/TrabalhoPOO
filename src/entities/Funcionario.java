package entities;

public class Funcionario {
    private int func_matricula;
    private String func_nome;
    private String func_email;
    private double func_salario;

    public Funcionario(int func_matricula, String func_nome, String func_email, double func_salario) {
        this.func_matricula = func_matricula;
        this.func_nome = func_nome;
        this.func_email = func_email;
        this.func_salario = func_salario;
    }

    public int getFunc_matricula() {
        return func_matricula;
    }

    public void setFunc_matricula(int func_matricula) {
        this.func_matricula = func_matricula;
    }

    public String getFunc_nome() {
        return func_nome;
    }

    public void setFunc_nome(String func_nome) {
        this.func_nome = func_nome;
    }

    public String getFunc_email() {
        return func_email;
    }

    public void setFunc_email(String func_email) {
        this.func_email = func_email;
    }

    public double getFunc_salario() {
        return func_salario;
    }

    public void setFunc_salario(double func_salario) {
        this.func_salario = func_salario;
    }
}
