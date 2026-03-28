package util.AvaliarColaboradores;

public class AvaliarColaboradores {
    private double assiduidade;
    private double produtividade;
    private double colaboracao;

    public double setAssiduidade(double assiduidade){
        return this.assiduidade = assiduidade;
    }

    public double setprodutividade(double produtividade){
        return this.produtividade = produtividade;
    }

    public double setColaboracao(double colaboracao){
        return this.colaboracao = colaboracao;
    }

   public double calcularMedia(){
       return (this.assiduidade + this.produtividade + this.colaboracao) / 3;
    }

   public boolean verificarNotas(){
       return this.assiduidade < 6 || this.produtividade < 6 || this.colaboracao < 6;

   }

   public String aptoPromocao(){
       if(calcularMedia() > 8 && verificarNotas() == false){
           return "Recebe Promoção";
       } else if (calcularMedia() < 8 && calcularMedia() > 6) {
           return "Permanece no cargo";
       } else{
           return "Plano de melhoria";
       }
   }

}

//Adicionar ao Main

/*
* Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        AvaliarColaboradores avaliarColaboradores = new AvaliarColaboradores();

        System.out.print("Nota de Assiduidade:");
        double assiduidade = sc.nextDouble();
        System.out.print("Nota de Produtividade:");
        double produtividade = sc.nextDouble();
        System.out.print("Nota de Colaboração:");
        double colaboracao = sc.nextDouble();

        avaliarColaboradores.setAssiduidade(assiduidade);
        avaliarColaboradores.setprodutividade(produtividade);
        avaliarColaboradores.setColaboracao(colaboracao);

        System.out.println(avaliarColaboradores.aptoPromocao());

        sc.close();
* */
