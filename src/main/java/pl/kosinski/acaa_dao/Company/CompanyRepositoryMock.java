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
    public CompanyDao getCompany(long id) {
        return null;
    }

    private void populateCompanyDb() {
        for (long i = 0; i < 9; i++) {
            CompanyDb.put(i, generateCompany(i));
        }
    }

    private CompanyDao generateCompany(long id) {
        CompanyDao dao = new CompanyDao();
        return dao;
    }

}
