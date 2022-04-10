package entities;

public class Faturamento{
    //atributos
    private double venda;

    //metodos de acesso
    public double getVendas() {
        return venda;
    }
    public void setVenda(double venda) {
        this.venda = venda;
    }

    //metodo de impressao
    public String imprimir(){
        return "Vendas: " + venda;
    }
}
