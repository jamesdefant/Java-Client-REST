package main;

import data.AgentDB;
import data.AgentData;
import model.Agent;

// Types of data sources
enum DataSource {
    DUMMY,
    REST
}

// Types of Requests
enum Request {
    GET,
    GETALL,
    INSERT,
    UPDATE,
    DELETE
}

/**
 * Testing class
 */
public class Runner {

    // Change the datasource from DummyData to REST API
    private static DataSource src = DataSource.REST;

    // Change the request that you're passing to the server
    private static Request rqst = Request.DELETE;


    public static void main(String[] args) {

        AgentData dataSrc = null;

        switch(src) {
            case DUMMY:
                dataSrc = new data.dummy.AgentData();
                break;

            case REST:
                dataSrc = new data.REST.AgentData();
                break;
        }

        if (dataSrc != null) {

            System.out.println("-----------------" + src.toString() + "-----------------");
            System.out.println("-----------------" + rqst.toString() + "-----------------");

            AgentDB db = new AgentDB(dataSrc);

            switch(rqst) {

                case GET:
                    System.out.println(db.getAgent(1));
                break;

                case GETALL:
                    System.out.println(db.getAgentList());
                    break;

                case INSERT:
                    System.out.println(db.insertAgent(db.getAgent(2)));
                    break;

                case UPDATE:
                    Agent agent = db.getAgent(2);
                    agent.setAgtFirstName("James");

                    System.out.println(db.updateAgent(agent));
                    break;

                case DELETE:
                    System.out.println(db.deleteAgent(2));
                    break;
            }
        }
    }
}
