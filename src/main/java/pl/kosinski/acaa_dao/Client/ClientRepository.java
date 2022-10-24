package pl.kosinski.acaa_dao.Client;

public interface ClientRepository {

    ClientDao saveClient(ClientDao clientDao);

    ClientDao getClient(long id);

}
