package pl.kosinski.acaa_dao.Company;

public interface CompanyRepository {

    CompanyDao saveCompany(CompanyDao companyDao);

    CompanyDao getCompany(long id);

    void deleteCompany(long id);

}
