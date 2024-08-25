public class ContaBanco {
    private static int coutertAcounts = 0000;
    private int acountNumber;
    private double balance;
    private ClienteBanco cliente;

    public ContaBanco(ClienteBanco cliente){
        this.cliente = cliente;
        this.acountNumber = coutertAcounts++;
        this.balance = 0.0;
    }
    public int getAcountNumber(){
        return acountNumber;
    }
    public double getBalance(){
        return balance;
    }
    public void deposit(double value){
        if (value>0){
            balance += value;
        }else {
            System.out.println("O valor de depósito tem que ser maior que 0");
        }
    }
    public  void witdraw(double value){
        if(value< balance){
            balance -= value;
        }else{
            System.out.println("Saldo insuficiente ou valor inválido.");
        }
    }
    public void showAcount(){
        System.out.println("Conta:"+ acountNumber +" | Cliente: "+ cliente.getName()+" | Saldo:"+ getBalance());
    }
}
