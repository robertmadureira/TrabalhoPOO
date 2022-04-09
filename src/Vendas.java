public class Vendas extends Funcionario{
    private int vend_id;
    private double vend_vendas;

    public Vendas(int func_id, String func_nome, String func_email, double func_salario, int vend_id, double vend_vendas) {
        super(func_id, func_nome, func_email, func_salario);
        this.vend_id = vend_id;
        this.vend_vendas = vend_vendas;
    }

    public int getVend_id() {
        return vend_id;
    }

    public void setVend_id(int vend_id) {
        this.vend_id = vend_id;
    }

    public double getVend_vendas() {
        return vend_vendas;
    }

    public void setVend_vendas(double vend_vendas) {
        this.vend_vendas = vend_vendas;
    }
}
