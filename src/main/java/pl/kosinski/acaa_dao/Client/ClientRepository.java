package pl.kosinski.acaa_dao.Client;

import pl.kosinski.acaa_dao.Common.BaseRepository;

public interface ClientRepository extends BaseRepository {

    ClientDao save(ClientDao clientDao);

    ClientDao get(long id);

    ClientDao generate();

}
