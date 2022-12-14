package pl.kosinski.acaa_dao.Address;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import pl.kosinski.acaa_dto.AddressDto;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Optional;
import java.util.concurrent.ThreadLocalRandom;

/**
 * The purpose of this class is to operate as a mock db during development.
 */

@Component
@AllArgsConstructor
public class AddressRepositoryMock implements AddressRepository{

    HashMap AddressDb;

    @PostConstruct
    public void init() {
        populateAddressDb();
    }

    @Override
    public AddressDao save(AddressDao addressDao) {
        AddressDb.put(addressDao.getId(), addressDao);
        return addressDao;
    }

    @Override
    public Optional<AddressDao> get(long id) {
        return Optional.of((AddressDao) AddressDb.get(id));
    }

    @Override
    public void delete(long id) {
        AddressDb.remove(id);
    }

    @Override
    public int size() {
        return AddressDb.size();
    }

    private void populateAddressDb(){
        for (long i = 1; i < 10; i++) {
            save(generate(i));
        }
    }

    public AddressDto generate() {
        AddressDto generated = new AddressDto();
        generated.setCountry(generateCountry());
        generated.setMunicipality(generateMunicipality());
        generated.setRegion(generateRegion());
        generated.setZipCode(generateZipCode());
        generated.setStreet(generateStreet());
        generated.setBuildingNumber(generateBuildingNumber());
        generated.setAdditionalIdentifier(generateAdditionalIdentifier());
        return generated;
    }

    private AddressDao generate(long id) {
        return new AddressDao(id, generateCountry(), generateMunicipality(), generateRegion(), generateZipCode(),
                generateStreet(), generateBuildingNumber(), generateAdditionalIdentifier());
    }

    private String generateCountry() {
        return "Polska";
    }

    private String generateMunicipality() {
        String[] municipalities = {"Toru??", "P??ock", "Lubicz", "Warszawa", "Sosnowiec", "Ostro????ka", "??ywiec", "Modlin",
                                    "Inowroc??aw", "G??ogowo"};
        return municipalities[generateRandomInt(0, municipalities.length - 1)];
    }

    private String generateRegion() {
        String[] regions = {"Kujawsko-Pomorskie", "Mazowieckie", "??l??skie"};
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

    private String generateStreet() {
        String[] streets = {"Prosta", "Szeroka", "D??uga", "Mickiewicza", "Slowackiego", "Solidarno??ci", "Grodzka",
                            "Bohater??w Mariupola", "Wi??niowa", "Kochanowskiego", "Le??na"};
        return streets[generateRandomInt(0,9)];
    }

    private String generateBuildingNumber() {
        StringBuilder sb = new StringBuilder();
        int buildingNumber = generateRandomInt(1, 115);
        sb.append(buildingNumber);
        if (buildingNumber % 4 == 0 || buildingNumber % 7 == 0) {
            sb.append("A");
            return sb.toString();
        }
        if (buildingNumber % 9 == 0) {
            sb.append("B");
            return sb.toString();
        }
        return sb.toString();
    }

    private String generateAdditionalIdentifier() {
        StringBuilder sb = new StringBuilder();
        int additionalIdentifier = generateRandomInt(1, 156);
        sb.append(additionalIdentifier);
        if (additionalIdentifier % 7 == 0) {
            sb.append("Pi??tro 1");
            return sb.toString();
        }
        if (additionalIdentifier % 9 == 0) {
            sb.append("Pi??tro 3");
            return sb.toString();
        }
        return sb.toString();
    }

    private int generateRandomInt(int min, int max) {
        return ThreadLocalRandom.current().nextInt(min, max +1);
    }

}
