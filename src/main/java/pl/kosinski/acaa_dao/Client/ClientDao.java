package pl.kosinski.acaa_dao.Client;

import pl.kosinski.acaa_model.Address.Address;

public class ClientDao {

    private final long id;
    private String name;
    private long addressId;

    ClientDao (long id, String name, long addressId) {
        this.id = id;
        this.name = name;
        this.addressId = addressId;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public long getAddressId() {
        return addressId;
    }
}
