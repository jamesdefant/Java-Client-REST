package data.dummy;

public class Package_Product_SupplierData implements data.Package_Product_SupplierData {
    @Override
    public String getAllPackage_Product_Suppliers() {

        return "[{\"packageId\":1,\"productSupplierId\":65},{\"packageId\":1,\"productSupplierId\":65},{\"packageId\":2,\"productSupplierId\":32},{\"packageId\":2,\"productSupplierId\":32},{\"packageId\":2,\"productSupplierId\":32},{\"packageId\":3,\"productSupplierId\":28},{\"packageId\":3,\"productSupplierId\":28},{\"packageId\":3,\"productSupplierId\":28},{\"packageId\":4,\"productSupplierId\":9},{\"packageId\":4,\"productSupplierId\":9},{\"packageId\":4,\"productSupplierId\":9}]";
    }

    @Override
    public String insertPackage_Product_Supplier(String jsonData) {

        return "{\"packageId\":1,\"productSupplierId\":65}";
    }

    @Override
    public String updatePackage_Product_Supplier(String jsonData) {
        return "INSERT on \n" + jsonData + "\n...attemtped.\nMethod not yet implemented";
    }

    @Override
    public String deletePackage_Product_Supplier(int packageId, int product_SupplierId) {
        return "DELETE on \n" + packageId + " / " + product_SupplierId + "\n...attemtped.\nMethod not yet implemented";
    }
}
