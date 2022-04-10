package entities;

public class Departamento {
    //atributos
    private String cargo;

    //metodos de acesso
    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    //metodo de impressao
    public String imprimir(){
        return "Departamento: " + cargo;
    }

}
