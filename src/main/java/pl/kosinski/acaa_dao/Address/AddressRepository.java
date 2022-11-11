package pl.kosinski.acaa_dao.Address;

import pl.kosinski.acaa_dto.AddressDto;

import java.util.Optional;

public interface AddressRepository {

    AddressDao save(AddressDao addressDao);

    Optional<AddressDao> get(long id);

    void delete(long id);

    int size();

    AddressDto generate();

}
