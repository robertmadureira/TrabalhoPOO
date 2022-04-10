package application;

import entities.Departamento;
import entities.Faturamento;
import entities.Funcionario;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner scString = new Scanner(System.in);

        //Objeto Funcionario, Departamento e Faturamento
        Funcionario f = new Funcionario();
        Departamento dpto = new Departamento();
        Faturamento fatu = new Faturamento();

        //dados funcionario
        System.out.print("Digite a matricula: ");
        f.setMatricula(sc.nextInt());
        System.out.print("Digite o nome: ");
        f.setNome(scString.nextLine());
        System.out.print("Digite salario: ");
        f.setSalario(sc.nextDouble());

        //dados departamento
        System.out.print("Digite o departamento: ");
        dpto.setCargo(scString.nextLine());

        //dados daturamento
        System.out.print("Digite o total de vendas: ");
        fatu.setVenda(sc.nextDouble());

        //associação entre funcionario, departamento e faturamento
        f.setDpto(dpto);
        f.setFatu(fatu);

        //impressão de dados
        System.out.println("Dados do Funcionario: " + f.imprimir());
    }
}
