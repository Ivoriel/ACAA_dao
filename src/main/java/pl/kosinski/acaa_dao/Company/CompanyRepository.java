package pl.kosinski.acaa_dao.Company;

import pl.kosinski.acaa_dao.Common.BaseRepository;

import java.util.Optional;

public interface CompanyRepository extends BaseRepository {

    CompanyDao save(CompanyDao companyDao);

    Optional<CompanyDao> get(long id);

    void delete(long id);

    int size();
}
