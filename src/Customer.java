public class Customer {
    private int customerId;
    private String customName;
    private boolean isRegular;
    Orders[] order = new Orders[10];

    // Getters for Fields
    public int getCustomerId() {
        return customerId;
    }

    public String getCustomName() {
        return customName;
    }

    public boolean getIsRegular() {
        return isRegular;
    }

    // methods

    public boolean isRegular() {
        return isRegular = true;
    }

    public boolean isNotRegular() {
        return isRegular = false;
    }

    public void getAddressDetails(String streetName, int blockNo, String district, String town, String state, String country) {
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