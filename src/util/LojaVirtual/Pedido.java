package util.LojaVirtual;

public class Pedido {
    private String nomeCliente;
    private Double valorPedido;
    private Integer quantidadeDeItens;
    private Boolean clientePremium;


    public void setNomeCliente(String nomeCliente) { this.nomeCliente = nomeCliente; }

    public void setValorPdeido(Double valorPedido){ this.valorPedido = valorPedido; }

    public void setQuantidadeDeItens(Integer quantidadeDeItens){ this.quantidadeDeItens = quantidadeDeItens; }

    public void setClientePremium (Boolean clientePremium){ this.clientePremium = clientePremium; }


    //calcular a media
    public double calcularMediaItem(){
        return this.valorPedido / this.quantidadeDeItens;
    }

    //classificar o pedido
    public String  classificarPedido(){
        if(valorPedido >= 500 || clientePremium){
            return "Status : Pedido Prioritário";
        }

        if (valorPedido >= 200 && valorPedido <= 499) {
            return "Status : Pedido Normal";
        }

        return "Status : Pedido Básico";
    }


    //verificar se média
    public String vericarMedia(){
        if (calcularMediaItem() > 100){
            return "Mádia por item alta";
        }

        return "Média por item baixa";
    }


    //exibir o resumo
    public void exibirResumo(){
        System.out.println("\n" + "Cliente: " + this.nomeCliente);
        System.out.println("Valor pedido: " + this.valorPedido);
        System.out.println("Quantidade itens: " + this.quantidadeDeItens);
        System.out.println("Média por item: " + this.calcularMediaItem());

        System.out.println("\n" + this.classificarPedido());

        if(this.calcularMediaItem() > 100){
            System.out.println("Média por item alta");
        }

        int comparacao = this.valorPedido.compareTo(300.0);

        System.out.println("Comparação com valor de referência: ");

        if(comparacao > 0){
            System.out.println("Pedido maior que o valor base");
        } else if(comparacao < 0) {
            System.out.println("Pedido menor que valor base");
        } else{
            System.out.println("Pedido igual ao valor base");
        }
    }
}

//colocar no main:

/*
    Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Pedido pedido = new Pedido();

        System.out.print("Digite o nome: ");
        String nomeCliente = sc.nextLine();
        pedido.setNomeCliente(nomeCliente);

        System.out.print("Valor do pedido: ");
        String stringValorPedido = sc.nextLine();
        Double valorPedido = Double.parseDouble(stringValorPedido);
        pedido.setValorPdeido(valorPedido);

        System.out.print("Quantidade de itens: ");
        String stringQuantidadeDeItens = sc.nextLine();
        Integer quantidadeDeItens = Integer.parseInt(stringQuantidadeDeItens);
        pedido.setQuantidadeDeItens(quantidadeDeItens);

        System.out.print("Cliente premium (true/false): ");
        String stringClientePremium = sc.nextLine();
        Boolean clientePremium = Boolean.parseBoolean(stringClientePremium);
        pedido.setClientePremium(clientePremium);

        pedido.exibirResumo();

        sc.close();
*/
