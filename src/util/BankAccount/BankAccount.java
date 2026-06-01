package util.BankAccount;

public class BankAccount {
    private int number;
    private String holder;
    private double balance;

    public BankAccount(int number, String holder){
        this.number = number;
        this.holder = holder;
    }

    public BankAccount(int number, String holder, double initialDeposit){
        this.number = number;
        this.holder = holder;
        deposit(initialDeposit);
    }

    public int getNumber() {
        return number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount){
        balance += amount;
    }

    public void withdraw(double amount){
        balance -= amount + 5.0;
    }

    public String toString(){
        return "Account: "
               + number
               + ", Holder: "
               + holder
               + ", Balance: $ "
               + String.format("%.2f", balance);
    }
}

/*
 Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        BankAccount bankAccount;

        System.out.print("Enter account number: ");
        int number = sc.nextInt();

        System.out.print("Enter account holder: ");
        sc.nextLine();
        String holder = sc.nextLine();

        System.out.print("Is there an initial deposit (y/n)? ");
        char response = sc.next().charAt(0);

        if(response == 'y' || response == 'Y'){
            System.out.println("Enter inicial deposit value: ");
            double initialDeposit = sc.nextDouble();
            bankAccount = new BankAccount(number,holder,initialDeposit);
        } else{
            bankAccount = new BankAccount(number,holder);
        }

        System.out.println();
        System.out.print("Account data: ");
        System.out.println(bankAccount);

        System.out.println();
        System.out.print("Enter a deposit value: ");
        double depositValue = sc.nextDouble();
        bankAccount.deposit(depositValue);
        System.out.println("Updated account data: ");
        System.out.println(bankAccount);

        System.out.println();
        System.out.print("Enter a withdraw value: ");
        double withdrawValue = sc.nextDouble();
        bankAccount.withdraw(withdrawValue);
        System.out.println("Updated account data: ");
        System.out.println(bankAccount);


        sc.close();
 * */
