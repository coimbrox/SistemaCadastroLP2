import java.util.Date;
import java.util.Scanner;

public class client extends Data {

    private String Address;
    private String Origin;
    private String Destiny;
    private String Value;
    //construtor

    public client ( String Address, String Origin, String Destiny, String Value, String cpf, String name) {
        super(cpf, name);
        this.Address = Address;
        this.Origin = Origin;
        this.Destiny = Destiny;
        this.Value = Value;
    }

    //get e set

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getOrigin() {
        return Origin;
    }

    public void setOrigin(String origin) {
        Origin = origin;
    }

    public String getDestiny() {
        return Destiny;
    }

    public void setDestiny(String destiny) {
        Destiny = destiny;
    }

    public String getValue() {
        return Value;
    }

    public void setValue(String value) {
        Value = value;
    }
}
