package main;

import data.*;
import model.*;

enum Tables {
    AGENT,
    AGENCY,
    BOOKING,
    CUSTOMER,
    CUSTOMER_REWARDS,
    PACKAGE,
    PACKAGE_PRODUCT_SUPPLIER,
    PRODUCT,
    PRODUCT_SUPPLIER,
    REWARD,
    SUPPLIER,
    TRIPTYPES
}
/**
 * Testing class
 */
public class Runner {

    // Change the table to test
    private static Tables table = Tables.SUPPLIER;

    // Change the datasource from DummyData to REST API
    private static DataSources src = DataSources.REST;

    // Change the request that you're passing to the server
    private static Requests rqst = Requests.UPDATE;

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
            case PACKAGE:
                testPackageTable();
                break;
            case PACKAGE_PRODUCT_SUPPLIER:
                testPackageProductSupplierTable();
                break;
            case PRODUCT:
                testProductTable();
                break;
            case PRODUCT_SUPPLIER:
                testProductSupplierTable();
                break;
            case REWARD:
                testRewardsTable();
                break;
            case SUPPLIER:
                testSupplierTable();
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
                    System.out.println(db.getBooking(11));
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
                    System.out.println(db.getCustomer(104));
                    break;

                case GETALL:
                    System.out.println(db.getCustomerList());
                    break;

                case INSERT:
                    System.out.println(db.insertCustomer(db.getCustomer(104)));
                    break;

                case UPDATE:
                    Customer oldCust = db.getCustomer(104);
                    Customer newCust = db.getCustomer(104);
                    newCust.setCustFirstName("James");

                    System.out.println(db.updateAgent(oldCust, newCust));
                    break;

                case DELETE:
                    System.out.println(db.deleteCustomer(177));
                    break;
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
    private static void testPackageTable() {

        PackageDB db = null;

        switch(src) {
            case DUMMY:
                db = new PackageDB(new data.dummy.PackageData());
                break;
            case REST:
                db = new PackageDB(new data.REST.PackageData());
                break;
        }

        if (db != null) {

            System.out.println("-----------------" + src.toString() + "-----------------");
            System.out.println("-----------------" + rqst.toString() + "-----------------");

            switch (rqst) {

                case GET:
                    System.out.println(db.getPackage(1));
                    break;
                case GETALL:
                    System.out.println(db.getPackageList());
                    break;

                case INSERT:
                    model.Package pkg = db.getPackage(1);
                    System.out.println(pkg);

                    System.out.println(db.insertPackage(pkg));
                    break;

                case UPDATE:
                    model.Package oldPkg = db.getPackage(1);
                    model.Package newPkg = db.getPackage(1);
                    newPkg.setPkgName("Hallowween terrror!!!!");

                    System.out.println(db.updatePackage(oldPkg, newPkg));
                    break;

                case DELETE:
                    System.out.println(db.deletePackage(4));
                    break;
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
    private static void testProductTable() {

        ProductDB db = null;

        switch(src) {
            case DUMMY:
                db = new ProductDB(new data.dummy.ProductData());
                break;
            case REST:
                db = new ProductDB(new data.REST.ProductData());
                break;
        }

        if (db != null) {

            System.out.println("-----------------" + src.toString() + "-----------------");
            System.out.println("-----------------" + rqst.toString() + "-----------------");

            switch (rqst) {

                case GET:
                    System.out.println(db.getProduct(1));
                    break;
                case GETALL:
                    System.out.println(db.getProductList());
                    break;

                case INSERT:
                    Product prod = db.getProduct(1);

                    System.out.println(db.insertProduct(prod));
                    break;

                case UPDATE:
                    Product oldProd = db.getProduct(16);
                    Product newProd = db.getProduct(16);
                    newProd.setProdName("Airiest");

                    System.out.println(db.updateProduct(oldProd, newProd));
                    break;

                case DELETE:
                    System.out.println(db.deleteProduct(16));
                    break;
            }
        }
    }
    private static void testProductSupplierTable() {

        ProductSupplierDB db = null;

        switch(src) {
            case DUMMY:
                db = new ProductSupplierDB(new data.dummy.ProductSupplierData());
                break;
            case REST:
                db = new ProductSupplierDB(new data.REST.ProductSupplierData());
                break;
        }

        if (db != null) {

            System.out.println("-----------------" + src.toString() + "-----------------");
            System.out.println("-----------------" + rqst.toString() + "-----------------");

            switch (rqst) {

                case GET:
                    System.out.println(db.getProductSupplier(1));
                    break;
                case GETALL:
                    System.out.println(db.getProductSupplierList());
                    break;

                case INSERT:
                    ProductSupplier prodSup = db.getProductSupplier(1);

                    System.out.println(db.insertProductSupplier(prodSup));
                    break;

                case UPDATE:
                    ProductSupplier oldProd = db.getProductSupplier(1);
                    ProductSupplier newProd = db.getProductSupplier(1);
                    newProd.setProductId(8);

                    System.out.println(db.updateProductSupplier(oldProd, newProd));
                    break;

                case DELETE:
                    System.out.println(db.deleteProductSupplier(94));
                    break;
            }
        }
    }
    private static void testRewardsTable() {

        RewardDB db = null;

        switch(src) {
            case DUMMY:
                db = new RewardDB(new data.dummy.RewardData());
                break;
            case REST:
                db = new RewardDB(new data.REST.RewardData());
                break;
        }

        if (db != null) {

            System.out.println("-----------------" + src.toString() + "-----------------");
            System.out.println("-----------------" + rqst.toString() + "-----------------");

            switch (rqst) {

                case GET:
                    System.out.println(db.getReward(1));
                    break;
                case GETALL:
                    System.out.println(db.getRewardList());
                    break;

//                case INSERT:
//                    Supplier sup = new Supplier(1, "BRAND SPANKIN NEW");
//
//                    System.out.println(db.insertSupplier(sup));
//                    break;
//
//                case UPDATE:
//                    Supplier oldSup = db.getSupplier(69);
//                    Supplier newSup = db.getSupplier(69);
//                    newSup.setSupName("NEW NEW NEW CONCEPT");
//
//                    System.out.println(db.updateSupplier(oldSup, newSup));
//                    break;
//
//                case DELETE:
//                    System.out.println(db.deleteSupplier(13597));
//                    break;
            }
        }
    }
    private static void testSupplierTable() {

        SupplierDB db = null;

        switch(src) {
            case DUMMY:
                db = new SupplierDB(new data.dummy.SupplierData());
                break;
            case REST:
                db = new SupplierDB(new data.REST.SupplierData());
                break;
        }

        if (db != null) {

            System.out.println("-----------------" + src.toString() + "-----------------");
            System.out.println("-----------------" + rqst.toString() + "-----------------");

            switch (rqst) {

                case GET:
                    System.out.println(db.getSupplier(69));
                    break;
                case GETALL:
                    System.out.println(db.getSupplierList());
                    break;

                case INSERT:
                    Supplier sup = new Supplier(1, "BRAND SPANKIN NEW");

                    System.out.println(db.insertSupplier(sup));
                    break;

                case UPDATE:
                    Supplier oldSup = db.getSupplier(69);
                    Supplier newSup = db.getSupplier(69);
                    newSup.setSupName("NEW NEW NEW CONCEPT");

                    System.out.println(db.updateSupplier(oldSup, newSup));
                    break;

                case DELETE:
                    System.out.println(db.deleteSupplier(13597));
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
