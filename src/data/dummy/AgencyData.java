package data.dummy;

public class AgencyData implements data.AgencyData {

    @Override
    public String getAgency(int agentId) {

        return "{\"agencyId\":1,\"agncyAddress\":\"1155 8th Ave SW\",\"agncyCity\":\"Calgary\",\"agncyCountry\":\"Canada\",\"agncyFax\":\"4032719872\",\"agncyPhone\":\"4032719873\",\"agncyPostal\":\"T2P1N3\",\"agncyProv\":\"AB\"}";
    }

    @Override
    public String getAllAgencies() {
        return "[{\"agencyId\":1,\"agncyAddress\":\"1155 8th Ave SW\",\"agncyCity\":\"Calgary\",\"agncyCountry\":\"Canada\",\"agncyFax\":\"4032719872\",\"agncyPhone\":\"4032719873\",\"agncyPostal\":\"T2P1N3\",\"agncyProv\":\"AB\"},{\"agencyId\":2,\"agncyAddress\":\"110 Main Street\",\"agncyCity\":\"Okotoks\",\"agncyCountry\":\"Canada\",\"agncyFax\":\"4035632382\",\"agncyPhone\":\"4035632381\",\"agncyPostal\":\"T7R3J5\",\"agncyProv\":\"AB\"}]";
    }
}