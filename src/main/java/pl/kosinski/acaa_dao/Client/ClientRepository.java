package pl.kosinski.acaa_dao.Client;

public interface ClientRepository {

    ClientDao save(ClientDao clientDao);

    ClientDao get(long id);

}
