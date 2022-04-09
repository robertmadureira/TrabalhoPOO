package entities;

public class Vendas extends Funcionario {
    private double vend_totalVendas;

    public Vendas(int func_matricula, String func_nome, String func_email, double func_salario, double vend_totalVendas) {
        super(func_matricula, func_nome, func_email, func_salario);
        this.vend_totalVendas = vend_totalVendas;
    }

    public double getVend_totalVendas() {
        return vend_totalVendas;
    }

    public void setVend_totalVendas(double vend_totalVendas) {
        this.vend_totalVendas = vend_totalVendas;
    }

}
