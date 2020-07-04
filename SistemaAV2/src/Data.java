import java.util.Date;

//classe abstrata irá conter os dados/atributos que se repetem
public abstract class Data {
    public static int Matricula = 1;
    private String cpf;
    private String name;
    private String DatadeNascimento;
    private String pis;
    String login;
    String senha;   //se nao n consigo acessar em outra classe


//construtor com todos os atributos (driver e funcionary)
public Data (String cpf, String name, String DatadeNascimento, String pis, String login, String senha) {
    this.cpf = cpf;
    this.name = name;
    this.DatadeNascimento = DatadeNascimento;
    this.pis = pis;
    this.login = login;
    this.senha = senha;
}
//construtor com cpf e nome   (client)
    public Data (String cpf, String name) {
        this.cpf = cpf;
        this.name = name;
        }

        // get matricula com ++ para somar mais um
        public static int getMatricula() {
            return Matricula++;
        }
        // get e set dos outros atributos
        public String getCpf() {
            return cpf;
        }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDatadeNascimento() {
        return DatadeNascimento;
    }

    public void setDatadeNascimento(String datadeNascimento) {
        DatadeNascimento = datadeNascimento;
    }

    public String getPis() {
        return pis;
    }

    public void setPis(String pis) {
        this.pis = pis;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
// Método para autenticador
    public boolean Authenticator(String Login, String Senha){
        if ((this.login != Login) || (this.senha != Senha)) {
            return false;
        }
        return true;
    }





}
