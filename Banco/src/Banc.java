import java.util.ArrayList;
import  java.util.List;
public class Banc {
    private  List<ContaBanco> contas;

    public  Banc(){
        contas = new ArrayList<>();
    }
    public ContaBanco creatAcount(ClienteBanco cliente){
        ContaBanco newAcount = new ContaBanco(cliente);
        contas.add(newAcount);
        return  newAcount;
    }
    public  ContaBanco searchAcount(int acountNumber) {
        for (ContaBanco conta : contas) {
            if (conta.getAcountNumber() == acountNumber) {
                return conta;
            }
        }
        return  null;
    }
    public  void showAllAcounts(){
        for (ContaBanco conta : contas){
            conta.showAcount();
        }
    }

}
