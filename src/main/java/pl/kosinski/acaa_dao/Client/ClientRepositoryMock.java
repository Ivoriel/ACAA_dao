package pl.kosinski.acaa_dao.Client;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.HashMap;

/**
 * The purpose of this class is to operate as a mock db during development.
 */

@Component
public class ClientRepositoryMock implements ClientRepository {

    HashMap ClientDb;

    @PostConstruct
    public void init() {
        populateClientDb();
    }

    @Override
    public ClientDao saveClient(ClientDao clientDao) {
        return null;
    }

    @Override
    public ClientDao getClient(long id) {
        return null;
    }

    private void populateClientDb() {
        for (long i = 1; i < 10; i++) {
            generateClient(i);
        }
    }

    private ClientDao generateClient(long id) {
        ClientDao dao = new ClientDao(id, generateName(), genrateAddress());
        return dao;
    }

}
