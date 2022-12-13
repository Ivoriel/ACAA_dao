package pl.kosinski.acaa_dao.Company;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import pl.kosinski.acaa_dao.Address.AddressRepository;
import pl.kosinski.acaa_dao.Client.ClientRepository;

import javax.annotation.PostConstruct;
import java.util.HashMap;
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
        return null;
    }

    @Override
    public CompanyDao get(long id) {
        return null;
    }

    @Override
    public void delete(long id) {

    }

    private void populateCompanyDb() {
        for (long i = 1; i < 10; i++) {
            CompanyDb.put(i, generateCompany(i));
        }
    }

    private CompanyDao generateCompany(long id) {
        CompanyDao dao = new CompanyDao(id, generateCompanyName(), clientRepository.generate(), addressRepository.generate());
        return dao;
    }

    private String generateCompanyName() {

    }

    private int generateRandomInt(int min, int max) {
        return ThreadLocalRandom.current().nextInt(min, max +1);
    }

}
