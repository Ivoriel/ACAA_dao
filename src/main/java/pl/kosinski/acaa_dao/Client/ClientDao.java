package pl.kosinski.acaa_dao.Client;

import pl.kosinski.acaa_dao.Common.BaseDao;

public class ClientDao extends BaseDao {

    private final long id;
    private String name;
    private long addressId;

    public ClientDao (long id, String name, long addressId) {
        this.id = id;
        this.name = name;
        this.addressId = addressId;
    }

    public ClientDao edit(String name, long addressId) {
        this.name = name;
        this.addressId = addressId;
        return this;
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
