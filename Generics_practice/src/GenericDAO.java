import java.util.List;

public interface GenericDAO<T,K> {

    public void insert(T newClient);

    public T findOne(K cpf);

    public List<T> findAll();

    public void update(T client);

    public void remove(K cpf);

}
