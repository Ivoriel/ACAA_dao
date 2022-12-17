package pl.kosinski.acaa_dao.Company;

import pl.kosinski.acaa_dao.Common.BaseRepository;

public interface CompanyRepository extends BaseRepository {

    CompanyDao save(CompanyDao companyDao);

    CompanyDao get(long id);

    void delete(long id);

}
