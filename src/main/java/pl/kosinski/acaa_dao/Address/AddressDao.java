package pl.kosinski.acaa_dao.Address;

public class AddressDao {
    
    private final long id;
    private String country;
    private String municipality;
    private String region;
    private String zipCode;
    private String street;
    private String buildingNumber;
    private String additionalIdentifier;

    AddressDao(long id, String country, String municipality, String region, String zipCode, String street,
               String buildingNumber, String additionalIdentifier) {
        this.id = id;
        this.country = country;
        this.municipality = municipality;
        this.region = region;
        this.zipCode = zipCode;
        this.street = street;
        this.buildingNumber = buildingNumber;
        this.additionalIdentifier = additionalIdentifier;
    }

    public long getId() {
        return id;
    }

    public String getCountry() {
        return country;
    }

    public String getMunicipality() {
        return municipality;
    }

    public String getRegion() {
        return region;
    }

    public String getZipCode() {
        return zipCode;
    }

    public String getStreet() {
        return street;
    }

    public String getBuildingNumber() {
        return buildingNumber;
    }

    public String getAdditionalIdentifier() {
        return additionalIdentifier;
    }
}
