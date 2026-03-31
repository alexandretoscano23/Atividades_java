package util.ControleAcademia;

// controle dos alunos que podem treinar numa academia

public class ControleAcademia {
    private int idade;
    private boolean pagamentoEmDia;
    private boolean possuiAtestado;
    private boolean restricaoMedica;

    public int setIdade(int idade){
        return this.idade = idade;
    }

    public boolean setPagamentoEmDia(boolean pagamentoEmDia){
        return this.pagamentoEmDia = pagamentoEmDia;
    }

    public boolean setPossuiAtestado(boolean possuiAtestado){
        return this.possuiAtestado = possuiAtestado;
    }

    public boolean setRestricaoMedica(boolean restricaoMedica){
        return this.restricaoMedica = restricaoMedica;
    }

    public String verificacaoAcademia(){
        if(!pagamentoEmDia || !possuiAtestado){
            return "Não pode treinar";
        } else if(idade < 16){
            return "Precisa autorização responsável.";
        } else if (idade >= 60 || restricaoMedica) {
            return "Treino supervisionado obrigatório.";
        } else{
            return "Pode trinar";
        }
    }
}

//colocar no main:

/*
 Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        ControleAcademia controleAcademia = new ControleAcademia();

        System.out.print("Idade: ");
        int idade = sc.nextInt();
        sc.nextLine();

        System.out.print("Pagamento em dia? : ");
        String respostaPagamentoEmDia = sc.nextLine();

        System.out.print("Possui atestado? : ");
        String respostaPossuiAtestado = sc.nextLine();

        System.out.print("Possui restrição médica? : ");
        String respostaRestricaoMedica = sc.nextLine();

        boolean pagamentoEmDia = respostaPagamentoEmDia.equals("s");
        boolean possuiAtestado = respostaPossuiAtestado.equals("s");
        boolean restricaoMedica = respostaRestricaoMedica.equals("s");

        controleAcademia.setIdade(idade);
        controleAcademia.setPagamentoEmDia(pagamentoEmDia);
        controleAcademia.setPossuiAtestado(possuiAtestado);
        controleAcademia.setRestricaoMedica(restricaoMedica);

        System.out.println(controleAcademia.verificacaoAcademia());


        sc.close();

*/

