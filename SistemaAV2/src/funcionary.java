import java.util.Date;

public class funcionary extends Data {
    public funcionary (String cpf, String name, String DatadeNascimento, String pis, String login, String senha) {
        super(cpf, name, DatadeNascimento, pis, login, senha);
    }
    @Override // sobrescrevendo um método e não criando um novo
    public boolean Authenticator(String Login, String Senha){
        if ((this.login != Login) || (this.senha != Senha)) {
            return false;
        }
        return true;
    }
}

