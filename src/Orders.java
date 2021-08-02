import java.util.Date;

public class Orders {
    private int orderId;
    private int orderTrackingNumber;
    private boolean activeStatus;
    private Date date;

    int idx;

    public Date getDate() {
        return date;
    }

    public int getOrderId() {
        return orderId;
    }

    public int getOrderTrackingNumber() {
        return orderTrackingNumber;
    }

    public boolean isActiveStatus() {
        return activeStatus;
    }

    public boolean orderActive() {
        return true;
    }

    public boolean orderDeactive() {
        return false;
    }

    public Orders(int id, int trackingNumber, boolean active) {

        this.orderId = id;
        this.orderTrackingNumber = trackingNumber;
        this.activeStatus = active;

    }


}
