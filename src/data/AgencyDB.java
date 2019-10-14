package data;

import com.google.gson.Gson;

public class AgencyDB {

    private Gson gson;
    private AgencyData agencyData;

    // Constructor
    public AgencyDB(AgencyData agencyData) {
        this.agencyData = agencyData;
    }

    public String getAgency(int agencyId) {

        gson = new Gson();
        String jsonData = this.agencyData.getAgent(agencyId);
        System.out.println("jsonData: " + jsonData);
        return gson.fromJson(jsonData, Agency.class);
    }
}
