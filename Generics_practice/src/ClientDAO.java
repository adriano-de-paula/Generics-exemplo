import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class ClientDAO implements GenericDAO<Client, String> {

    private Map<String,Client> dataBase;

    public ClientDAO(){
        dataBase = new LinkedHashMap<>();
    }


    @Override
    public void insert(Client newClient) {
        if (newClient == null) throw new NullPointerException("Cliente não pode ser nulo");
        dataBase.put(newClient.getCPF(), newClient);
    }

    @Override
    public Client findOne(String cpf) {
        return dataBase.get(cpf);
    }

    @Override
    public List<Client> findAll() {
        return new ArrayList<>(dataBase.values());
    }

    @Override
    public void update(Client client) {
        if (client == null) throw new NullPointerException("Cliente não pode ser nulo");
        dataBase.replace(client.getCPF(), client);
    }

    @Override
    public void remove(String cpf) {
        dataBase.remove(cpf);
    }
}
