package main;

import data.*;
import model.Agent;
import model.Package_Product_Supplier;

enum Tables {
    AGENT,
    AGENCY,
    BOOKING,
    CUSTOMER,
    CUSTOMER_REWARDS,
    PACKAGE_PRODUCT_SUPPLIER,
    TRIPTYPES
}
/**
 * Testing class
 */
public class Runner {

    // Change the table to test
    private static Tables table = Tables.TRIPTYPES;

    // Change the datasource from DummyData to REST API
    private static DataSources src = DataSources.REST;

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
            case BOOKING:
                testBookingTable();
                break;
            case CUSTOMER:
                testCustomerTable();
                break;
            case CUSTOMER_REWARDS:
                testCustomer_rewardsTable();
                break;
            case PACKAGE_PRODUCT_SUPPLIER:
                testPackageProductSupplierTable();
                break;
            case TRIPTYPES:
                testTripTypeTable();
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
                    Agent oldAgent = db.getAgent(2);
                    Agent newAgent = db.getAgent(2);
                    newAgent.setAgtFirstName("James");
                    System.out.println(db.updateAgent(oldAgent, newAgent));
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
                case GETALL:
                    System.out.println(db.getAgencyList());
                    break;
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
    private static void testBookingTable() {

        BookingDB db = null;

        switch(src) {
            case DUMMY:
                db = new BookingDB(new data.dummy.BookingData());
                break;
            case REST:
                db = new BookingDB(new data.REST.BookingData());
                break;
        }

        if (db != null) {

            System.out.println("-----------------" + src.toString() + "-----------------");
            System.out.println("-----------------" + rqst.toString() + "-----------------");

            switch (rqst) {

                case GET:
                    System.out.println(db.getBooking(1));
                    break;
                case GETALL:
                    System.out.println(db.getBookingList());
                    break;
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
    private static void testCustomer_rewardsTable() {

        Customer_rewardsDB db = null;

        switch(src) {
            case DUMMY:
                db = new Customer_rewardsDB(new data.dummy.Customer_rewardsData());
                break;
            case REST:
                db = new Customer_rewardsDB(new data.REST.Customer_rewardsData());
                break;
        }

        if (db != null) {

            System.out.println("-----------------" + src.toString() + "-----------------");
            System.out.println("-----------------" + rqst.toString() + "-----------------");

            switch (rqst) {

                case GET:
                    System.out.println(db.getCustomer_rewards(1));
                    break;
                case GETALL:
                    System.out.println(db.getCustomer_rewardsList());
                    break;
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
    private static void testPackageProductSupplierTable() {

        Package_Product_SupplierDB db = null;

        switch(src) {
            case DUMMY:
                db = new Package_Product_SupplierDB(new data.dummy.Package_Product_SupplierData());
                break;
            case REST:
                db = new Package_Product_SupplierDB(new data.REST.Package_Product_SupplierData());
                break;
        }

        if (db != null) {

            System.out.println("-----------------" + src.toString() + "-----------------");
            System.out.println("-----------------" + rqst.toString() + "-----------------");

            switch (rqst) {

                case GET:
//                    System.out.println(db.getCustomer_rewards(1));
                    break;
                case GETALL:
                    System.out.println(db.getPackage_Product_SupplierList());
                    break;

                case INSERT:
                    Package_Product_Supplier pps = new Package_Product_Supplier(4, 31);

                    System.out.println(db.insertPackage_Product_Supplier(pps));
                    break;

                case UPDATE:
//                    Agent agent = db.getAgency(2);
//                    agent.setAgtFirstName("James");
//
//                    System.out.println(db.updatePackage_Product_Supplier(agent));
                    break;

                case DELETE:
                    System.out.println(db.deletePackage_Product_Supplier(4, 31));
                    break;
            }
        }
    }
    private static void testTripTypeTable() {

        TripTypeDB db = null;

        switch(src) {
            case DUMMY:
                db = new TripTypeDB(new data.dummy.TripTypeData());
                break;
            case REST:
                db = new TripTypeDB(new data.REST.TripTypeData());
                break;
        }

        if (db != null) {

            System.out.println("-----------------" + src.toString() + "-----------------");
            System.out.println("-----------------" + rqst.toString() + "-----------------");

            switch (rqst) {

                case GET:
                    System.out.println(db.getTripType("B"));
                    break;
                case GETALL:
                    System.out.println(db.getTripTypeList());
                    break;

//                case INSERT:
//                    Package_Product_Supplier pps = new Package_Product_Supplier(4, 31);
//
//                    System.out.println(db.insertPackage_Product_Supplier(pps));
//                    break;
//
//                case UPDATE:
////                    Agent agent = db.getAgency(2);
////                    agent.setAgtFirstName("James");
////
////                    System.out.println(db.updatePackage_Product_Supplier(agent));
//                    break;
//
//                case DELETE:
//                    System.out.println(db.deletePackage_Product_Supplier(4, 31));
//                    break;
            }
        }
    }

}
