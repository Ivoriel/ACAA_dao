package pl.kosinski.acaa_dao.Address;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.HashMap;

/**
 * The purpose of this class is to operate as a mock db during development.
 */

@Component
public class AddressRepositoryMock implements AddressRepository{

    HashMap AddressDb;

    @PostConstruct
    public void init() {
        populateAddressDb();
    }

    private void populateAddressDb(){
        for (long i = 1; i < 10; i++) {
            generateAddress(i);
        }
    }

    private AddressDao generateAddress(long id) {
        AddressDao dao = new AddressDao(id, generateCountry(), generateMunicipality(), generateRegion(), generateZipCode(),
                generateStreet(), generateBuildingNumber(), generateAdditionalIdentifier());
        return dao;
    }

}
