package entities;
import java.util.ArrayList;
import java.util.Scanner;

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
    public void setMatricula(int matricula) { this.matricula = matricula; }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) { this.nome = nome; }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) { this.salario = salario; }
    public Departamento getDpto() {
        return dpto;
    }
    public void setDpto(Departamento dpto) { this.dpto = dpto; }
    public Faturamento getFatu() {
        return fatu;
    }
    public void setFatu(Faturamento fatu) {
        this.fatu = fatu;
    }

    //metodos
    public int menu(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Menu: ");
        System.out.println("1 - Adicionar funcionario");
        System.out.println("2 - Imprimir funcionario");
        System.out.print("Opção: ");
        int aux = sc.nextInt();
        return aux;
    }

    public void addFuncionario(ArrayList<Funcionario> listafuncionario) {
        Scanner sc = new Scanner(System.in);
        Scanner scString = new Scanner(System.in);

        Funcionario f = new Funcionario();
        Departamento dpto = new Departamento();
        Faturamento fatu = new Faturamento();

        System.out.println("** Cadastre os dados **");
        System.out.print("Matricula: "); f.setMatricula(sc.nextInt());
        System.out.print("Nome: "); f.setNome(scString.nextLine());
        System.out.print("Salario: "); f.setSalario(sc.nextDouble());
        System.out.print("Departamento: "); dpto.setCargo(scString.nextLine());
        System.out.print("Vendas: "); fatu.setVenda(sc.nextDouble());
        f.setDpto(dpto);
        f.setFatu(fatu);
        listafuncionario.add(f);
    }

    public String imprimir() {
        return "Matricula: " + getMatricula() + "\nNome: " + getNome() + "\nSalario: " + getSalario()
                + "\n" + dpto.imprimir() + "\n" + fatu.imprimir();
    }
}