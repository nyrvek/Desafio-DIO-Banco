public class ClienteBanco {
    private String name;
    private String cpf;

    public ClienteBanco(String name,String cpf){
        this.name = name;
        this.cpf = cpf;
    }
    public String getName(){
        return  name;
    }
    public  String getCpf(){
        return cpf;
    }
}
