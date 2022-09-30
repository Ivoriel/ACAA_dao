package pl.kosinski.acaa_dao.Client;

import org.springframework.stereotype.Component;

/**
 * The purpose of this class is to operate as a mock db during development.
 */

@Component
public class ClientRepositoryMock implements ClientRepository {

    @Override
    public ClientDao getClient(long id) {
        return null;
    }

}
