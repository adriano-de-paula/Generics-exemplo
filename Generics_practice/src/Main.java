import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        ClientDAO dao = new ClientDAO();

        dao.insert(new Client("111.111.111-11", "Ademir",
                LocalDate.of(1968,4,20), "(16)99111-1111"));

        dao.insert(new Client("222.222.222-22", "Francisco",
                LocalDate.of(1988,6,25), "(16)99222-2222"));

        dao.insert(new Client("333.333.333-33", "Joana",
                LocalDate.of(1970,10,24), "(16)99333-3333"));

        dao.insert(new Client("444.444.444-44", "Clotilde",
                LocalDate.of(1982,8,05), "(16)99444-4444"));

        dao.insert(new Client("555.555.555-55", "Raul",
                LocalDate.of(1992,5,19), "(16)99555-5555"));

        //System.out.println(dao.findOne("111.111.111-11"));

        for (Client client : dao.findAll()){
            System.out.println(client);
        }

        System.out.println("---------------------------------------------------------------------------------------------");

        //Clotilde acha o nome dela feio e pediu para mudar de nome.
        dao.update(new Client("444.444.444-44", "Claudia",
                LocalDate.of(1982,8,05), "(16)99444-4444"));

        //Raul mudou de número de telefone
        dao.update(new Client("555.555.555-55", "Raul",
                LocalDate.of(1992,5,19), "(16)99595-9559"));

        dao.remove("222.222.222-22");

        for (Client client : dao.findAll()){
            System.out.println(client);
        }

    }
}
