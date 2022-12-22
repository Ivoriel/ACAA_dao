package pl.kosinski.acaa_dao.Client;

import pl.kosinski.acaa_dao.Common.BaseRepository;

import java.util.Optional;

public interface ClientRepository extends BaseRepository {

    ClientDao save(ClientDao clientDao);

    Optional<ClientDao> get(long id);

    ClientDao generate();

}
