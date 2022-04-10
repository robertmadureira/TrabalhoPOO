package entities;

public class Funcionario {
    //atributos
    private int matricula;
    private String nome;
    private double salario;
    private Departamento dpto;
    private Faturamento fatu;

    //construtores
    public Funcionario() {
        this.dpto = new Departamento();
        this.fatu = new Faturamento();
    }

    public Funcionario(int matricula, String nome, double salario) {
        this.matricula = matricula;
        this.nome = nome;
        this.salario = salario;
        this.dpto = new Departamento();
        this.fatu = new Faturamento();
    }

    public Funcionario(int matricula, String nome, double salario, Departamento dpto, Faturamento fatu) {
        this.matricula = matricula;
        this.nome = nome;
        this.salario = salario;
        this.dpto = dpto;
        this.fatu = fatu;
    }

    //métodos de acesso
    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Departamento getDpto() {
        return dpto;
    }

    public void setDpto(Departamento dpto) {
        this.dpto = dpto;
    }

    public Faturamento getFatu() {
        return fatu;
    }

    public void setFatu(Faturamento fatu) {
        this.fatu = fatu;
    }

    //impressao de dados
    public String imprimir(){
        return "Matricula: " + matricula + "\nNome: " + nome + "\nSalario: " + salario
                + "\n" + dpto.imprimir() + "\n" + fatu.imprimir();
    }
}
