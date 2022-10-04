package pl.kosinski.acaa_dao.Address;

public interface AddressRepository {

    AddressDao getAddress(long id);

    void deleteAddress(long id);

}
