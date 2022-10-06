package pl.kosinski.acaa_dao.Client;

import pl.kosinski.acaa_model.Address.Address;

public class ClientDao {

    private final long id;
    private String name;
    private Address address;

    ClientDao (long id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }
}
