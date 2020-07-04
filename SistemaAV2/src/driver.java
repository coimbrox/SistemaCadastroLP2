import java.util.Date;
import java.util.Scanner;

public class driver extends Data {
    private int rota;
     private int cnh;
    public driver (int rota, int cnh, String cpf, String name, String DatadeNascimento, String pis, String login, String senha) {
        super(cpf, name, DatadeNascimento, pis, login, senha);
        this.rota = rota;
        this.cnh = cnh;
    }
   //get e set
    public int getRota() {
        return rota;
    }

    public void setRota(int rota) {
        this.rota = rota;
    }

    public int getCnh() {
        return cnh;
    }

    public void setCnh(int cnh) {
        this.cnh = cnh;
    }

    // Metodo authenticator
    @Override // sobrescrevendo um método e não criando um novo
    public boolean Authenticator(String Login, String Senha){
        if ((this.login != Login) || (this.senha != Senha)) {
            return false;
        }
        return true;
    }
}



