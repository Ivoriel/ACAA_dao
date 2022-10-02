package pl.kosinski.acaa_dao.Company;

import pl.kosinski.acaa_model.Address.Address;
import pl.kosinski.acaa_model.Client.Client;

public class CompanyDao {

    private long id;
    private String name;
    private Client client;
    private Address address;

    CompanyDao(long id, String name, Client client, Address address) {
        this.id = id;
        this.name = name;
        this.client = client;
        this.address = address;
    }

}
