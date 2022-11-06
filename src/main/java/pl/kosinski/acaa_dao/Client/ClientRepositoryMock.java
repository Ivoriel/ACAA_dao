package pl.kosinski.acaa_dao.Client;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.concurrent.ThreadLocalRandom;

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
        ClientDao dao = new ClientDao(id, generateName(), generateAddress());
        return dao;
    }

    private String generateName() {
        StringBuilder name = new StringBuilder();

        String[] firstNames = {"Stanisław", "Eustachy", "Janusz", "Maria", "Chryzostom", "Kunegunda", "Genowefa", "Alicja",
                "Justyna", "Grzegorz", "Andrzej", "Anna"};
        name.append(firstNames[generateRandomInt(0, firstNames.length - 1)]);

        String[] lastNames = {"Pędziwiatr", "Krzyżtopór", "Zagłoba", "Makarow", "Kowal", "Anioł", "Kosa", "Młot", "Nowak",
                "żak", "Anonim", "Kot", "Lasek"};
        name.append(lastNames[generateRandomInt(0, lastNames.length - 1)]);

        return name.toString();
    }

    private int generateRandomInt(int min, int max) {
        return ThreadLocalRandom.current().nextInt(min, max +1);
    }

}
