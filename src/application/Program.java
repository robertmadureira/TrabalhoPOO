package application;

import entities.Funcionario;
import java.util.ArrayList;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean condicao = false;
        int aux, op = 10;

        Funcionario f = new Funcionario();
        ArrayList<Funcionario> listafuncionario = new ArrayList();

        while (op != 0) {
            op = f.menu();
            if (op == 1) {
                while (!condicao) {
                    f.addFuncionario(listafuncionario);
                    System.out.print("Quer adicionar mais funcionarios? 1 = sim / 2 = não ");
                    aux = sc.nextInt();
                    if (aux == 2)
                        condicao = true;
                }
            } else if (op == 2) {
                for (int i = 0; i < listafuncionario.size(); i++) {
                    Funcionario lf = listafuncionario.get(i); // sem casting!
                    System.out.println(lf.imprimir());
                }
            } else if (op == 3){
                System.out.print("Digite o numero da matricula do funcionario que deseja excluir: ");
                int temp = sc.nextInt();
                for (int i = 0; i < listafuncionario.size(); i++) {
                    Funcionario lf = listafuncionario.get(i); // sem casting!
                    if(temp == lf.getMatricula())
                        listafuncionario.remove(i);
                    else
                        System.out.println("Funcionario não encontrado");
                }
            } else {
                System.out.println("Opção invalida");
            }
        }
        //fim
    }
}

