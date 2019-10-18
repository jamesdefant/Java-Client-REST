package data.REST;

import rest.API;

public class PackageData implements data.PackageData {
    @Override
    public String getAllPackages() {

        // Call the API
        return API.getJson(Constants.URL + "/package/getallpackages");    }

    @Override
    public String updatePackage(String jsonData) {

        // Send data to the API and return message
        return API.postJson(Constants.URL + "/package/updatepackage", jsonData);    }
}
