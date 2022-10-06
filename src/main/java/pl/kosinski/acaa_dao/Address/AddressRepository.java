package pl.kosinski.acaa_dao.Address;

public interface AddressRepository {

    AddressDao saveAddress(AddressDao addressDao);

    AddressDao getAddress(long id);

    void deleteAddress(long id);

}
