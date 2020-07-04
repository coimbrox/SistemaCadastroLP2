import java.util.Date;
import java.util.Scanner;

public class van  {
   private String Chassi;
    private String Placa;

    public van (String Chassi, String Placa) {
        this.Chassi = Chassi;
        this.Placa = Placa;
    }

    public String getChassi() {
        return Chassi;
    }

    public void setChassi(String chassi) {
        Chassi = chassi;
    }

    public String getPlaca() {
        return Placa;
    }

    public void setPlaca(String placa) {
        Placa = placa;
    }
}
