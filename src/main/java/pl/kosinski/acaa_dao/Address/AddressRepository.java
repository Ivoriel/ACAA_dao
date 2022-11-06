package pl.kosinski.acaa_dao.Address;

import pl.kosinski.acaa_dto.AddressDto;

import java.util.Optional;

public interface AddressRepository {

    AddressDao saveAddress(AddressDao addressDao);

    Optional<AddressDao> getAddress(long id);

    void deleteAddress(long id);

    int size();

    AddressDto generate();

}
