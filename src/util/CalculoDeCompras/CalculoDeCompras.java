package util.CalculoDeCompras;

public class CalculoDeCompras {
    private double produto1;
    private double produto2;
    private double produto3;
    private boolean clienteVip;
    private String formaDePagamento;

    public double setProduto1(double produto1){
        return this.produto1 = produto1;
    }

    public double setProduto2(double produto2){
        return this.produto2 = produto2;
    }

    public double setProduto3(double produto3){
        return this.produto3 = produto3;
    }

    public boolean setClienteVip(boolean clienteVip){
        return this.clienteVip = clienteVip;
    }

    public String setFormaDePagamento(String formaDePagamento){
        return this.formaDePagamento = formaDePagamento;
    }

    public String calcularPagamento(){
        double total = produto1 + produto2 + produto3;
        double descontoPix = 0.10;
        double descontoDinheiro = 0.05;

        switch (formaDePagamento){
            case "pix":
                total -= (total * descontoPix);
                break;
            case "cartão":
                break;
            case "dinheiro":
                total -= (total * descontoDinheiro);
                break;
        }

        if(total > 500 && formaDePagamento.equals("pix")){
           total -= (total * 0.05);
            return "Total: " + total;

        } else if (total > 1000 || clienteVip) {
            return "Total " + total + " - frete gratis";
        }

        return "Total: " + total;

    }


}

//colocar no main :

/*
     Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        CalculoDeCompras calculoDeCompras = new CalculoDeCompras();

        System.out.print("Preço do produto 1: ");
        double produto1 = sc.nextDouble();

        System.out.print("Preço do produto 2: ");
        double produto2 = sc.nextDouble();

        System.out.print("Preço do produto 3: ");
        double produto3 = sc.nextDouble();
        sc.nextLine();

        System.out.print("Qual a forma de pagamento? :");
        String formaDePagamento = sc.nextLine();

        System.out.print("É cliente vip? :");
        String respostaClienteVip = sc.nextLine();

        boolean clienteVip = respostaClienteVip.equals("s");

        calculoDeCompras.setProduto1(produto1);
        calculoDeCompras.setProduto2(produto2);
        calculoDeCompras.setProduto3(produto3);
        calculoDeCompras.setClienteVip(clienteVip);
        calculoDeCompras.setFormaDePagamento(formaDePagamento);

        System.out.println(calculoDeCompras.calcularPagamento());


        sc.close();
* */
