package data.REST;


import model.Agent;
import rest.API;

public class AgentData implements data.AgentData {

    @Override
    public String getAgent(int agentId) {

        // Call the API
        return API.getJson(Constants.URL + "/agent/getagent/" + agentId);
    }

    @Override
    public String getAllAgents() {

        // Call the API
        return API.getJson(Constants.URL + "/agent/getallagents/");
    }

    @Override
    public String insertAgent(String jsonData) {

        // Send data to the API and return message
        return API.putJson(Constants.URL + "/agent/putagent", jsonData);
    }

    @Override
    public String updateAgent(String jsonData) {

        // Send data to the API and return message
        return API.postJson(Constants.URL + "/agent/postagent", jsonData);
    }

    @Override
    public String deleteAgent(int agentId) {

        // Send data to the API and return message
        return API.deleteJson(Constants.URL + "/agent/deleteagent/" + agentId);
    }


}
