package pl.kosinski.acaa_dao.Company;

import pl.kosinski.acaa_model.Address.Address;
import pl.kosinski.acaa_model.Client.Client;

public class CompanyDao {

    private final long id;
    private String name;
    private long clientId;
    private long addressId;

    public CompanyDao(long id, String name, long clientId, long addressId) {
        this.id = id;
        this.name = name;
        this.clientId = clientId;
        this.addressId = addressId;
    }

    public CompanyDao edit(String name, long clientId, long addressId)

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public long getClient() {
        return clientId;
    }

    public long getAddressId() {
        return addressId;
    }
}
