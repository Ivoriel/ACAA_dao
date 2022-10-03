package pl.kosinski.acaa_dao.Address;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

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

    private String generateCountry() {
        return "Polska";
    }

    private String generateMunicipality() {
        String[] municipalities = {"Toruń", "Płock", "Lubicz", "Warszawa", "Sosnowiec", "Ostrołęka", "Żywiec", "Modlin",
                                    "Inowrocław", "Głogowo"};
        return municipalities[generateRandomInt(0, municipalities.length - 1)];
    }

    private String generateRegion() {
        String[] regions = {"Kujawsko-Pomorskie", "Mazowieckie", "Śląskie"};
        return regions[generateRandomInt(0, regions.length - 1)];
    }

    private String generateZipCode() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 6; i++) {
            if (i == 2) {
                sb.append("-");
            } else {
                sb.append(generateRandomInt(0, 9));
            }
        }
        return sb.toString();
    }



    private int generateRandomInt(int min, int max) {
        return ThreadLocalRandom.current().nextInt(min, max +1);
    }

}
