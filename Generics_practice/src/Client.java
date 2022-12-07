import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

public class Client {
    private String CPF;
    private String name;
    private LocalDate birthDate;
    private String phone;

    public Client(String CPF, String name, LocalDate birthDate, String phone) {
        this.CPF = CPF;
        this.name = name;
        this.birthDate = birthDate;
        this.phone = phone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Client)) return false;
        Client client = (Client) o;
        return CPF.equals(client.CPF);
    }

    @Override
    public int hashCode() {
        return Objects.hash(CPF);
    }

    @Override
    public String toString() {
        return "Nome: "+name+ " | CPF: "+CPF+ " | Data de Nascimento: "+birthDate+ " | Telefone: "+phone;
    }

    public String getCPF() {
        return CPF;
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthDate() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String dateText = this.birthDate.format(formatter);
        LocalDate parseDate = LocalDate.parse(dateText, formatter);
        return parseDate;
    }

    public String getPhone() {
        return phone;
    }
}
