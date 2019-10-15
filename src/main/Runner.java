package main;

import data.AgencyDB;
import data.AgentDB;
import data.AgentData;
import data.CustomerDB;
import model.Agent;

enum Tables {
    AGENT,
    AGENCY,
    CUSTOMER
}
/**
 * Testing class
 */
public class Runner {

    // Change the table to test
    private static Tables table = Tables.CUSTOMER;

    // Change the datasource from DummyData to REST API
    private static DataSources src = DataSources.DUMMY;

    // Change the request that you're passing to the server
    private static Requests rqst = Requests.GETALL;


    public static void main(String[] args) {


        switch(table) {
            case AGENT:
                testAgentTable();
                break;

            case AGENCY:
                testAgencyTable();
                break;

            case CUSTOMER:
                testCustomerTable();
                break;
        }
    }

    private static void testAgentTable() {

        AgentDB db = null;

        switch (src) {
            case DUMMY:
                db = new AgentDB(new data.dummy.AgentData());
                break;

            case REST:
                db = new AgentDB(new data.REST.AgentData());
                break;
        }

        if (db != null) {

            System.out.println("-----------------" + src.toString() + "-----------------");
            System.out.println("-----------------" + rqst.toString() + "-----------------");

            switch (rqst) {

                case GET:
                    System.out.println(db.getAgent(1));
                    break;

                case GETALL:
                    System.out.println(db.getAgentList());
                    break;

                case INSERT:
                    System.out.println(db.insertAgent(db.getAgent(1)));
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
    private static void testAgencyTable() {

        AgencyDB db = null;

        switch(src) {
            case DUMMY:
                db = new AgencyDB(new data.dummy.AgencyData());
                break;

            case REST:
                db = new AgencyDB(new data.REST.AgencyData());
                break;
        }

        if (db != null) {

            System.out.println("-----------------" + src.toString() + "-----------------");
            System.out.println("-----------------" + rqst.toString() + "-----------------");

            switch (rqst) {

                case GET:
                    System.out.println(db.getAgency(1));
                    break;

//                case GETALL:
//                    System.out.println(db.getAgencyList());
//                    break;
//
//                case INSERT:
//                    System.out.println(db.insertAgency(db.getAgency(1)));
//                    break;
//
//                case UPDATE:
//                    Agent agent = db.getAgency(2);
//                    agent.setAgtFirstName("James");
//
//                    System.out.println(db.updateAgency(agent));
//                    break;
//
//                case DELETE:
//                    System.out.println(db.deleteAgency(2));
//                    break;
            }
        }
    }
    private static void testCustomerTable() {

        CustomerDB db = null;

        switch(src) {
            case DUMMY:
                db = new CustomerDB(new data.dummy.CustomerData());
                break;

            case REST:
                db = new CustomerDB(new data.REST.CustomerData());
                break;
        }

        if (db != null) {

            System.out.println("-----------------" + src.toString() + "-----------------");
            System.out.println("-----------------" + rqst.toString() + "-----------------");

            switch (rqst) {

                case GET:
                    System.out.println(db.getCustomer(1));
                    break;

                case GETALL:
                    System.out.println(db.getCustomerList());
                    break;

//                case INSERT:
//                    System.out.println(db.insertAgency(db.getAgency(1)));
//                    break;
//
//                case UPDATE:
//                    Agent agent = db.getAgency(2);
//                    agent.setAgtFirstName("James");
//
//                    System.out.println(db.updateAgency(agent));
//                    break;
//
//                case DELETE:
//                    System.out.println(db.deleteAgency(2));
//                    break;
            }
        }
    }

}
