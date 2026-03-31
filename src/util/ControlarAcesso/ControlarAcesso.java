package util.ControlarAcesso;

public class ControlarAcesso {
    private String login;
    private String senha;

    public String setLogin(String login){
        return this.login = login;
    }

    public String setSenha(String senha){
        return this.senha = senha;
    }

    public String verificarAcesso(){
        if (login.equals("root") && senha.equals("toor")) {
            return "Sempre administrador";
        } else {
            return "Funcionário / Visitante";
        }
    }
}

//Colocar no main:

/*
Scanner sc = new Scanner(System.in);

        ControlarAcesso controlarAcesso = new ControlarAcesso();

        System.out.print("Login: ");
        String login = sc.nextLine();
        controlarAcesso.setLogin(login);

        System.out.print("Senha: ");
        String senha = sc.nextLine();
        controlarAcesso.setSenha(senha);

        System.out.println(controlarAcesso.verificarAcesso());
*/
