package util.Funcionario;

public class Funcionario {
    public String nome;
    public double salario;
    static final double aumento = 0.10;

    public Funcionario(String nome, double salario){
            this.nome = nome;
            this.salario = salario;
    }

    public void calcularAumento(){
        System.out.println(salario += (salario * aumento));
    }


}

// adicionar ao Main

/*
public static void main(String[] args){
        Funcionario funcionario = new Funcionario("Alexandre", 2000.00);
        System.out.println("Salário: " + funcionario.salario);
        System.out.print("Salário com o aumento: ");
        funcionario.calcularAumento();
    }
*/