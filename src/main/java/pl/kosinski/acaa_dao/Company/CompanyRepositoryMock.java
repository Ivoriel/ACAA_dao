package pl.kosinski.acaa_dao.Company;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.HashMap;

/**
 * The purpose of this class is to operate as a mock db during development.
 */

@Component
public class CompanyRepositoryMock implements CompanyRepository{

    HashMap CompanyDb;

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
        CompanyDao dao = new CompanyDao(id, generateCompanyName(), getClient(id), generateAddress(id));
        return dao;
    }

}
