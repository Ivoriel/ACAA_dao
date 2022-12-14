package pl.kosinski.acaa_dao.Company;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import pl.kosinski.acaa_dao.Address.AddressRepository;
import pl.kosinski.acaa_dao.Client.ClientRepository;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Optional;
import java.util.concurrent.ThreadLocalRandom;

/**
 * The purpose of this class is to operate as a mock db during development.
 */

@Component
@AllArgsConstructor
public class CompanyRepositoryMock implements CompanyRepository{

    HashMap CompanyDb;
    AddressRepository addressRepository;
    ClientRepository clientRepository;


    @PostConstruct
    public void init() {
        populateCompanyDb();
    }

    @Override
    public CompanyDao save(CompanyDao companyDao) {
        CompanyDb.put(companyDao.getId(), companyDao);
        return companyDao;
    }

    @Override
    public Optional<CompanyDao> get(long id) {
        return Optional.ofNullable((CompanyDao) CompanyDb.get(id));
    }

    @Override
    public void delete(long id) {
        CompanyDb.remove(id);
    }

    private void populateCompanyDb() {
        for (long i = 1; i < 10; i++) {
            CompanyDb.put(i, generateCompany(i));
        }
    }

    private CompanyDao generateCompany(long id) {
        CompanyDao dao = new CompanyDao(id, generateCompanyName(), clientRepository.generate().getId(),
                addressRepository.generate().getId());
        return dao;
    }

    private String generateCompanyName() {
        String[] names = {"Januszex Janusz Typowy", "PolExport sp. z o.o.", "BiznesEx s.c.", "PolBiznes SA",
                "ExKosmos s.j.", "Mydło i Powidło Jan Nowak", "Warzywa i owoca Ewelina Bluszcz", "PHU Kliper s.c.",
                "Story-Train Bill Smith", "Gilgamesh sp. z o.o.", "Enkidu SA", "HusariaPol Marian Kmieć"};
        return names[generateRandomInt(0, names.length - 1)];
    }

    private int generateRandomInt(int min, int max) {
        return ThreadLocalRandom.current().nextInt(min, max +1);
    }

}
