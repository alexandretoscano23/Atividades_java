package util.AgenciaDePassagens;

public class AgenciaDePassagens {
    private String classe;
    private int idade;
    private boolean fidelidade;
    private static final double ECONOMICA = 200.00;
    private static final double EXECUTIVA = 500.00;
    private static final double PRIMEIRA_CLASSE = 1200.00;
    private static final double DESCONTO = 0.10;


    public String setClasse(String classe){
        return this.classe = classe;
    }

    public int setIdade(int idade){
        return this.idade = idade;
    }

    public boolean setFidelidade(boolean fidelidade){
        return this.fidelidade = fidelidade;
    }

    //calcular desconto
    public double calcularDesconto(){
        double precoFinal;

        switch (classe){
            case "Economica" :
                precoFinal = ECONOMICA;
                break;
            case "Executiva" :
                precoFinal = EXECUTIVA;
                break;

            case "Primeira classe":
                precoFinal = PRIMEIRA_CLASSE;
                break;
            default:
                precoFinal = 0;
                break;
        }

        if(idade >= 60 || fidelidade){
            precoFinal = precoFinal - (precoFinal * DESCONTO);
        }
        return precoFinal;
    }

}

//colocar no main:

/*
* Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        AgenciaDePassagens agenciaDePassagens = new AgenciaDePassagens();

        System.out.print("Classe:");
        String classe = sc.nextLine();
        agenciaDePassagens.setClasse(classe);

        System.out.println();
        System.out.print("Idade:");
        int idade = sc.nextInt();
        agenciaDePassagens.setIdade(idade);

        boolean fidelidade = false;
        agenciaDePassagens.setFidelidade(fidelidade);

        System.out.println(agenciaDePassagens.calcularDesconto());

*       sc.close();
*/
