public class Vendor {
    private int vendorId;
    private String vendorName;
    private Product[] product = new Product[100];

    public int getVendorId(){
        return vendorId;
    }
    public String getVendorName(){
        return vendorName;
    }


    public void getVendorAddress(String streetName, int blockNo, String district, String town, String state, String country) {
        StringBuilder address = new StringBuilder();
        address.append(streetName)
                .append(", block number " + blockNo)
                .append(town + ", Town ")
                .append(district + ", ")
                .append(state + ", State ")
                .append(country);
        System.out.println(address);
    }










}
