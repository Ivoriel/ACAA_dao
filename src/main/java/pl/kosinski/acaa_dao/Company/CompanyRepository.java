package pl.kosinski.acaa_dao.Company;

public interface CompanyRepository {

    CompanyDao save(CompanyDao companyDao);

    CompanyDao get(long id);

    void delete(long id);

}
