package pl.kosinski.acaa_dao.Company;

import pl.kosinski.acaa_model.Address.Address;
import pl.kosinski.acaa_model.Client.Client;

public class CompanyDao {

    private final long id;
    private String name;
    private Client client;
    private long addressId;

    CompanyDao(long id, String name, Client client, long addressId) {
        this.id = id;
        this.name = name;
        this.client = client;
        this.addressId = addressId;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Client getClient() {
        return client;
    }

    public long getAddressId() {
        return addressId;
    }
}
